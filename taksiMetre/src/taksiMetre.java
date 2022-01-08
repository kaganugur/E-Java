import java.util.Scanner;

public class taksiMetre {

	public static void main(String[] args) {
		int km;
		double perKm=2.20,startPrice=10,total;
		
		java.util.Scanner input=new Scanner(System.in);
		System.out.println("Mesafeyi kilometre cinsinden giriniz: ");
		
		km=input.nextInt(); 
		total = (km*perKm);
		total +=startPrice; 
		
		total=(total<20) ? 20 : total;
		
		System.out.println("Toplam ücret " +total+ "Tl");

	}

}
