import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		int n1,n2,select;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Birinci sayýyý giriniz: ");
		n1=input.nextInt();
		System.out.println("Ýkinci sayýyý giriniz: ");
		n2=input.nextInt();
		
		System.out.println("1-Toplama\n2-Çýkarma\n3-Çarpman\n4-Bölme");
		System.out.println("Yapmak istediðiniz iþlemi giriniz: ");
		select=input.nextInt();
		
		
		switch(select) {
		 case (1):
			 System.out.println("Toplam sonucu= " +(n1+n2));
		 break;
		 case (2):
			 System.out.println("Çýkarma sonucu= " +(n1-n2));
		 break;
		 case (3):
			 System.out.println("Çarpma sonucu= " +(n1*n2));
		 break;
		 case (4):
			 System.out.println("Bölme sonucu= " +(n1/n2));
		 break;
		 default:
			 System.out.println("Girdinizle ilgili iþlem mevcut deðil");
		}
		

	}

}
