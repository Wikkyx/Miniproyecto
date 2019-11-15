import java.util.Scanner;

public class MenuConCero {
	public static void main(String[] args) {
		char quit = 'n';
		String input;
		int choice = 0;
		double popcorn=1.50, refresco=1.30;
		double costo_p=0, costo_r,costo;
		int n,i, cantidad_p, cantidad_r;
		
		
		Scanner sc = new Scanner(System.in);
		
		while (choice == 0) {
			System.out.println ("Su orden"
					+ "\n1. Pop"
					+ "\n2. Refresco"
					+ "\n0. Salir");
			choice = sc.nextInt();
			
			switch (choice) {
				case 1:
					System.out.println("¿Cuántos deseas?");
					cantidad_p = sc.nextInt();
					costo_p = cantidad_p*popcorn;
					break;
				case 2:
					System.out.println("Refresco");
					break;
		
			}
			
			System.out.print("Would you like to quit y/n?  ");
			costo = costo_p;      
			System.out.printf("Costo total %.2f", costo);
			input = sc.next().toLowerCase();
			quit = input.charAt(0);
		}
	}
}
