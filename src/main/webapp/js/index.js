var labelName = "";
var labelId = "";
var pageNum = 0;
var pageSize = 10;
$(document).ready(function () {
    initLabel();
    labelClick();
    qryPhoto();
    photoClick();
})

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
function qryPhoto() {
    debugger;
    var start = pageNum * pageSize;
    var end = (pageNum+1)*pageSize;
    var param = {
        start:start,
        end:end,
        picLabelName:labelName
    }

    $.ajax({
        url:"qryPhotoByCondition", type:"post", data:JSON.stringify(param) , async:false, dataType:"json",contentType:"application/json", cache:false,
        success: function (data) {
            debugger;
            if (data.resultCode == "000000") {
                if(data.result.length!=0){
                    for (var i = 0 ;i<data.result.length;i++){
                        $("#showphoto").append("<div class=\"photo\" id=\""+data.result[i].picGroupId +"\"> <img src=\""+data.result[i].picAdress+"\" alt=\"失败\"/> <div class=\"photomes\" > <span class=\"photoUserName\">"+data.result[i].uNickname+"</span> <span> 时间："+data.result[i].picUpDate+"</span> <span>赞："+data.result[i].likeNum +"</span> <span>评论:"+data.result[i].commentNum +"</span> </div> </div>")
                    }
                }
            }else {
                alert("图片查询失败");
            }
        }
    });

}
function qryClick() {
    $("#getmorephoto").on("click",function () {
        pageNum++;
        qryPhoto();
        photoClick();
    })
}
function photoClick() {
    $(".photo").on("click",function () {
        // window.location ="PhotoDtail?picGourpId="+$(this).attr("id");
        window.open("PhotoDtail?picGourpId="+$(this).attr("id"));
    })
}