$(document).ready(function () {
    initTable();
    qry();
})
function initTable() {
    var param = {
        userId:$("#userId").val(),
        uNickname:$("#uNickname").val(),
        picGroupId:$("#picGroupId").val(),
        picTitle:$("#picTitle").val(),
        qryEndDate:$("#qryEndDate").val(),
        qryStartDate:$("#qryStartDate").val(),
        qryEndDate:$("#qryEndDate").val()
    }
    layui.use('table', function () {
        var table = layui.table;
        var userId =
            table.render({
                elem: '#picInfo',
                url: '../photoManager',
                contentType: 'application/json',
                method:"post",
                title: '用户数据表',
                where: param,
                totalRow: true,
                cols: [[
                    {
                        field: 'picGroupId',
                        title: '图片ID',
                        width: 80,
                        fixed: 'left'
                    },
                    {
                        field: 'picTitle',
                        title: '图片标题',
                        width: 120
                    },
                    {
                        field: 'userId',
                        title: '用户ID',
                        width: 120
                    },
                    {
                        field: 'uNickname',
                        title: '用户昵称',
                        width: 120
                    },
                    {
                        field: 'picLabelName',
                        title: '标签名',
                        width: 120
                    },
                    {
                        field: 'picDescribe',
                        title: '图片描述',
                        width: 120
                    },
                    {
                        field: 'commentNum',
                        title: '评论数',
                        width: 120

                    },
                    {
                        field: 'picUpDate',
                        title: '上传时间',
                        width: 120
                    },
                    {
                        title: '操作',
                        toolbar: '#barDemo',
                        width: 150
                    }
                ]],
                page: true,
                limit: 5
            });
        //监听行工具事件
        table.on('tool(test)', function (obj) {
            var data = obj.data;
            if (obj.event === 'ban') {
                // ban
                var banParam = {
                    picGroupId : data.picGroupId
                }
                debugger;
                $.ajax({
                    url:"../banPic", type:"post", data:JSON.stringify(banParam) , async:false, dataType:"json",contentType:"application/json", cache:false,
                    success: function (data) {
                        if(data.code = 0){
                            alert(data.msg);
                        }
                    }
                });
            }else if(obj.event === "detail"){
                // window.location ="../PhotoDtail?picGourpId="+data.picGroupId;
                window.open("../PhotoDtail?picGourpId="+data.picGroupId);
            }
        });
    });
}
function qry() {
    $("#qry").on("click",function () {
        initTable();
    })
}