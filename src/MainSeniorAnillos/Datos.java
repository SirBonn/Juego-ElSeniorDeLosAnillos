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
                System.out.println("Del tiro de dados el mayor fue " +aux);
                return aux;
            } else {
                System.out.println("Del tiro de dados el mayor fue " +tmp);
                return tmp;
            }

        }

    }

    public static int getNumero(String mensaje, boolean isArreglo) {
        mostrarMensaje(mensaje);
        int tmp = Integer.parseInt(sc.nextLine());
        if (tmp < 0) {
            while(tmp<0) {
                mostrarMensaje("\n\nEl dato ingresado no puede ser negativo\n");
                mostrarMensaje(mensaje);
                tmp = Integer.parseInt(sc.nextLine());
            }
        } if(isArreglo){
            while(tmp>10){
                mostrarMensaje("\n\nEl dato ingresado no puede ser mayor a 10\n");
                mostrarMensaje(mensaje);
                tmp = Integer.parseInt(sc.nextLine());
            }
        }

        return tmp-1;
    }


    public static String getTexto(String mensaje) {
        mostrarMensaje(mensaje);
        String texto = sc.nextLine();
        return texto;
    }

    public static void epserar(String mensaje){
        mostrarMensaje(mensaje);
        String tmp = sc.nextLine();
    }
}
