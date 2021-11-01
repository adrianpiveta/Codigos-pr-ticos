import java.util.Scanner;

public class Final1{
	public static void main(String[] args){
	System.out.print("Digite o numero");
	int entrada = new Scanner(System.in).nextInt();
	while (entrada>1){
		System.out.print(entrada +" -> ");
		if(entrada%2==0){
			entrada=entrada/2;
		}
		else{
			entrada = 3 * entrada +1;
		}	

	}
	System.out.print(entrada);
	}
}