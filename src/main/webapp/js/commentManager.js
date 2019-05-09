/**
 * Created by John on 2019/5/9.
 */
$(document).ready(function () {
    initTable();
    qry();
})
function qry() {
    $("#qry").on("click",function () {
        initTable();
    })
}
function initTable() {
    debugger;
    var param = {
        userId:$("#userId").val(),
        nikeName:$("#nikeName").val(),
        picGroupId:$("#picGroupId").val(),
        qryStartDate:$("#qryStartDate").val(),
        qryEndDate:$("#qryEndDate").val()
    }

    layui.use('table', function () {
        var table = layui.table;
        var userId =
            table.render({
                elem: '#commentInfo',
                url: '../commentManager',
                contentType: 'application/json',
                method:"post",
                title: '用户数据表',
                where: param,
                totalRow: true,
                cols: [[
                    {
                        field: 'userId',
                        title: 'ID',
                        width: 80,
                        fixed: 'left',
                    },
                    {
                        field: 'nikeName',
                        title: '昵称',
                        width: 120
                    },
                    {
                        field: 'picGroupId',
                        title: '照片ID',
                        width: 120
                    },
                    {
                        field: 'commMain',
                        title: '评论类容',
                        width: 120
                    },
                    {
                        field: 'commDate',
                        title: '评论类容',
                        width: 300
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
                    commentId : data.commentId
                }
                $.ajax({
                    url:"../banComment", type:"post", data:JSON.stringify(banParam) , async:false, dataType:"json",contentType:"application/json", cache:false,
                    success: function (data) {
                        if(data.code = 0){
                            debugger;
                            layer.msg(data.msg);
                        }
                    }
                });
            }
        });
    });
}