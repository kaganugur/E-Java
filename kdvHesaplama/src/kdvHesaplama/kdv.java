package kdvHesaplama;

import java.util.Scanner;

public class kdv {

	public static void main(String[] args) {
		double fiyat,kdvOran=0.18, kdvFiyat, kdvliFiyat;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Ücret tutarýný giriniz: ");
		fiyat=input.nextDouble();
		
		kdvFiyat=fiyat*kdvOran;
		kdvliFiyat=fiyat+kdvFiyat;
		System.out.println("KDV'siz Tutar: " +fiyat);
		System.out.println("KDV'li Tutar" +kdvliFiyat);
		System.out.println("KDV Oraný: " +kdvOran);
		System.out.println("KDV tutarý: " +kdvFiyat);

	}

}
