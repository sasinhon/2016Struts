package com.struts.tutorial.action;

public class TutorialAction02 {
	
	private String msg;
	private String msg2;
	public String getMsg() {
		return msg;
	}
	public String getMsg2() {
		return msg2;
	}

	public String execute(){
		msg="tutorial msg";
		msg2="¸Þ½ÃÁöÀü´Þ";
		return "success";
	}
}