import java.util.Scanner;

public class Kullan�c�Giri�i {

	public static void main(String[] args) {
		
		String userName, password, newPassword;
		Scanner inp=new Scanner(System.in);
		
		System.out.println("Kullan�c� ad�n�z� giriniz: ");
		userName=inp.nextLine();
		
		System.out.println("�ifrenizi giriniz: ");
		password=inp.nextLine();
		 
		if(userName.equals("patika") && password.equals("java123")) {
			System.out.println("Giri� yapt�n�z. Ho�geldiniz.");
		}else{
			System.out.println("�ifre yanl��!");
			System.out.println("�ifrenizi s�f�rlamak isyitor musunuz?");
			System.out.println("1-S�f�rla\n2-S�f�rlama");
			
		int passChange;
		passChange=inp.nextInt();
		
		switch (passChange) {
		case (1):
			System.out.print("Yeni �ifreyi giriniz: " +inp.nextLine());
			newPassword=inp.nextLine();
			if(newPassword.equals("java123")) {
				System.out.println("�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz.");
			}else {
				System.out.println("�ifreniz olu�turuldu.");
			}
			break;
			
		case(2):
			System.out.println("Daha sonra tekrar deneyiniz..");
		default:
			break;
		}
		
		
		
		
		
		
		}
		
			
		}
	}


