var sucPicArr = [];
$(document).ready(function () {
    $("#publishPic").click(function () {
        debugger;
        publishPic();
    })
    
})



function upLoadFile() {
    debugger;

    if($("#file").val()!="") {
        var formData = new FormData();
        formData.append("pic", document.getElementById("file1").files[0]);
        $.ajax({
            url: "doUpLoadPic",
            type: "POST",
            data: formData,
            contentType: false,
            processData: false,
            success: function (data) {
                debugger;
                if (data.resultCode == "000000") {
                    $("#showphoto").append("<div><img class=\"photo\" src=\"" + data.result.picAddress + "\"/></div>");
                    //添加到上传成功的arr中
                    sucPicArr.push(data.result.picId);
                }else {
                    alert("上传失败");
                }
            }

        });
        
    }
}

function publishPic() {
    var picDescribe = $("#picDescribe").val();
    var param ={
        sucPicArr:sucPicArr,
        picDescribe:picDescribe
    }
    $.ajax({
        url:"doPublishPic", type:"post", data:param, async:false, dataType:"json", cache:false,
        success: function (data) {
            debugger;
            if (data.resultCode == "000000") {
                alert("发布成功");
            }else {
                alert("发布失败");
            }
        }

    });
}