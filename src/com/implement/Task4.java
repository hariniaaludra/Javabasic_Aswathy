package com.implement;

import com.doo.Task4Interface;

public class Task4 implements Task4Interface {
		public void add(int a,int b) {
			System.out.println("a+b= "+ (a+b) );
		}
		public void sub(int a,int b) {
			System.out.println("a-b= "+ (a-b));
		}
		public void mul(int a,int b) {
			System.out.println("a*b=" + (a*b));
		}
		public void div(int a,int b) {
			System.out.println("a/b="+ (a/b));
		}
		
	}
