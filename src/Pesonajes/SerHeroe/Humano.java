package Pesonajes.SerHeroe;

import MainSeniorAnillos.Datos;

public class Humano extends Heroe {

    public Humano() {
        super(150, Datos.getNumeroRandom(70, 25,false), "Humano");
    }

}
