package estudo.exerciciosArray;

public class Ex1_OrdemInversa {

    // Criando um vetor de 6 numeros Inteiros e mostrando de forma inversa
    public static void main(String[] args ){

        int[] vetor = {1, -5 ,8, -45 , 5, 4};
        // vetor possui 6 elementos e cinco posiçoes 
        int count = 0;
        // vamos treinar com While
        //System.out.println(vetor.length);
        System.out.println("vetor: ");
                        // length retorna o tamanho do Array 
        while(count < (vetor.length )){

            // percorrendo vetor
            System.out.print(vetor[count] + " ");
            count++;

        }


        System.out.println("\n vetor: ");
        for( int i = (vetor.length- 1); i >= 0 ; i-- ){

          System.out.println(vetor[i]+ " ");
        }
    }
    
}
