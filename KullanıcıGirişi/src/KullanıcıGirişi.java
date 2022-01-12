import java.util.Scanner;

public class KullanýcýGiriþi {

	public static void main(String[] args) {
		
		String userName, password, newPassword;
		Scanner inp=new Scanner(System.in);
		
		System.out.println("Kullanýcý adýnýzý giriniz: ");
		userName=inp.nextLine();
		
		System.out.println("Þifrenizi giriniz: ");
		password=inp.nextLine();
		 
		if(userName.equals("patika") && password.equals("java123")) {
			System.out.println("Giriþ yaptýnýz. Hoþgeldiniz.");
		}else{
			System.out.println("Þifre yanlýþ!");
			System.out.println("Þifrenizi sýfýrlamak isyitor musunuz?");
			System.out.println("1-Sýfýrla\n2-Sýfýrlama");
			
		int passChange;
		passChange=inp.nextInt();
		
		switch (passChange) {
		case (1):
			System.out.print("Yeni Þifreyi giriniz: " +inp.nextLine());
			newPassword=inp.nextLine();
			if(newPassword.equals("java123")) {
				System.out.println("Þifre oluþturulamadý, lütfen baþka þifre giriniz.");
			}else {
				System.out.println("Þifreniz oluþturuldu.");
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


