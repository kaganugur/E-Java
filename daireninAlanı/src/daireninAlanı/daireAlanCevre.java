package daireninAlaný;

import java.util.Scanner;

public class daireAlanCevre {

	public static void main(String[] args) {
		int r;
		double pi=3.14, cevre, alan;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Yarýçapý giriniz: ");
		
		r=input.nextInt();
		cevre=2*pi*r;
		alan=pi*r*r;
		
		System.out.println("Dairenin çevresi: " +cevre);
		System.out.println("Dairenin alaný: " +alan);

	}

}
