package com.shenyu.entity;

public class Orders {
	private int id;
	private int user_id;
	private String number;
	@Override
	public String toString() {
		return "Orders [id=" + id + ", user_id=" + user_id + ", number=" + number + ", createTime=" + createTime
				+ ", note=" + note + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	private String createTime;
	private String note;

	
	
	
}
