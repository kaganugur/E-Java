import java.util.*;
public class Main {

	public static void main(String[] args) {
		int year;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Y�l giriniz: ");
		year=input.nextInt();
		
		if(year%100==0) {
			if(year%400==0) {
				System.out.println(year + " art�k y�ld�r.");
			} else {
				System.out.println(year + " art�k y�l de�ildir!");
			}
			}else if(year%4==0) {
				System.out.println(year + " art�k y�ld�r.");
			}else {
				System.out.println(year + " art�k y�l de�ildir!");
			}
		}
}
	
