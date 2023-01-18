package estudo.exerciciosloops;

import java.util.Scanner;

public class EX4_MaioreMedia {
    public static void main(String [] args){

        Scanner scan = new Scanner (System.in);

        int numero ;

        // Variavel responsavel por guardar o maior numero digitado pelo usuario
        int maiorNum = 0;

        // Variavel vai armazenar a soma dos numeros

        int soma = 0;
        
        

        // repetindo 5 vezes da solicitação do numero
        
        // criando variavel para contar o laço
        int contador = 0;
        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma = numero + soma;
                System.out.println("Soma dos numeros: "+ soma);

            if (numero > maiorNum) maiorNum = numero;
            contador = contador + 1;
            System.out.println();
            System.out.println("contador igual a : "+contador);
        }while(contador < 5);

        System.out.println("Maior numero digitado foi o "+maiorNum);
   
        System.out.println("Fim do programa");
        
    }
    
}
