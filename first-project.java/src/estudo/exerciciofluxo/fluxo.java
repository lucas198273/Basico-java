package estudo.exerciciofluxo;

public class fluxo  {
    public static void main(String[] args){
        String dia = "sexta";
        switch (dia) {
            case "domingo":
            System.out.println("DOMINGO");
                break;
            case "segunda":
                System.out.println("segunda");
                break;
            case "terca":
                System.out.println("terca");
                break;
            case "quarta":
                System.out.println("quarta");
                break;
            case "quinta":
                System.out.println("sexta");
                break;
            case "sexta":
                System.out.println("sexta");
                break;
            case "sabado":
                System.out.println("sabado");
                break;
        
            default:
                break;
        }
    } 
}
