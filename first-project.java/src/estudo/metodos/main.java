package estudo.metodos;

public class main {
    public static void main(String[] args){

        //Calculadora
        System.out.println("Exercicio Calculadora");
        Calculadora.soma(5,6);
        Calculadora.subtração(10, 100);
        Calculadora.divisao(5, 25);
        Calculadora.multiplicacao(45,2);

        //Mensagem
        System.out.println("EXERCICIO MENSAGEMS");
        
    Menssagem.obterMenssagem(4);
    Menssagem.obterMenssagem(14);
    Menssagem.obterMenssagem(7);
    
        //Emprestimo
    System.out.println("\nEmprestimo \n");
    System.out.println("Exercicio Emprestimo");
    Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
    Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
    Emprestimo.calcular(1500, Emprestimo.getDuasParcelas());
    Emprestimo.calcular(1500,Emprestimo.getTresParcelas());
}
}
