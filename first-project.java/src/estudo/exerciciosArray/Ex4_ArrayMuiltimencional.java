package estudo.exerciciosArray;

import java.util.Random;

public class Ex4_ArrayMuiltimencional {
 // Vamos gerar uma matriz 4x4 com valores aleatorios entre 0-9

    public static void main(String[] args){

        Random random = new Random();
       // primeira abertura de []  representa a linha
       // segunda abertura de [] representa coluna
            // 4 linhas e 4 colunas
        int[] [] M = new int [4] [4];

        for(int i = 0; i < M.length; i++){// primeiro for entra em linha
            for (int j = 0; j < M[i].length;j++){// segudo for percorre todos elemnetos da linha
                M[i][j] = random.nextInt(9);
            } 
        
        }System.out.println("Matriz");
        for( int [] linha: M){
            for(int elementoColuna : linha){
                System.out.print(elementoColuna + " ");
            }
            System.out.println("\n");
        }
    
    }
}
