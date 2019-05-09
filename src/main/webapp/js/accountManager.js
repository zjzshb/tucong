$(document).ready(function () {
    initTable();
    qry();
})
function initTable() {
    
    var param = {
        userId:$("#userId").val(),
        userName:$("#userName").val(),
        uNickname:$("#nickName").val(),
        qryStartDate:$("#qryStartDate").val(),
        qryEndDate:$("#qryEndDate").val()
    }
    
    layui.use('table', function () {
        var table = layui.table;
        var userId =
            table.render({
                elem: '#accountInfo',
                url: '../qryAccountInfo',
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
                        field: 'userName',
                        title: '用户名',
                        width: 120,
                        edit: 'text'
                    },
                    {
                        field: 'uNickname',
                        title: '用户昵称',
                        width: 120,
                        edit: 'text'
                    },
                    {
                        field: 'userPhone',
                        title: '电话',
                        width: 120,
                        edit: 'text'
                    },
                    {
                        field: 'uAddress',
                        title: '地址',
                        width: 120,
                        edit: 'text'
                    },
                    {
                        field: 'uDis',
                        title: '用户描述',
                        width: 120,
                        edit: 'text'
                    },
                    {
                        field: 'uSex',
                        title: '性别',
                        width: 120,
                        edit: 'text'
                    },
                    {
                        field: 'uCreatetime',
                        title: '创建时间',
                        width: 120,
                        edit: 'text'
                    },
                    {
                        field: 'fansNum',
                        title: '粉丝数',
                        width: 120,
                        edit: 'text'
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
                    userId : data.userId
                }
                $.ajax({
                    url:"../banAccount", type:"post", data:JSON.stringify(banParam) , async:false, dataType:"json",contentType:"application/json", cache:false,
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
function qry() {
    $("#qry").on("click",function () {
        initTable();
    })
}