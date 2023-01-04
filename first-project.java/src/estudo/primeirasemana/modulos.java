package estudo.primeirasemana;
public class modulos {

public static void main (String [] args){
    String meuNome ="\n Lucas";
    String meuSobrenome = "pereira";
    String nomeCompleto = nomeCompleto(meuNome, meuSobrenome);
    System.out.println(nomeCompleto);
}
public static String nomeCompleto(String meuNome, String meuSobrenome){
    return "Resultado do Metodo" + meuNome.concat(" ").concat(meuSobrenome) + " Dias";
}
}
