
//BTVN:  Nháº­p vÃ o 1 máº£ng sá»‘ nguyÃªn , in ra táº¥t cáº£ cÃ¡c sá»‘ cháºµn ra ngoÃ i mÃ n hÃ¬nh

package com.imic.students.DO_NAM_HAI.BaiTapVeNhaBuoi5;

import java.util.Scanner;

public class SoChan {

	public static void main(String[] args) {

		Scanner nhap = new Scanner(System.in);

		int n = 0;
	
		try {
			System.out.print(" Má»�i báº¡n nháº­p sá»‘ lÆ°á»£ng index : ");
			n = nhap.nextInt();

			int[] soNguyen = new int[n];

			for (int i = 0; i < n; i++) {

				System.out.print(" Má»�i báº¡n nháº­p sá»‘ nguyÃªn : ");
				soNguyen[i] = nhap.nextInt();

			}
			for (int x : soNguyen) {
				if (x % 2 == 0) {
					System.out.println("Ta Ä‘Æ°á»£c sá»‘ cháºµn trong máº£ng : " + x);
				}

			}
		}

		catch (Exception a) {
			System.out.println(" Má»�i báº¡n nháº­p láº¡i sá»‘ ");
		}
	}
}
