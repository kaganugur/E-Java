package weather;

import java.util.Scanner;
public class weather {

	public static void main(String[] args) {
		int heat;
		
		Scanner input=new Scanner(System.in);
		System.out.println("S�cakl�k giriniz: ");
		heat=input.nextInt();
		
		if(heat<5) {
			System.out.println("Kayak yapmaya gidebilirsin.");
		}else if(heat>=5 && heat<= 25){
			if(heat<= 15){
				System.out.println("Sinemaya gidebilirsin.");
			}
			if(heat>=10) {
				System.out.println("Pikni�e gidebilirsin.");
			}
		}else if(heat>25) {
			System.out.println("Y�zmeye gidebilirsin.");
		}
		
		
	}
}
