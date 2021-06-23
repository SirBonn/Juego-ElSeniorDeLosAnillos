package Pesonajes.SerBestia;

import MainSeniorAnillos.Datos;
import Pesonajes.Ser;
import Pesonajes.SerHeroe.Heroe;

public class Orco extends Bestia {

    public Orco() {
        super(300, Datos.getNumeroRandom(40, 20, false), "Orco");
    }

    @Override
    public int getArmadura(Ser objetivo) {
        if (objetivo instanceof Heroe) {
            System.out.println("Ataque de Elfo enrabiao");
            return this.getArmadura() - 10;
        }
        return super.getArmadura();
    }

}
