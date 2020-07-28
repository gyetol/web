package co.kr.lectopia.vo;

import java.sql.Timestamp;

public class BoardVO {
	private int id;
	private int mainId;
	private int subId;
	private String email;
	private String subject;
	private String content;
	private Timestamp registeredAt;
	private Timestamp removedAt;
	private int hit;
	
	public BoardVO() {}

	public BoardVO(int id, int mainId, int subId, String email, String subject, String content, Timestamp registeredAt,
			Timestamp removedAt, int hit) {
		super();
		this.id = id;
		this.mainId = mainId;
		this.subId = subId;
		this.email = email;
		this.subject = subject;
		this.content = content;
		this.registeredAt = registeredAt;
		this.removedAt = removedAt;
		this.hit = hit;
	}

	public int getId() {
		return id;
	}

	public int getMainId() {
		return mainId;
	}

	public int getSubId() {
		return subId;
	}

	public String getEmail() {
		return email;
	}

	public String getSubject() {
		return subject;
	}

	public String getContent() {
		return content;
	}

	public Timestamp getRegisteredAt() {
		return registeredAt;
	}

	public Timestamp getRemovedAt() {
		return removedAt;
	}

	public int getHit() {
		return hit;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMainId(int mainId) {
		this.mainId = mainId;
	}

	public void setSubId(int subId) {
		this.subId = subId;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setRegisteredAt(Timestamp registeredAt) {
		this.registeredAt = registeredAt;
	}

	public void setRemovedAt(Timestamp removedAt) {
		this.removedAt = removedAt;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	
}