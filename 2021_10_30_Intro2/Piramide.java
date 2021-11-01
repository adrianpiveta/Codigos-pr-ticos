import java.util.Scanner;

public class Piramide{
	public static void main(String[] args){
		System.out.print("Digite o tamanho n");
		int entrada = new Scanner(System.in).nextInt();
		for (int b=1; b<=entrada; b++){
			for(int a=1; a<=b; a++){
				System.out.print(a*b + " ");
			}
			System.out.println("\n");
		}
	}
}