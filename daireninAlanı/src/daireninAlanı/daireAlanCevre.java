package daireninAlan�;

import java.util.Scanner;

public class daireAlanCevre {

	public static void main(String[] args) {
		int r;
		double pi=3.14, cevre, alan;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Yar��ap� giriniz: ");
		
		r=input.nextInt();
		cevre=2*pi*r;
		alan=pi*r*r;
		
		System.out.println("Dairenin �evresi: " +cevre);
		System.out.println("Dairenin alan�: " +alan);

	}

}
