import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int km, age, flyOption;
		double totalPrice,pricePerKm=0.10,discountPrice;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Mesafeyi km türünden giriniz: ");
		km=input.nextInt();
		
		System.out.print("Yaþýnýzý giriniz: ");
		age=input.nextInt();
		
		System.out.print("Yolculuk tipini giriniz(1=>Tek Yön, 2=>Gidiþ Dönüþ): ");
		flyOption=input.nextInt();
		
		if(age<0 || km<0 || (flyOption!=1 && flyOption!=2)) {
			System.out.println("Yanlýþ bilgi girdiniz.");
		}else {
			totalPrice=km*pricePerKm;
			if(age<12) {
				if(flyOption==2) {
					discountPrice=2*((totalPrice-(totalPrice*0.5))*0.8);
					System.out.println(discountPrice);
				}else {
					discountPrice=totalPrice-totalPrice*0.5;
					System.out.println(discountPrice);
				}
			}
			else if(age<24) {
				if(flyOption==2) {
					discountPrice=2*((totalPrice-(totalPrice*0.1))*0.8);
					System.out.println(discountPrice);
				}
				else {
					discountPrice=totalPrice-totalPrice*0.3;
					System.out.println(discountPrice);
				}
			}
			else if(age>65) {
				if(flyOption==2) {
					discountPrice=2*((totalPrice-(totalPrice*0.3))*0.8);
					System.out.println(discountPrice);
				}
				else {
					discountPrice=totalPrice-totalPrice*0.3;
				}
			}
			else {
				if(flyOption==2) {
					discountPrice=2*(totalPrice*0.8);
					System.out.println(discountPrice);
				}
				else {
					discountPrice=totalPrice;
					System.out.println(discountPrice);
				}
			}
			
		}
		
	}

}
