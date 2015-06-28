package com.taojiang.bean;

public class UserVO {
	private int id;
	private String NAME;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserVO [id=" + id + ", NAME=" + NAME + ", age=" + age + "]";
	}
}
