package com.imic.students.NguyenMinhQuan;

import java.util.Scanner;

public class BAI_1_LAB2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("----- Giai Phuong trinh ax + b = 0");
		System.out.println("Moi may nhap so a");
		int a =sc.nextInt();
		System.out.println("Moi may nhap so b");
		int b=sc.nextInt();
		int x= -b/a;
		 if(a == 0) {
			 if(b == 0) {
			 System.out.println("Phuong trinh vo so nghiem");
			 }
			 else {
				 System.out.println("Phuong trinh khong co nghiem");
				 
			 }
		 }
		 
		 else {
			 System.out.println("Phuong trinh co nghiem: "+x );
		 }
		 
		 

	}

}
