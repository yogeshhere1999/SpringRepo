package com.spring.spring;

public class Student {
	
	private int StudId;
	private String StudName;
	private String StudAddress;
	
	@Override
	public String toString() {
		return "Student [StudId=" + StudId + ", StudName=" + StudName + ", StudAddress=" + StudAddress + "]";
	}
	
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studId, String studName, String studAddress) {
		super();
		StudId = studId;
		StudName = studName;
		StudAddress = studAddress;
	}
	
	
	
	
	public int getStudId() {
		return StudId;
	}
	public void setStudId(int studId) {
		StudId = studId;
	}
	public String getStudName() {
		return StudName;
	}
	public void setStudName(String studName) {
		StudName = studName;
	}
	public String getStudAddress() {
		return StudAddress;
	}
	public void setStudAddress(String studAddress) {
		StudAddress = studAddress;
	}
	
	
	
}
