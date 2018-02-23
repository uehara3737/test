package com.internousdev.template.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.MyPageDAO;
import com.internousdev.template.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware{

	/**
	 * ログイン情報を格納
	 */
	public Map<String, Object>  session;

	/**
	 * マイページ情報取得DAO
	 */
	public MyPageDAO myPageDAO = new MyPageDAO();

	/**
	 * マイページ情報格納DTO
	 */
	public MyPageDTO myPageDTO = new MyPageDTO();

	/**
	 * 削除フラグ
	 */
	public String deleteFlg;

	/**
	 * 処理結果
	 */
	private String result;

	/**
	 * 商品履歴取得処理
	 *
	 * @author internous
	 */
	public String execute() throws SQLException {

		// 商品履歴を削除しない場合
		if(deleteFlg == null) {
			String item_transaction_id = session.get("id").toString();
			String user_master_id = session.get("login_user_id").toString();

			myPageDTO = myPageDAO.getMyPageUserInfo(item_transaction_id, user_master_id);

			session.put("total_price", myPageDTO.getTotalPrice());
			session.put("total_count", myPageDTO.getTotalCount());
			session.put("total_payment", myPageDTO.getPayment());
			session.put("message", "");

		// 商品履歴を削除する場合
		} else if(deleteFlg.equals("1")) {
			delete();
		}

		result = SUCCESS;
		return result;
	}

	/**
	 * 商品履歴削除
	 *
	 * @throws SQLException
	 */
	public void delete() throws SQLException {

		String item_transaction_id = session.get("id").toString();
		String user_master_id = session.get("login_user_id").toString();

		int res = myPageDAO.buyItemHistoryDelete(item_transaction_id, user_master_id);

		if(res > 0) {
			session.put("message", "商品情報を正しく削除しました。");
		} else if(res == 0) {
			session.put("message", "商品情報の削除に失敗しました。");
		}
	}



	public String getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

	@Override
	public void setSession(Map<String, Object> loginSessionMap) {
		this.session = loginSessionMap;
	}
}
