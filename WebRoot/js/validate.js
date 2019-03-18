window.onload=prepareUserCheck()
function prepareUserCheck(){
	if(!document.getElementById)return false
	if(!document.getElementById("table"))return false
	var form=document.getElementById("table")
	form.onsubmit=function(){
		userCheck()
	}
}

function userCheck(){
	with(document.form){
		if(username.value==""){
		alert("请输入用户名")
		return false
	   }
		if(password.value==""){
			alert("请输入密码")
			return false
		}
		if(repassword.value==""){
			alert("重新输入的密码与密码不符")
			return false
		}
		if(name.value==""){
			alert("请输入真实姓名")
			return false
		}
		if(validate_email(email,"您输入的不是一个有效的电子邮箱地址")){
			email.focus()
			return false
		}
		var FileListType="doc,docx"
		var destStr=file.value.substring(file.value.lastIndexOf(".")+1,file.value.length)
		if(FileListType.indexOf(destStr)==-1){
			alert("只允许上传word文件")
			return false
		}
	}
	
}

function validate_email(field,alertTxt){
	with(field){
		var apos=value.indexOf("@")
		var dotpos=value.lastIndexOf(".")
		if(apos<1||dotpos-apos<2){
			alter(alertTxt)
			return false
		}
	}
} 