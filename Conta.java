import java.util.*;
import java.text.*;

public class Conta{
  private double saldo;
  private String titular;
  private String cpf;
  private Date dataAbertura;
  private String tipo;

  boolean sacar(double valor){
    if(saldo>=valor){
      this.saldo=saldo - valor;
      return true;
    }
    else{
      return false;
    }
  }
  void depositar(double valor){
    if(valor>0){
      this.saldo=saldo+valor;
    }
  }
  double calculaRendimento(){
    return this.saldo*0.1;
  }

  double verificaSaldo(){
    return this.saldo;
  }

  String verificaTitular(){
    return this.titular;
  }

  String getDataAbertura(){
    SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
    return formatoData.format(dataAbertura);
  }

  String recuperaDadosParaImpressao(){
    return ( "Saldo: " + String.valueOf(this.saldo) + "\n" +
              "CPF: " + this.cpf + "\n" +
              "Titular: " +this.titular + "\n" +
              "Data de abertura: " + this.getDataAbertura() + "\n" +
              "Tipo: " + this.tipo );
  }

  public Conta(double saldo, String titular, String tipo, String cpf){
    this.saldo=saldo;
    this.titular=titular;
    this.cpf=cpf;
    this.dataAbertura= new Date();
    this.tipo=tipo;
  }

}
