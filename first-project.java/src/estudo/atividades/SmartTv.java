package estudo.atividades;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
        System.out.println("Status : Televisao Ligada");
    }
    public void desligar(){
        ligada = false;
        System.out.println("Status:  Televisao Desligada");
        
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Canal Atual: "+ novoCanal);
    }
    public void aumentarVolume(){
        //volume = volume +1;
        volume++;
        System.out.println("Volume Aumentado para: " + volume);
    }
    public void diminuirVolume(){
        //volume = volume -1;
        volume--;
        System.out.println("Volume Dimunuido para: "+ volume);
    }
    public void aumanetarCanal(){
        canal++;
        System.out.println("Canal atual: " + canal);
    }
    public void diminuirCanal(){
        canal--;
        System.out.println("Canal atual:: "+ canal);
    }

}
