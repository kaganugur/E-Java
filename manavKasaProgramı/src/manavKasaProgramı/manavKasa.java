package manavKasaProgramý;

import java.util.Scanner;
public class manavKasa {

	public static void main(String[] args) {
		double kg,total,armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5;
	
	Scanner input=new Scanner(System.in);
	
	System.out.println("Armut kaç kilo:");
	kg=input.nextDouble();
	
	System.out.println("Elma kaç kilo:");
	kg=input.nextDouble();

	System.out.println("Domates kaç kilo:");
	kg=input.nextDouble();
	
	System.out.println("Muz kaç kilo:");
	kg=input.nextDouble();
	
	System.out.println("Patlýcan kaç kilo:");
	kg=input.nextDouble();
	
	total=(armut*kg)+(elma*kg)+(domates*kg)+(muz*kg)+(patlican*kg);
			
	System.out.println("Toplam alýþveriþ tutarýnýz: " +total+ "TL");
	}

}
