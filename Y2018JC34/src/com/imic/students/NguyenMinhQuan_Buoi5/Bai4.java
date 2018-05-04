package com.imic.students.NguyenMinhQuan_Buoi5;

import java.util.Arrays;
import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String hoten = new String();
		System.out.println("Ban nhap 4 ho ten hoc sinh:");
		String a[] = new String[3];
		hoten = sc.nextLine();
	

		for (int i = 0; i < 3; i++) {
			a[i] = sc.nextLine();
		}

		double diem = 0;
		System.out.println("Moi ban nhap diem 4 hoc sinh:");
		double b[]= new double[3];
		diem = sc.nextDouble();
		
		for (int i = 0; i < 3; i++) {
			
			b[i] = sc.nextDouble();
		}
		
		String hocluc = new String();

		for (int t = 0; t < 3; t++) {

			if (b[t] < 5) {
				System.out.println("Ban: " + a[t] + "----- Hoc luc: Yeu");

			} else if (5 <= b[t] && b[t] < 6.5) {
				System.out.println("Ban: " + a[t] + "----- Hoc luc: Trung binh");

			} else if (6.5 <= b[t] && b[t] < 7.5) {
				System.out.println("Ban: " + a[t] + "----- Hoc luc: Kha");

			} else if (7.5 <= b[t] && b[t] < 9) {
				System.out.println("Ban: " + a[t] + "----- Hoc luc: Gioi");

			} else {
				System.out.println("Ban: " + a[t] + "----- Hoc luc: Xuat sac");

			}
		}
		for (int d = 0; d < 3 - 1; d++) {
			for (int e = d + 1; e < 3; e++) {
				if (b[d] > b[e]) {
					double temp = b[d];
					b[d] = b[e];
					b[d] = temp;

				}
			}
		}
		System.out.print("Thứ tự điểm tăng dần là : " + Arrays.toString(b));

	}

}
//aa//