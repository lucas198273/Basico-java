package estudo.exerciciosArray;

public class teste {
    public static void main(String [] args){

        String[] no = {"lucas", "dia"  , "pereira"};
        System.out.println(no.length);
    
        int num = 5, count = 1;
       // while(count <= 3){
      //      ++count;
       //     num += count;
       // }
       // System.out.println(num);

        int num2 = 5 , count2 = 1;
        do{
            num2 += count2;
            System.out.println(num);
            
        }while(count2<=3);

        int [] [] numeros = {{4,39,8,5},{3,0,1,5},{1,2,7,4}};
        System.out.print(numeros[2][2]);
    }
    
}
