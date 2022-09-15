package Main;

import Model.*;

public class Main {
    public static void main(String[] args) {

        Ambiente ambiente = new Ambiente(3);



        Tubarao tubarao1 = new Tubarao("Tanque","Fizz","Tubarao Branco","Macho",3,"ok",60);
        Gaviao gaviao1 = new Gaviao("Aviario","Quinn","Gaviao","Femea",2,"OK",true,"Boa");
        LoboGuara lobo1 = new LoboGuara("Toca do lobo","Warwick","Lobo Guara","Macho",12,"Mediano","Mediana");

        ambiente.setListaAnimais(0,"Toca do lobo",lobo1);
        ambiente.setListaAnimais(1,"Tanque",tubarao1);
        ambiente.setListaAnimais(2,"Aviario",gaviao1);

        Zoologico meuZoologico = new Zoologico("Zoologico de Zaun",ambiente);

        System.out.println("\n" + meuZoologico.getAmbiente());
    }


}
