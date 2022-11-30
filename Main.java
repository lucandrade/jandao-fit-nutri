import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int dataNasc;
   
   
    do {
        System.out.println("(Fit&Nutri ) calcule Seu IMC ");
        System.out.print("data de Nacimento:");
        
        dataNasc = leitor.nextInt();
    } while(2022 - dataNasc < 18);
     
    System.out.println(" Nome  ");
    String nome = leitor.nextLine();
    
    System.out.println(" Sobre Nome  ");
    String Sex = leitor.nextLine();
    
    System.out.println(" Digite seu telefone > : ");
    String tel = leitor.nextLine();
    
    System.out.println(" Digite seu Email > : ");
    String Mail = leitor.nextLine();
   

    System.out.print("informe seu peso: ");
    double peso = leitor.nextDouble();
    System.out.print(" informe sua altura: ");
    double altura = leitor.nextDouble();
    double imc = peso / (altura * altura);
    System.out.println(" seu imc é: " + imc);

    if (imc < 16) {
        System.out.println("Sua classificação é Magreza grave"); }
        else if((imc >= 16) && (imc < 17)){
        System.out.println("Sua classificação é Magreza moderada"); }
        else if((imc >= 17) && (imc < 18.5)){
        System.out.println("Sua classificação é Magreza leve"); }
        else if((imc >= 18.5) && (imc < 25)){
        System.out.println("Sua classificação é Saudável"); }
        else if((imc >= 25) && (imc < 30)){
        System.out.println("Sua classificação é Sobrepeso"); }
        else if((imc >= 30) && (imc < 35)){
        System.out.println("Sua classificação é Obesidade Grau I"); }
        else if((imc >= 35) && (imc < 40)){
        System.out.println("Sua classificação é Obesidade Grau II"); }
        else{System.out.println("Sua classificação é Obesidade Grau III (mórbida)"); }
        System.out.println("\n");
        
        leitor.close();
    }
}
