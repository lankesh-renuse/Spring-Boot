package com.Spring.Entity;


public class Student {

	private int id;
	private String name;
	private String srname;
	private int rollno;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSrname() {
		return srname;
	}

	public void setSrname(String srname) {
		this.srname = srname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", srname=" + srname + ", rollno=" + rollno + "]";
	}

	public Student(int id, String name, String srname, int rollno) {
		super();
		this.id = id;
		this.name = name;
		this.srname = srname;
		this.rollno = rollno;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
}
