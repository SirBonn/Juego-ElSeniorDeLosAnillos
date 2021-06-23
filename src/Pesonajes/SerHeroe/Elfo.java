package Pesonajes.SerHeroe;

import MainSeniorAnillos.Datos;
import Pesonajes.Ser;
import Pesonajes.SerBestia.Orco;

public class Elfo extends Heroe {

    public Elfo() {
        super(250, Datos.getNumeroRandom(75, 25, false), "Elfo");
    }

    @Override
    public int getAtaque(Ser objetivo) {
        if (objetivo instanceof Orco) {
            System.out.println("Ataque de Elfo enrabiao");
            return this.getAtaque() + 10;
        }
        return this.getAtaque();
    }

}
