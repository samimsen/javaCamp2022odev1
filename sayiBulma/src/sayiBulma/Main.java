package sayiBulma;

public class Main {

	public static void main(String[] args) {
		
		int[] sayilar = new int[]{1,2,5,7,9,0};
		int aranacak = 111;
		boolean varMi = false;
		
		for (int sayi : sayilar) {
			if(sayi == aranacak) {
				varMi = true;
			}
		}
		
		if(varMi) {
			System.out.println("sayi mevcut");
		}else {
			System.out.println("sayi mevcut degil");
		}
	}

}
