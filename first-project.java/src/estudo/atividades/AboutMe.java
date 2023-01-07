package estudo.atividades;



public class AboutMe {
    public static void main (String[] args){    // os argumentos como a idade nome  e altura fora passados na confirguraçoes java\vscode\luach.json 
        
        String nome = args[0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        

        System.out.println("Ola eu me chamo " + nome + " " + sobrenome);
        System.out.println("tenho " + idade + " anos");
        System.out.println("minha altura é " + altura + "cm");
        

        


    }
    
}
