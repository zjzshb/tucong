var groupId;
var loginUserId;
var loginNikeName;
$(document).ready(function () {
	initUserInfo();
	getParam();
	initPhotoDetail();
	comment();
})

function getParam() {
	debugger;
	groupId=getQueryString("picGourpId");
}
function getQueryString(name) {
	var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
	var r = window.location.search.substr(1).match(reg);
	if(r!=null)return  unescape(r[2]); return null;
}
function initPhotoDetail() {
	param = {
		groupId:groupId
	}
	$.ajax({
		url:"getPhotoDetail", type:"post", data:JSON.stringify(param) , async:false, dataType:"json",contentType:"application/json", cache:false,
		success: function (data) {
			debugger;
			if (data.resultCode == "000000") {
				if(data.result != null){
					//添加地址
					for(var i =0;i<data.result.adress.length;i++) {
						$("#showPhotos").append("<div class=\"cell\" style=\"background: url('" + data.result.adress[i] + "') center/cover;\"></div>");
					}
					//添加用户名
					$("#nikeName").html(data.result.nikeName);
					$("#userId").html(data.result.userId);
					console.log($("#userId").html());
					//时间
					$("#picUpDate").html(data.result.picUpDate);
					//评论
					for(var i = 0 ;i<data.result.comments.length;i++){
						$("#comments").append("<a href=\"\">"+data.result.comments[i].nikeName +"</a><br><span>"+data.result.comments[i].commMain +"</span><br>");
					}


				}
			}else {
				alert("图片查询失败");
			}
		}
	});
}
function comment(){
	$("#yourword").on("click",function () {
		var commMain =$("#commentText").val();
		var param = {
			commMain:commMain,
			picGroupId:groupId
		}

		$.ajax({
			url:"insertComment", type:"post", data:JSON.stringify(param) , async:false, dataType:"json",contentType:"application/json", cache:false,
			success: function (data) {
				debugger;
				if (data.resultCode == "000000") {
					$("#comments").append("<a href=\"\">"+loginNikeName +"</a><br><span>"+data.result.commMain +"</span><br>");
					$("#commentText").val("");
				}else {
					alert(data.resultMessage);
				}
			}
		});
		
		
	})
}
function initUserInfo() {
	debugger;
	var param = {
		
	}
	$.ajax({
		url:"gerUserInfo", type:"post", data:JSON.stringify(param) , async:false, dataType:"json",contentType:"application/json", cache:false,
		success: function (data) {
			debugger;
			if (data.resultCode == "000000") {
				loginUserId = data.result.userId;
				loginNikeName =data.result.uNickname;
			}else {
				alert(data.resultMessage);
			}
		}
	});
	
}