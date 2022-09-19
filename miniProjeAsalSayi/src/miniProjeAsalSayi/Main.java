package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		
		int number = 17;
		int remainder = number % 2;
		boolean isPrime = true;

		
		for(int i = 2; i<number;i++) {
			if(number % i == 0) {
				isPrime = false;
			}
		}
		
		if(number == 1) {
			System.out.println("sayi asal degildir.");
			return;
		}
		
		if(number<1){
			System.out.println("Geçersiz sayi.");
			return;
			
		}
		
		if(isPrime) {
			System.out.println("Sayi asaldir");
		}else {
			System.out.println("Sayi asal degildir.");
		}
		
	}

}
