package estudo.exerciciofluxo;

public class comparacao {
    
    public void main(String[] args){

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true; 
        boolean b4 = false;

        System.out.println("b1 && b2 = "+(b1 && b2));
        System.out.println("b1 && b3 = "+(b1 && b3));

        System.out.println("b2 || b3 = "+ (b2 || b3));
        System.out.println("b2 || b4 = "+(b2 || b4));

        System.out.println("b1 ^ b3 = "+ (b1 ^ b3));
        System.out.println("b4 ^ b2 = "+ (b4 ^ b2));

        
        System.out.println(!b1);
        System.out.println(!b2);

       
        
        int I1 = 10;
        int I2 = 5;
        float F1 = 20f;
        float F2 = 50f;
        
        System.out.println("(I1 + I2) < (F1 +F2) = " + (((I1 + I2) < (F1 + F2)) && true));
        System.out.println("(I1 > I2) || (F2 < F1) ="+((I1 > I2) || (F2 < F1)));


        double  salarioMensal = 1800;
        double mediaSalarial = 1300;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2 ;

        //Abaixo havera exemplos de 2 formas de se saber se a pessoa vai 
        //  receber auxilo ou nao


        // Primeiro exemplo

        boolean salarioBaixo = salarioMensal < mediaSalarial;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
        
       // System.out.println((salarioBaixo) && (muitosDependentes));

        // segundo exmplo  MAIS EFICIENTE

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        System.out.println("Recebe auxilio =" +recebeAuxilio);

    }
}
