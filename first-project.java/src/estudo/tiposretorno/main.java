package estudo.tiposretorno;

public class main {

    public static void mai (String[] args){
        // Retornos
        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Area do quadrado: "+ areaQuadrado);


        double areaRetangulo = Quadrilatero.area(3,2);
        System.out.println("Area do quadrado: "+ areaRetangulo);

        double areaTrapezio = Quadrilatero.area(3,5,8);
        System.out.println("Area do quadrado: "+ areaTrapezio);
    }
    
}
