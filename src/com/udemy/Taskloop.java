package com.udemy;

public class Taskloop {

	public static void main(String[] args) {
		int row = 1;
		for (int i = 10; i >= row; i--) {
			for (int j = 10; j >= i; j--) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}
}
