package estudo.exerciciosArray;

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args){

        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0 ; i < numerosAleatorios.length; i++){

            int numero = random.nextInt(100);

            numerosAleatorios[i]= numero;

        }

        System.out.println("Numeros aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.println(numero +" ");
            
        }

        System.out.println("Sucessores dos numeros aletorios");
        for (int numero : numerosAleatorios) {
            System.out.println((numero+1) +" ");
            
        }
        System.out.println(" Antecessores dos numeros aletorios");
        for (int numero : numerosAleatorios) {
            System.out.println((numero-1) +" ");
            
        }




    }
}
