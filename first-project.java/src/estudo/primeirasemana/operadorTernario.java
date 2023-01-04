package estudo.primeirasemana;

public class operadorTernario {
    public static void main (String[] args){
        //operador ternario
        // <expressão condicion > ? <Caso condição true>
        // < caso condição false>

        // condicional
        int a , b ;

        a = 15;
        b = 14;

        int resultado = a==b ? 1:0;     // 1 == verdadeiro 
                                        // 0 == falso

////////String resultador = a==b? "verdadeiro ":"false"; // lembra lambda

///////////////////////////////
///      if (a==b)
///          resultado = "verdadeiro";
///      else
///         resultado = "falso";
///////////////////////////////
        System.out.println(resultado);


    }  
    
}
