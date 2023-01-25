package estudo.tiposretorno;

public class Quadrilatero {
    public static double area( double lado){
        System.out.println("Área do quadrilatero: ");
        return lado*lado;
    } 
    public static double area ( double lado1, double lado2){
        System.out.println("Área do retangulo: ");
        return lado1*lado2;
    }
    public static double area (double baseMaior, double baseMenor, double altura){
        System.out.println("Area do trapezio: ");
        return ((baseMaior + baseMenor)*altura)/2;
    }
    public static float area(float diagonal1, float diagonal2){
        System.out.println("Área do losango: ");
        return (diagonal1+diagonal2)/2;
    }
    
}
