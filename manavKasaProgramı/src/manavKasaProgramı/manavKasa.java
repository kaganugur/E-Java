package manavKasaProgram�;

import java.util.Scanner;
public class manavKasa {

	public static void main(String[] args) {
		double kg,total,armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5;
	
	Scanner input=new Scanner(System.in);
	
	System.out.println("Armut ka� kilo:");
	kg=input.nextDouble();
	
	System.out.println("Elma ka� kilo:");
	kg=input.nextDouble();

	System.out.println("Domates ka� kilo:");
	kg=input.nextDouble();
	
	System.out.println("Muz ka� kilo:");
	kg=input.nextDouble();
	
	System.out.println("Patl�can ka� kilo:");
	kg=input.nextDouble();
	
	total=(armut*kg)+(elma*kg)+(domates*kg)+(muz*kg)+(patlican*kg);
			
	System.out.println("Toplam al��veri� tutar�n�z: " +total+ "TL");
	}

}
