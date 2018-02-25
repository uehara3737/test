 function CheckEmail_1() {
    var mail = email_1.value; //メールフォームの値を取得
    var mailConfirm = emailConfirm_1.value; //メール確認用フォームの値を取得
    // パスワードの一致確認
    if (mail != mailConfirm){
      alert("パスワードと確認用パスワードが一致しません"); // 一致していなかったら、エラーメッセージを表示する
      return false;
    }else{
      return true;
    }
  };