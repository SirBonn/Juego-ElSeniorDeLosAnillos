package MainSeniorAnillos;

import java.util.Scanner;

public class Datos {

    static Scanner sc = new Scanner(System.in);

    private static void mostrarMensaje(String mensaje) {
        System.out.println("\n" + mensaje);
    }

    public static int getNumeroRandom(int max, int min, boolean isDoble) {
        
        int tmp = (int) (Math.random() * max) + min;

        if (isDoble == false) {
            return tmp;
        } else {
            int aux = tmp;
            tmp = (int) (Math.random() * max) + min;
            if (aux < tmp) {
                return aux;
            } else {
                return tmp;
            }

        }

    }

    public static int getNumero(String mensaje) {
        mostrarMensaje(mensaje);
        int tmp = Integer.parseInt(sc.nextLine());
        if (tmp < 0) {
            do {
                mostrarMensaje("\n\n El dato ingresdo no puede ser negativo\n");
                mostrarMensaje(mensaje);
                tmp = Integer.parseInt(sc.nextLine());
            } while (tmp < 0);
        }
        return tmp;
    }


    public static String getTexto(String mensaje) {
        mostrarMensaje(mensaje);
        String texto = sc.nextLine();
        return texto;
    }
}
