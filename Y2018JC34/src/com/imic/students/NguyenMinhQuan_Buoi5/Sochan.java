package com.imic.students.NguyenMinhQuan_Buoi5;

import java.util.Scanner;

public class Sochan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.println("Moi ban nhap so luong phan tu mang:");
		n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Moi ban nhap  " + n + "  phan tu:");
			a[i] = sc.nextInt();
			
		}

		for (int x : a) {
			if (x % 2 == 0) {
				System.out.println("Chung ta co cac so chan:   " + x);
			}

			
		}

	}
}
//KFKpDF//