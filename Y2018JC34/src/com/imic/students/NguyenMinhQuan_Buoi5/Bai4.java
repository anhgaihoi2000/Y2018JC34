package com.imic.students.NguyenMinhQuan_Buoi5;

import java.util.Arrays;
import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ban nhap 4 ho ten hoc sinh:");
		String []hoten = new String[4];
		
	

		for (int i = 0; i < 4; i++) {
			hoten[i] =sc.nextLine();
			
		}

		
		System.out.println("Moi ban nhap diem 4 hoc sinh:");
		double []diem= new double[4];
		
		
		
		for (int i = 0; i < 4; i++) {
			diem[i] =sc.nextDouble();
			
			
		}
		
		String hocluc = new String();

		for (int t = 0; t < 4; t++) {

			if (diem[t] < 5) {
				System.out.println("Ban: " + hoten[t] + "----- Hoc luc: Yeu");

			} else if (5 <= diem[t] && diem[t] < 6.5) {
				System.out.println("Ban: " + hoten[t] + "----- Hoc luc: Trung binh");

			} else if (6.5 <= diem[t] && diem[t] < 7.5) {
				System.out.println("Ban: " +hoten[t] + "----- Hoc luc: Kha");

			} else if (7.5 <= diem[t] && diem[t] < 9) {
				System.out.println("Ban: " +hoten[t] + "----- Hoc luc: Gioi");

			} else {
				System.out.println("Ban: " + hoten[t] + "----- Hoc luc: Xuat sac");

			}
		}
	}}
//		for (int d = 0; d < 3 - 1; d++) {
//			for (int e = d + 1; e < 3; e++) {
//				if (b[d] > b[e]) {
//					double temp = b[d];
//					b[d] = b[e];
//					b[d] = temp;
//
//				}
//			}
//		}
//		System.out.print("Sap xep diem theo thu tu tang dan  : " + Arrays.toString(b));
//
//	}
//
//}
//KFKDF//