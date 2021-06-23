package Pesonajes.SerHeroe;

import MainSeniorAnillos.Datos;
import Pesonajes.Ser;
import Pesonajes.SerBestia.Trasgo;

public class Elfo extends Heroe {

    public Elfo() {
        super(250, Datos.getNumeroRandom(50, 25, false), "Elfo");
    }

    @Override
    public int getAtaque(Ser objetivo) {
        if (objetivo instanceof Trasgo) {
            System.out.println("Ataque de Elfo enrabiao");
            return this.getAtaque() + 10;
        }
        return this.getAtaque();
    }

}
