package estudo.exerciciosloops;

import java.util.Scanner;

public class EX5_Tabuada {

    //*  Aprenderemos loop FOR
    // Desenvolveremos uma tabuada 
    //O usuario vai informar um valor e nos iremos retornar a tabuada do valor informado
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int  tabuada = scan.nextInt();


        System.out.println("Tabuada de "+tabuada);

        //  for (int count ; condição; TaxaCrescimento ;){ }
                                
        for(int i = 1 ; i <= 10; i++ ){

            //primeira forma e em minha opniao a mais eficiente
            int resultado;
            resultado= tabuada * i;
            System.out.println(tabuada + "*" +i +"=" +resultado);
            
            //segunda forma
            
            //System.out.println(tabuada +"*"+i +"="+(tabuada * i) );

        }

    }
    
}
