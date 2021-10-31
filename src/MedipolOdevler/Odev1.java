package MedipolOdevler;
import java.util.Scanner;
import java.lang.Math;

public class Odev1 {

	public static void main(String[] args) {

		//ax^2 + bx + c = 0
		//Diskriminant > Delta=b^2–4ac

		double Diskriminant;
		double x1;
		double x2;

		System.out.println("Bir iki bilinmeyenli denklemin (ax^2 + bx + c = 0) köklerini bulabilmek için denklemin a, b ve c deðiþkenlerinin kullanýlmasý gerekmektedir.");
		System.out.println("Denklemin köklerine x1 ve x2 diyelim,");
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen denklemin a deðerini giriniz: ");
		double a = scan.nextInt();
		System.out.println("Lütfen denklemin b deðerini giriniz: ");
		double b = scan.nextInt();
		System.out.println("Lütfen denklemin c deðerini giriniz: ");
		double c = scan.nextInt();
		Diskriminant = (b*b)-(4*a*c);

		 if(Diskriminant < 0){

			 System.out.println("Denklemin gerçel sayýlarla ifade edilebilecek bir kökü yoktur.");
			 System.out.printf("Çünkü denklemin diskriminantý: %.1f", Diskriminant);

		 }
		 else if(Diskriminant == 0){

			 x1=x2=-b/(2*a);
			 System.out.println("Denklemin, deðerleri birbirine eþit olan iki kökü vardýr.");
			 System.out.printf("Bunlar: %.1f ve %.1f dir.", x1,x2);

		 }
		 else if(Diskriminant > 0){

			 x1=(-b+(Math.sqrt(Diskriminant))/(2*a));
			 x2=(-b-(Math.sqrt(Diskriminant))/(2*a));
			 System.out.println("Denklemin birbirinden farklý iki gerçel kökü vardýr.");
			 System.out.printf("Bunlar: %.2f ve %.2f dir.",x1,x2);








		 }






	}

}