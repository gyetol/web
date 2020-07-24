package com.mycompany.command;

public class MemberCommand {
	private String email;
	private String pass;
	private String passConfirm;
	private String nick;
	
	public MemberCommand() {}

	public MemberCommand(String email, String pass, String passConfirm, String nick) {
		super();
		this.email = email;
		this.pass = pass;
		this.passConfirm = passConfirm;
		this.nick = nick;
	}

	public String getEmail() {
		return email;
	}

	public String getPass() {
		return pass;
	}

	public String getPassConfirm() {
		return passConfirm;
	}

	public String getNick() {
		return nick;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void setPassConfirm(String passConfirm) {
		this.passConfirm = passConfirm;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	
	

}
