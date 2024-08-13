package com.Spring.Entity;

public class Courses {

	private int id;
	private String Cname;
	private String time;

	@Override
	public String toString() {
		return "Courses [id=" + id + ", Cname=" + Cname + ", time=" + time + "]";
	}

	public Courses(int id, String cname, String time) {
		super();
		this.id = id;
		Cname = cname;
		this.time = time;
	}

	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
