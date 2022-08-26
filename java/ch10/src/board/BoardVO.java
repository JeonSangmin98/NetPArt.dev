package board;

public class BoardVO {
	private String register;
	private String subject;
	private String content;
	private String passwd;
	
	public BoardVO(String register, String subject, String content, String passwd) {
		super();
		this.register = register;
		this.subject = subject;
		this.content = content;
		this.passwd = passwd;
	}

	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	@Override
	public String toString() {
		return "작성자 : " + register + ", 제목 : " + subject + ", 내용 : " + content;
	}
	
}