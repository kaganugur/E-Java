import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ay, gun;
        Scanner scan = new Scanner(System.in);
        System.out.print("Hangi ayda do�dunuz?(1-12): ");
        ay = scan.nextInt();
        System.out.print("Hangi g�n do�dunuz?(1-31): ");
        gun = scan.nextInt();
        if (ay == 1) {
            if (gun < 21) {
                System.out.println("O�lak burcusun. ");
            } else {
                System.out.println("Kova burcusun. ");
            }
        } else if (ay == 2) {
            if (gun < 19) {
                System.out.println("Kova burcusun. ");
            } else {
                System.out.println("Bal�k burcusun. ");
            }
        } else if (ay == 3) {
            if (gun <= 20) {
                System.out.println("Bal�k burcusun. ");
            } else {
                System.out.println("Ko� burcusun. ");
            }
        }else if (ay == 4) {
            if (gun <= 20) {
                System.out.println("Ko� burcusun. ");
            } else {
                System.out.println("Bo�a burcusun. ");
            }
        }else if (ay == 5) {
            if (gun <= 21) {
                System.out.println("Bo�a burcusun. ");
            } else {
                System.out.println("�kizler burcusun. ");
            }
        }else if (ay == 6) {
            if (gun <= 21) {
                System.out.println("�kizler burcusun. ");
            } else {
                System.out.println("Yenge� burcusun. ");
            }
        }else if (ay == 7) {
            if (gun <= 22) {
                System.out.println("Yenge� Burcusunuz. ");
            } else {
                System.out.println("Aslan Burcusunuz. ");
            }
        }else if (ay == 8) {
            if (gun <= 22) {
                System.out.println("Aslan Burcusunuz. ");
            } else {
                System.out.println("Ba�ak Burcusunuz. ");
            }
        }else if (ay == 9) {
            if (gun <= 22) {
                System.out.println("Ba�ak Burcusunuz. ");
            } else {
                System.out.println("Terazi Burcusunuz. ");
            }
        }else if (ay == 10) {
            if (gun <= 22) {
                System.out.println("Terazi Burcusunuz. ");
            } else {
                System.out.println("Akrep Burcusunuz. ");
            }
        }else if (ay == 11) {
            if (gun <= 21) {
                System.out.println("Akrep Burcusunuz. ");
            } else {
                System.out.println("Yay Burcusunuz. ");
            }
        }else if (ay == 12) {
            if (gun <= 21) {
                System.out.println("Yay Burcusunuz. ");
            } else {
                System.out.println("O�lak Burcusunuz. ");
            }
        }
    }
}