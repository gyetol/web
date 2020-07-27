package com.mycompany.vo;

import java.sql.Timestamp;

public class BoardVO {
	private int id;
	private int midd;
	private int sid;
	private String email;
	private String title;
	private String content;
	private Timestamp regdate;
	private int hit;
	
	public BoardVO() {}

	public BoardVO(int id, int midd, int sid, String email, String title, String content, Timestamp regdate, int hit) {
		super();
		this.id = id;
		this.midd = midd;
		this.sid = sid;
		this.email = email;
		this.title = title;
		this.content = content;
		this.regdate = regdate;
		this.hit = hit;
	}

	public int getId() {
		return id;
	}

	public int getMidd() {
		return midd;
	}

	public int getSid() {
		return sid;
	}

	public String getEmail() {
		return email;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public Timestamp getRegdate() {
		return regdate;
	}

	public int getHit() {
		return hit;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMidd(int midd) {
		this.midd = midd;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}
	
	
}
