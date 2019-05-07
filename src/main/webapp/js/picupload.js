var sucPicArr = [];
var labelArr = [];
$(document).ready(function () {
    $("#publishPic").click(function () {
        debugger;
        publishPic();
    })
    initLabel();
    labelClick();
    
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
    debugger;
    var picDescribe = $("#picDescribe").val();
    var picTitle = $("#picTitle").val();
    var picLabel = $("#picLabel").val();
    var param ={
        sucPicArr:sucPicArr,
        picDescribe:picDescribe,
        picLabel:picLabel,
        picTitle:picTitle
    }
    $.ajax({
        url:"doPublishPic", type:"post", data:param, async:false, dataType:"json", cache:false,
        success: function (data) {
            debugger;
            if (data.resultCode == "000000") {
                alert("发布成功");
                $("#showphoto").html("");
                $("#picDescribe").val("");
                $("#picTitle").val("");
                $("#picLabel").val("");
                sucPicArr = [];

            }else {
                alert("发布失败");
            }
        }
    });
}

function initLabel(){
    var param ={};
    $.ajax({
        url:"getLabelInfo", type:"post", data:param, async:false, dataType:"json", cache:false,
        success: function (data) {
            debugger;
            if (data.resultCode == "000000") {
                if(data.result.length!=0){
                    for (var i = 0 ;i<data.result.length;i++){
                        $("#showLabel").append("<div> <a>#"+data.result[i].picLabelName+"</a> </div>");
                    }
                }
            }else {
                alert("初始化标签失败");
            }
        }
    });
}
function labelClick() {
    $(".labelsA div a,.labels div a").off("click").on("click", function () {

        var text = $(".labelA").val();
        $(".labelA").val(text + $(this).text());


        var num = $(".labelA").val().match(/#/g).length;

        if (num < 11) {
            $(".photoLabel a:nth-of-type(2)").text(num);
        }
    });
    $(".labelA").unbind('input propertychange').bind('input propertychange', function () {

        var num = $(".labelA").val().match(/#/g).length;

        if (num < 11) {
            $(".photoLabel a:nth-of-type(2)").text(num);
        }
    });
}