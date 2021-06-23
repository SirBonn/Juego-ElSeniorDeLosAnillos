package MainSeniorAnillos;

import Pesonajes.Ser;
import Pesonajes.SerBestia.Bestia;
import Pesonajes.SerBestia.Orco;
import Pesonajes.SerBestia.Trasgo;
import Pesonajes.SerHeroe.Elfo;
import Pesonajes.SerHeroe.Heroe;
import Pesonajes.SerHeroe.Hobbit;
import Pesonajes.SerHeroe.Humano;

public class JuegoSeniorAnillos {
    private Bestia[] ejercitoBestias;
    private Heroe[] ejercitoHeroe;
    private int muertos = 0;

    public JuegoSeniorAnillos() {
        ejercitoBestias = new Bestia[10];
        ejercitoHeroe = new Heroe[10];
        nuevaPartida();
    }

    public void mostrarEjercitos() {
        for (int i = 0; i < ejercitoBestias.length; i++) {
            System.out.println(
                    (i + 1) + ".  " + ejercitoHeroe[i].toString() + "\t\tvs\t\t" + ejercitoBestias[i].toString());
        }
    }

    public void nuevaPartida() {
        enlistarEjercitoBestias();
        enlistarEjercitoHeroes();
        System.out.println("\n\n");
        enfrentarEjercitos();
    }

    private void enlistarEjercitoBestias() {

        for (int i = 0; i < ejercitoBestias.length; i++) {
            switch (Datos.getNumeroRandom(2, 1, false)) {
                case 1:
                    ejercitoBestias[i] = new Orco();
                    break;
                case 2:
                    ejercitoBestias[i] = new Trasgo();
                    break;
            }

        }

    }

    private void enlistarEjercitoHeroes() {
        for (int i = 0; i < ejercitoHeroe.length; i++) {
            switch (Datos.getNumeroRandom(3, 1, false)) {
                case 1:
                    ejercitoHeroe[i] = new Hobbit();
                    break;
                case 2:
                    ejercitoHeroe[i] = new Elfo();
                    break;
                case 3:
                    ejercitoHeroe[i] = new Humano();
            }
        }
    }

    private void enfrentarEjercitos() {
        do {
            mostrarEjercitos();
            int slot = Datos.getNumero("Turno de Heroes\nCon que heroe deseas pelear?", true);
            Datos.epserar("---Pulsa para lanzar dados de ataque---");
            ejercitoHeroe[slot].setAtaque(Datos.getNumeroRandom(100, 1, true));
            ejercitoHeroe[slot].atacar(ejercitoBestias[slot]);
            murio(ejercitoBestias[slot], slot);
            Datos.epserar("---Pulsa para continuar---");
            mostrarEjercitos();
            slot = Datos.getNumero("\n\nTurno de Bestias\nCon que heroe deseas pelear?", true);
            Datos.epserar("---Pulsa para lanzar dados de ataque---");
            ejercitoBestias[slot].setAtaque(Datos.getNumeroRandom(90, 1, false));
            ejercitoBestias[slot].atacar(ejercitoHeroe[slot]);
            murio(ejercitoHeroe[slot], slot);
            System.out.println("Numero de bajas: " +muertos);
        } while (this.muertos < 10);
    }

    private void murio(Ser ser, int slot){
        if (ejercitoBestias[slot].isMuerto()) {
            this.muertos++;
        }
    }
}
