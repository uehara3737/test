package com.internousdev.ecsite.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dao.LoginDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ログイン認証処理
 * Login.jspからログインID、ログインパスワードを受け取り
 * DBへ問い合わせを行います。
 *
 * @author internous
 * @param loginUserId
 * @param loginPassword
 *
 * @return result
 */
public class LoginAction extends ActionSupport implements SessionAware{

	/**
	 * ログインID
	 */
	private String loginUserId;

	/**
	 * ログインパスワード
	 */
	private String loginPassword;

	/**
	 * ログイン情報を格納
	 */
	public Map<String, Object> session;

	/**
	 * ログイン情報取得DAO
	 */
	private LoginDAO loginDAO = new LoginDAO();

	/**
	 * ログイン情報格納IDTO
	 */
	private LoginDTO loginDTO = new LoginDTO();

	/**
	 * アイテム情報を取得
	 */
	private BuyItemDAO buyItemDAO=new BuyItemDAO();
	private BuyItemDTO buyItemDTO=new BuyItemDTO();
	private List<BuyItemDTO> buyItemDTOList;

	/**
	 * 実行メソッド
	 */
	public String execute() {

		String result = ERROR;

		// ログイン実行
		loginDTO = loginDAO.getLoginUserInfo(loginUserId, loginPassword);

		session.put("loginUser", loginDTO);


		// ログイン情報を比較
		if(((LoginDTO) session.get("loginUser")).getLoginMaster()){
			buyItemDTOList=buyItemDAO.getBuyItemInfo();
			session.put("buyItemDTOList", buyItemDTOList);
			session.put("masterId",loginUserId);
			result = "master";

		}

		if(result != "master"){
			if(((LoginDTO) session.get("loginUser")).getLoginFlg()) {
				result = SUCCESS;

				// アイテム情報を取得

				buyItemDTOList=buyItemDAO.getBuyItemInfo();

				// BuyItemActionで利用したいから"buyItemDTOList"という鍵の名前でbuyItemDTOListのデータを保管する。
				session.put("buyItemDTOList", buyItemDTOList);
				session.put("id", buyItemDTO.getId());
				session.put("login_user_id",loginDTO.getLoginId());
				session.put("userName", loginDTO.getUserName());
				session.put("userAddress", loginDTO.getUserAddress());



			}
		}



		return result;
	}

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public List<BuyItemDTO> getBuyItemDTOList(){
		return buyItemDTOList;
	}
	public void setBuyItemDTOList(List<BuyItemDTO> buyItemDTOList){
		this.buyItemDTOList=buyItemDTOList;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
