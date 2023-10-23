package com.app;

import java.util.Scanner;

//+----+------------+-----------+-------------------+----------+------------+--------+-------+
//| id | first_name | last_name | email             | password | dob        | status | role  |
//+----+------------+-----------+-------------------+----------+------------+--------+-------+
//|  1 | Rama       | Kher      | rama@gmail.com    | ram#123  | 1999-01-01 |      0 | admin |
//|  2 | Shekhar    | Patil     | shekhar@gmail.com | shk#123  | 1992-10-20 |      0 | voter |
//|  3 | Medha      | Khole     | medha@gmail.com   | mad#123  | 1990-11-21 |      0 | voter |
//+----+------------+-----------+-------------------+----------+------------+--------+-------+


public class User {

	int id;
	String fname;
	String lname;
	String mail;
	String passwrd;
	String dob;
	boolean sts;
	String rol;
	
	public User() {
		
	}
	public User(int id, String fname, String lname, String mail, String passwrd, String dob, boolean sts, String rol) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.mail = mail;
		this.passwrd = passwrd;
		this.dob = dob;
		this.sts = sts;
		this.rol = rol;
	}
	
	public User(int id, String fname, String lname, String mail, String dob, boolean sts, String rol) 
	{
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.mail = mail;
		this.dob = dob;
		this.sts = sts;
		this.rol = rol;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public void setPasswrd(String passwrd) {
		this.passwrd = passwrd;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public void setSts(boolean sts) {
		this.sts = sts;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	}
	public String getMail() {
		return mail;
	}
	public String getPasswrd() {
		return passwrd;
	}
	public String getDob() {
		return dob;
	}
	public boolean isSts() {
		return sts;
	}
	public String getRol() {
		return rol;
	}
	
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Name:");
		fname = sc.next();
		
		System.out.print("Enter Last Name:");
		lname = sc.next();
		
		System.out.print("Enter Mail:");
		mail = sc.next();
		
		System.out.print("Enter Password:");
		passwrd = sc.next();
		
		System.out.print("Enter DOB:");
		dob = sc.next();

	}
	
//	public void acceptToUpdate()
//	{
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter id to update the record:");
//		int id = sc.nextInt();
//		
//		System.out.print("Enter First Name to update the record::");
//		fname = sc.next();
//		
//		System.out.print("Enter Last Name to update the record::");
//		lname = sc.next();
//		
//		System.out.print("Enter Mail to update the record::");
//		mail = sc.next();
//		
//		System.out.print("Enter Password to update the record::");
//		passwrd = sc.next();
//		
//		System.out.print("Enter DOB to update the record::");
//		dob = sc.next();
//	}
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", mail=" + mail + ", passwrd=" + passwrd
				+ ", dob=" + dob + ", sts=" + sts + ", rol=" + rol + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
