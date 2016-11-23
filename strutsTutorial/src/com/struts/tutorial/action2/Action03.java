package com.struts.tutorial.action2;

import com.opensymphony.xwork2.ActionSupport;

public class Action03 extends ActionSupport {
	private String id, pw, msg;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getPw() {
		return pw;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String formView() {
		return INPUT;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("execute() run");
		msg = "id:" + id + ",pw:" + pw + "로 로그인";
		return SUCCESS;

	}

	@Override
	public void validate() {
		if (id == null) {

		} else if ("".equals(id)) {
			addFieldError("id", "id not null");
		} else if (id.length() < 4) {
			addFieldError("id", "id must be over 4 charactor");
		}
		if (pw == null) {

		} else if ("".equals(pw)) {
			addFieldError("pw", "pw not null");
		} else if (pw.length() < 6) {
			addFieldError("pw", "pw must be over 6 charactor");

		}
	}
}
