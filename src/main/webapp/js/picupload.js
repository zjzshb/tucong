$(document).ready(function () {
   
    
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
                if (data.message == "上传成功") {
                    $("#showphoto").append("<div><img class=\"photo\" src=\"" + data.address + "\"/></div>");
                }
            },
            error: function () {
                alert("上传失败");
            }
        });
        
    }
}