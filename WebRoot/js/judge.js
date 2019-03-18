window.onload=judge();
function judge(){
	with(document.form){
		if(username.value=="")
			alert("请输入用户名");
		if(password.value=="")
			alert("密码不能为空");
	}
}