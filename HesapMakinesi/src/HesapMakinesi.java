import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		int n1,n2,select;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Birinci say�y� giriniz: ");
		n1=input.nextInt();
		System.out.println("�kinci say�y� giriniz: ");
		n2=input.nextInt();
		
		System.out.println("1-Toplama\n2-��karma\n3-�arpman\n4-B�lme");
		System.out.println("Yapmak istedi�iniz i�lemi giriniz: ");
		select=input.nextInt();
		
		
		switch(select) {
		 case (1):
			 System.out.println("Toplam sonucu= " +(n1+n2));
		 break;
		 case (2):
			 System.out.println("��karma sonucu= " +(n1-n2));
		 break;
		 case (3):
			 System.out.println("�arpma sonucu= " +(n1*n2));
		 break;
		 case (4):
			 System.out.println("B�lme sonucu= " +(n1/n2));
		 break;
		 default:
			 System.out.println("Girdinizle ilgili i�lem mevcut de�il");
		}
		

	}

}
