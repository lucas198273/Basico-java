package estudo.atividades;

public class Usuario {

    public static void main(String[] args) throws Exception{
        SmartTv smartTv = new SmartTv();
        
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("volume atual :" +smartTv.volume);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("volume atual: "+ smartTv.volume);

        System.out.println("TV ligada: " + smartTv.ligada);
        System.out.println("canal atual: "+ smartTv.volume);
        System.out.println("Canal atual: "+ smartTv.canal);
     
        smartTv.ligar();
        System.out.println("Novo Status => TV Ligada ?" + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status => TV Ligada?" + smartTv.ligada);
        
        smartTv.mudarCanal(5);
        smartTv.mudarCanal(6);
        smartTv.mudarCanal(8);

        smartTv.desligar();
        smartTv.ligar();
        smartTv.mudarCanal(87);
    } 



}
