import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		double n,i = 0,toplam= 0,ort = 0;
		Scanner inp = new Scanner(System.in);
		System.out.print("Bir Sayi Giriniz: ");
		n = inp.nextDouble();
		while (i<=n) {
			if ((i%3==0) && (i%4==0)) {
				toplam+=i;
				System.out.println("3'e ve 4'e bolunen sayilar: "+i);
			}
			i++;
		}		
		System.out.println("Sayilarin Toplami: "+toplam);
		ort = toplam/n;
		System.out.println("Sayilarin Ortalamasi: "+ort);

	}

}
