import java.util.Scanner;


public class hipotenusHesap {

	public static void main(String[] args) {
		
		int a,b;
		double c,u,Alan;
		double cevre;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Birinci kenar uzunlu�unu giriniz: " );
		a=input.nextInt();
		System.out.println("�kinci kenar uzunlu�unu giriniz: ");
		b=input.nextInt();
		System.out.println("���nc� kenar uzunlu�unu giriniz: ");
		c=input.nextInt();
		
		//c=Math.sqrt((a*a)+(b*b)); //Dik ��gen de hipoten�s� bulmak i�in kullan�lan form�l
		
		
		//System.out.println("Hipoten�s uzunlu�u: " +c+ " olarak bulunur.");
		
		cevre=a+b+c;
		u=(a+b+c)/2;
		Alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
				
		System.out.println("��genin �evresinin uzunlu�u " +cevre+ " olarak bulunur");
		System.out.println("��genin alan�= " +Alan+ " olarak bulunur.");
		
				

	}

}
