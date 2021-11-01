public class Fibonacci{
	public static void main(String[] args){
		int termo, termoAtual = 1;
		while (termoAtual<100){
				termo=termoAtual;	
				System.out.print(", " + termoAtual);
				termoAtual+=termo;	
		}
	}
}