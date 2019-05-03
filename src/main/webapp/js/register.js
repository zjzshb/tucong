$(document).ready(function () {
    $("#sendmessege").click(function () {
        sendMessge();
    })
    
    $("#register").click(function () {
        doRegister();
    })
})

function sendMessge() {
    debugger;
    var param = {
        userPhone : $("#userPhone").val()
    }
    $.ajax({
        url : "sendmessege",
        data :param,
        type : "post",
        dataType:'json',
        success : function(reslut) {
            $("#messege04").text(reslut.resultMessage);
        }
    })

}
function doRegister() {
    debugger;
    var param = {
        userPhone : $("#userPhone").val(),
        userPwd : $("#pw1").val(),
        checkInfo : $("#checkInfo").val()
    }
    $.ajax({
        contentType : "application/json;charset=UTF-8",
        url : "doRegister",
        data :JSON.stringify(param),
        type : "post",
        dataType:'json',
        success : function(reslut) {
            $("#messege02").text(reslut.resultMessage);
        }
    })
}