package MedipolOdevler;
import java.util.Scanner;
import java.lang.Math;

public class Odev1 {

	public static void main(String[] args) {

		//ax^2 + bx + c = 0
		//Diskriminant > Delta=b^2�4ac

		double Diskriminant;
		double x1;
		double x2;

		System.out.println("Bir iki bilinmeyenli denklemin (ax^2 + bx + c = 0) k�klerini bulabilmek i�in denklemin a, b ve c de�i�kenlerinin kullan�lmas� gerekmektedir.");
		System.out.println("Denklemin k�klerine x1 ve x2 diyelim,");
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen denklemin a de�erini giriniz: ");
		double a = scan.nextInt();
		System.out.println("L�tfen denklemin b de�erini giriniz: ");
		double b = scan.nextInt();
		System.out.println("L�tfen denklemin c de�erini giriniz: ");
		double c = scan.nextInt();
		Diskriminant = (b*b)-(4*a*c);

		 if(Diskriminant < 0){

			 System.out.println("Denklemin ger�el say�larla ifade edilebilecek bir k�k� yoktur.");
			 System.out.printf("��nk� denklemin diskriminant�: %.1f", Diskriminant);

		 }
		 else if(Diskriminant == 0){

			 x1=x2=-b/(2*a);
			 System.out.println("Denklemin, de�erleri birbirine e�it olan iki k�k� vard�r.");
			 System.out.printf("Bunlar: %.1f ve %.1f dir.", x1,x2);

		 }
		 else if(Diskriminant > 0){

			 x1=(-b+(Math.sqrt(Diskriminant))/(2*a));
			 x2=(-b-(Math.sqrt(Diskriminant))/(2*a));
			 System.out.println("Denklemin birbirinden farkl� iki ger�el k�k� vard�r.");
			 System.out.printf("Bunlar: %.2f ve %.2f dir.",x1,x2);








		 }






	}

}