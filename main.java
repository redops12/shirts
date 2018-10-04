package shirts;

import java.util.Scanner;
import java.io.*;

class main{
	Scanner csv = new Scanner(new FileReader("shirts/shirts.csv"));
	Order[] shirts = new Order[42];
	main () throws IOException{
		csv.nextLine();
		for (int i = 0; i < shirts.length; i++){
			shirts[i] = new Order(csv.nextLine());
		}
		for (Order order : shirts){
			System.out.println(order.name);
		}
	}
	public static void main(String[] args) throws IOException{
		new main();
	}
}