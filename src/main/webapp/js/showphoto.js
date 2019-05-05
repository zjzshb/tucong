$(function (){
	$(".addComment").click(function(){
		$.ajax({
			url:"insertComment",
			data:{
					"photoId":$("#photoId").text(),
					"commentText":$("#commentText").val(),
			},
			 type:"post",
			success:function(messege){
				console.log(messege);
				alert(messege);
				location.reload();
			}
		})
	})
})