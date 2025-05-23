package SampleGroupWorkDisaster.form;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class SendMailForm {

	//メールID
	private Integer mId;

	//メール件名
	private String mTitle;

	//送信者
	private String Sender;

	//本文
	private String mDetail;

	//送信日
	private LocalDateTime mDate;

	//回答期限
	private LocalDateTime replyPeriod;

}
