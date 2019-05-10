/**
 * Created by John on 2019/5/9.
 */
var userId;
var labelName = "";
var labelId = "";
var pageNum = 0;
var pageSize = 10;
$(document).ready(function () {
    getParam();
    initUserInfo();
    initLabel();
    labelClick();
    qryPhoto();
    photoClick();
})
function labelClick() {
    $(".photolabel").on("click",function () {
        $("#showphoto").html("");
        labelName = $(this).html();
        labelId =  $(this).attr('id');
        pageNum = 0;
        qryPhoto();
        photoClick();
    })
}
function initLabel() {
    var param = {};
    $.ajax({
        url:"getLabelInfo", type:"post", data:param, async:false, dataType:"json", cache:false,
        success: function (data) {
            debugger;
            if (data.resultCode == "000000") {
                if(data.result.length!=0){
                    for (var i = 0 ;i<data.result.length;i++){
                        $("#selectphoto").append("<a class=\"photolabel\" id=\""+data.result[i].picLabelId+"\">"+data.result[i].picLabelName+"</a>");
                    }
                    labelName = data.result[0].picLabelName;
                }
            }else {
                alert("初始化标签失败");
            }
        }
    });
}
function initUserInfo() {
    var param = {
        userId:userId
    }
    $.ajax({
        url:"qryUserInfo", type:"post", data:JSON.stringify(param) , async:false, dataType:"json",contentType:"application/json", cache:false,
        success: function (data) {
            debugger;
            if (data.resultCode == "000000") {
                debugger;
                $("#userHead").css("background", "url(\'"+data.result.uBg+"\')");
                $("#userHead").css("background-size", "cover");
                $("#userInfo").append("<div class=\"personName\" style=\" font-size: 25px; margin-bottom: 10px;\" >"+data.result.uNickname+"</div> <div class=\"personButton\" style=\" margin-bottom: 7px;\">"+data.result.uAddress+" / 关注 "+data.result.followNum+" / 粉丝 "+data.result.fansNum+"</div> <div class=\"personProfile\" style=\" font-size: 10px;\">"+data.result.uDis+"</div>")
            }else {
                alert("初始化用户失败");
            }
        }
    });
}
function getParam() {
    debugger;
    userId=getQueryString("userId");
}
function getQueryString(name) {
    var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
    var r = window.location.search.substr(1).match(reg);
    if(r!=null)return  unescape(r[2]); return null;
}
function qryPhoto() {
    debugger;
    var start = pageNum * pageSize;
    var end = (pageNum+1)*pageSize;
    var param = {
        start:start,
        end:end,
        picLabelName:labelName,
        userId:userId
    }

    $.ajax({
        url:"qryPhotoByCondition", type:"post", data:JSON.stringify(param) , async:false, dataType:"json",contentType:"application/json", cache:false,
        success: function (data) {
            debugger;
            if (data.resultCode == "000000") {
                if(data.result.length!=0){
                    for (var i = 0 ;i<data.result.length;i++){
                        $("#showphoto").append("<div class=\"photo\" id=\""+data.result[i].picGroupId +"\"> <img src=\""+data.result[i].picAdress+"\" alt=\"失败\"/> <div class=\"photomes\" ><span>赞："+data.result[i].likeNum +"</span> <span>评论:"+data.result[i].commentNum +"</span> </div> </div>")
                    }
                }
            }else {
                alert("图片查询失败");
            }
        }
    });

}
function photoClick() {
    $(".photo").on("click",function () {
        // window.location ="PhotoDtail?picGourpId="+$(this).attr("id");
        window.open("PhotoDtail?picGourpId="+$(this).attr("id"));
    })
}