package MainSeniorAnillos;

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

    public JuegoSeniorAnillos() {
        ejercitoBestias = new Bestia[10];
        ejercitoHeroe = new Heroe[10];
        nuevaPartida();
    }

    public void mostrarEjercitos(){
        for (int i = 0; i<ejercitoBestias.length;i++){
            System.out.println(ejercitoHeroe[i].toString() +"\t\tvs\t\t" +ejercitoBestias[i].toString());
        }
    }

    public void nuevaPartida(){
        enlistarEjercitoBestias();
        enlistarEjercitoHeroes();
        mostrarEjercitos();
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

    private void enfrentarEjercitos(){
        
        
    }
}
