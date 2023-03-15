import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Tutar giriniz :");
		double price = input.nextDouble();
		
		System.out.print("Kart No giriniz :");
		String cardNumber = input.next();
		
		System.out.print("Son Kullanim Tarihi giriniz :");
		String date = input.next();
		
		System.out.print("Guvenlik Kodu giriniz :");
		String cvc = input.next();
		
		System.out.println("1. A Bankasi");
		System.out.println("2. B Bankasi");
		System.out.println("3. C Bankasi");
		System.out.println("Banka Seciniz :");
		int selectBank = input.nextInt();
		
		switch (selectBank) {
		case 1:
			ABankasi aPos = new ABankasi("A Bankasi", "2342234234","231221");
			aPos.connect("127.1.1.1");
			aPos.payment(price, cardNumber, date, cvc);
			break;
		case 2:
			BBankasi bPos = new BBankasi("A Bankasi", "2342234234","231221");
			bPos.connect("127.1.1.1");
			bPos.payment(price, cardNumber, date, cvc);
			break;
		default:
				System.out.println("Gecerli Banka Giriniz !");
		}
		
	}

}
