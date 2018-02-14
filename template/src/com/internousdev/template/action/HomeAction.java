package com.internousdev.template.action;

import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport {

	/**
	 * ログインボタン押下時に実行
	 * ログイン画面へ遷移します。
	 *
	 * @return SUCCSESS
	 */
	public String execute() {
		return SUCCESS;
	}
}
