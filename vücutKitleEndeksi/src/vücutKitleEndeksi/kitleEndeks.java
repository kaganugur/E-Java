package v�cutKitleEndeksi;

import java.util.Scanner;

public class kitleEndeks {

	public static void main(String[] args) {
		double boy,kilo,endeks;
		
	Scanner input=new Scanner(System.in);
	
	System.out.println("L�tfen boyunuzu (metre cinsinden) giriniz:");
	boy=input.nextDouble();
	System.out.println("L�tfen kilonuzu giriniz:");
	kilo=input.nextDouble();
	
	endeks=kilo/(boy*boy);
	
	System.out.print("V�cut kitle endeksiniz: " +endeks);
	

	
	}

}
