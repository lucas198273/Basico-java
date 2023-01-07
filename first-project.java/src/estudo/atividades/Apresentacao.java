package estudo.atividades;

import java.util.Locale;
import java.util.Scanner;

public class Apresentacao {
    public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US) ;

    System.out.println("Digite sua altura");
    double altura = scanner.nextDouble();


    System.out.println("digite seu nome");
    String nome = scanner.next();

    System.out.println("Digite seu sobrenome");
    String sobrenome = scanner.next();

    System.out.println("qual sua idade");
    int idade = scanner.nextInt();


    System.out.println("Ola eu me chamo " + nome + " " + sobrenome);
        System.out.println("tenho " + idade + " anos");
        System.out.println("minha altura é " + altura + "cm");
        



}}
