package avarageCalc;

import java.util.Scanner;

public class avarage {
	//Dersler : Matematik, Fizik, T�rk�e, Kimya, M�zik
    //
    //Ge�me Notu : 60
    //
    //�dev
    //E�er girilen ders notlar� 0 veya 100 aras�nda de�il ise ortalamaya kat�lmas�n.
	public static void main(String[] args) {
		int mat,fizik,kimya,turkce,tarih,muzik, toplam=0, i=0;

		Scanner inp =new Scanner(System.in);
		
		System.out.print("Matematik Notunuz: ");
		mat = inp.nextInt();
		
		System.out.print("Fizik Notunuz: ");
		fizik = inp.nextInt();
		
		System.out.print("Kimya Notunuz: ");
		kimya = inp.nextInt();
		
		System.out.print("T�rk�e Notunuz: ");
		turkce = inp.nextInt();
		
		System.out.print("Tarih Notunuz: ");
		tarih = inp.nextInt();
		
		System.out.print("M�zik Notunuz: ");
		muzik = inp.nextInt();
		
		if(!(mat<0 || mat>100)) {
			toplam=toplam+mat;
			i++;
		}if(!(fizik<0 || fizik>100)) {
			toplam=toplam+fizik;
			i++;
		}if(!(kimya<0 || kimya>100)) {
			toplam=toplam+kimya;
			i++;
		}if(!(turkce<0 || turkce>100)) {
			toplam=toplam+turkce;
			i++;
		}if(!(tarih<0 || tarih>100)) {
			toplam=toplam+tarih;
			i++;
		}if(!(muzik<0 || muzik>100)) {
			toplam=toplam+muzik;
			i++;
		}
		System.out.println((toplam/i)>59 ? "Ge�tiniz":"Kald�n�z" );
		
		
		
	}

}
