import java.util.Scanner;


public class hipotenusHesap {

	public static void main(String[] args) {
		
		int a,b;
		double c,u,Alan;
		double cevre;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Birinci kenar uzunluðunu giriniz: " );
		a=input.nextInt();
		System.out.println("Ýkinci kenar uzunluðunu giriniz: ");
		b=input.nextInt();
		System.out.println("Üçüncü kenar uzunluðunu giriniz: ");
		c=input.nextInt();
		
		//c=Math.sqrt((a*a)+(b*b)); //Dik üçgen de hipotenüsü bulmak için kullanýlan formül
		
		
		//System.out.println("Hipotenüs uzunluðu: " +c+ " olarak bulunur.");
		
		cevre=a+b+c;
		u=(a+b+c)/2;
		Alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
				
		System.out.println("Üçgenin çevresinin uzunluðu " +cevre+ " olarak bulunur");
		System.out.println("Üçgenin alaný= " +Alan+ " olarak bulunur.");
		
				

	}

}
