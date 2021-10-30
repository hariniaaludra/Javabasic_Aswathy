package com.main;

import com.doo.Task4Interface;
import com.implement.*;
public class Main {

	public static void main(String[] args) {
			Task4Interface c1 = (Task4Interface) new Task4();
			c1.add(5,5);
			c1.sub(5,5);
			c1.mul(5,5);
			c1.div(5,5);
			}
	}
