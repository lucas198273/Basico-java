package estudo.exerciciosloops;

import java.util.Scanner;

public class Ex3_ParImpar {
/*
 * Faça um programa que peça N numeros
 *calcule e mostre a quantidade de numeros 
 *pares e a quantidade de numeros impares.
*/
 public static void main(String [] args){

    Scanner scan = new Scanner(System.in);

    int quantidadeNumeros;
    int numero;
    int quantidadePares = 0;
    int quantidadeImpares = 0;

    System.out.println("Quantidade de numeros: ");
    quantidadeNumeros = scan.nextInt();

    int contador = 0;

    do{
        System.out.println("Numero: ");
        numero = scan.nextInt();

        if(numero % 2 ==0)quantidadePares++;
        else quantidadeImpares++;

        contador++;
        //contador = contador +1;

    } while(contador < quantidadeNumeros);

    System.out.println("Quantidade de pares: "+quantidadePares);
    System.out.println("Quantidade de impares: "+quantidadeImpares);
    System.out.println("fim do programa...");



    }
    
}
