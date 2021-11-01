public class Fatoriais{
	public static void main(String[] args){
		long resultado=1;
		int fatorial=50;
		while (fatorial>0){
			resultado = resultado*fatorial;
			fatorial--;
		}
		System.out.println(resultado);
	}
}