package estudo.primeirasemana;

public class operBollean {
    public static void main(String[] args){
        
        int numero1 = 8;
        int numero2 = 7;

        boolean simNao = numero1 == numero2;

        if(numero1 == numero2){ //igual
            System.out.println("valor um é igual a valor dois: " + simNao);
        }
        simNao = numero1 != numero2;
        if(numero1 != numero2 ){ // diferente
            System.out.print("\nvalor um é diferente do valor dois: " + simNao);
        }
        simNao = numero1 > numero2;
        if ( numero1 > numero2){ // maior que...
            System.out.println("\nvalor um maior que valor dois: "+ simNao);
        }
        simNao = numero1 < numero2;
        if (  numero1 < numero2){ //menor que...
            System.out.println("\nvalor um menor que numero dois: "+ simNao);
        }

       
      
    }}
