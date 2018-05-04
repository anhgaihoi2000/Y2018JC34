package com.imic.students.NguyenMinhQuan_Buoi5;

import java.util.Arrays;
import java.util.Scanner;

public class Sapxepgiamdan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao mang 10 phan tu: ");
		int a[] = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.println("bat dau nhap cac phan tu");
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < 10; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}

			System.out.println("Thu tu giam dan: " + Arrays.toString(a));
		}
	}
}

//KFKDF//