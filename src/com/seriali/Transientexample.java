package com.seriali;

import java.io.*;

 class Student1 implements Serializable{
	int id;
	String name;
	transient int age;
	public Student1(int id,String name,int age) {
	this.id=id;
	this.name=name;
	this.age=age;
}
}
public class Transientexample {

	public static void main(String[] args)throws Exception{
		Student1 s2=new Student1(111,"virsu",24);
		FileOutputStream fout=new FileOutputStream("f.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(s2);
		out.flush();
		out.close();
		System.out.println("Success");
	}

}
