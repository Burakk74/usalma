package usalma;

import java.util.Scanner;

public class usalma {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Taban sayıyı giriniz :");
		int a = input.nextInt();
		
		System.out.print("Kuvvet olan sayıyı giriniz :"); 
		int b = input.nextInt();
		int sonuc = 1;
		
		for(int i = 1; i <= b; i++ ) {
			
			
		sonuc *= a;
		}		
		
		System.out.print("Sonuç = "  + sonuc);
		
	}

}
