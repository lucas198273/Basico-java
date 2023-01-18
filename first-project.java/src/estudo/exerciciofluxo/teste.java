package estudo.exerciciofluxo;

public class teste {
    public static void main(String[] args){

        int  salarioMensal = 1300;
        double mediaSalarial = 1300;

        int quantidadeDependentes = 1;
        int mediaDependentes = 2 ;

        boolean salarioBaixo = salarioMensal <= mediaSalarial;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        System.out.println("Recebe auxilio = " +recebeAuxilio);

        
    }
    
}
