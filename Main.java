//import C:/Users/DZM-DS/AppData/Local/atom/app-1.58.0/Conta.java;

public class Main{
  public static void main(String[] args) {
    Conta c1 = new Conta(100.0 , "jose augusto", "Corrente","11457425498");
    Conta c2 = c1;

    System.out.println(c1.recuperaDadosParaImpressao());

    if(c1==c2){
      System.out.println("iguais");
    }
    else{
      System.out.println("diferentes");
    }

  }
}
