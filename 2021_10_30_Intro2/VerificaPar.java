import java.util.Scanner;

public class VerificaPar{
	public static void main(String[] args){
		System.out.print("Digite o valor de teste: ");
		Scanner entrada = new Scanner(System.in);
		if((int) entrada.nextInt() %2 ==0){
			System.out.println("É par");
		}
		else{
			System.out.println("É impar");
		}
	}
}