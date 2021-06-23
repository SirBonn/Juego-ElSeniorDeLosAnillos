package Pesonajes.SerHeroe;

import MainSeniorAnillos.Datos;
import Pesonajes.Ser;
import Pesonajes.SerBestia.Orco;

public class Hobbit extends Heroe {
    public Hobbit() {
        super(200, Datos.getNumeroRandom(40, 20, false), "Hobbit");
    }

    @Override
    public int getAtaque(Ser objetivo) {
        if (objetivo instanceof Orco) {
            System.out.println("Ataque con miedo");
            return this.getAtaque() - 5;
        }
        return super.getAtaque();
    }


}
