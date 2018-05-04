package com.imic.students.NguyenMinhQuan_Buoi5;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Nhap so phan tu mang");
int n =0;
n = sc.nextInt();
int a[]= new int[n];



for (int i =0; i<n; i++) {
	System.out.println("cac phan tu lan luot la: ");
	a[i] = sc.nextInt();
	
}
System.out.println("Cac phan tu vua nhap la:" +Arrays.toString(a));
 
Arrays.sort(a);

for(int i=0;i<n;i++) {
	
	System.out.println("Phan tu nho nhat la:" + Math.min(a[0],a[i]));
	break;
}

for(int x :a) {
	if(x % 3 ==0) {
		
	}
	
	
}
	}

}
//KFKDF//