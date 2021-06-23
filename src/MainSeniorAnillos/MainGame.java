package MainSeniorAnillos;

public class MainGame {
    public static void main(String[] args) throws Exception {
        escribirTitulo();
        JuegoSeniorAnillos juego = new JuegoSeniorAnillos();   
    }


    private static void escribirTitulo(){
        System.out.println("\u001b[31m"+" ______   _______ _________ _______  _        _        _______        ______   _______  _       ");
        System.out.println("(  ___ \\ (  ___  )\\__   __/(  ___  )( \\      ( \\      (  ___  )      (  __  \\ (  ____ \\( \\      ");
        System.out.println("| (   ) )| (   ) |   ) (   | (   ) || (      | (      | (   ) |      | (  \\  )| (    \\/| (      ");
        System.out.println("| (__/ / | (___) |   | |   | (___) || |      | |      | (___) |      | |   ) || (__    | |      ");
        System.out.println("|  __ (  |  ___  |   | |   |  ___  || |      | |      |  ___  |      | |   | ||  __)   | |      ");
        System.out.println("| (  \\ \\ | (   ) |   | |   | (   ) || |      | |      | (   ) |      | |   ) || (      | |      ");
        System.out.println("| )___) )| )   ( |   | |   | )   ( || (____/\\| (____/\\| )   ( |      | (__/  )| (____/\\| (____/\\");
        System.out.println("|/ \\___/ |/     \\|   )_(   |/     \\|(_______/(_______/|/     \\|      (______/ (_______/(_______/");

        System.out.println("\t\t   _______  ______  _________ _______  _______  _______ ");
        System.out.println("\t\t  (  ___  )(  ___ \\ \\__   __/(  ____ \\(       )(  ___  )");
        System.out.println("\t\t  | (   ) || (   ) )   ) (   | (    \\/| () () || (   ) |");
        System.out.println("\t\t  | (___) || (__/ /    | |   | (_____ | || || || |   | |");
        System.out.println("\t\t  |  ___  ||  __ (     | |   (_____  )| |(_)| || |   | |");
        System.out.println("\t\t  | (   ) || (  \\ \\    | |         ) || |   | || |   | |");
        System.out.println("\t\t  | )   ( || )___) )___) (___/\\____) || )   ( || (___) |");
        System.out.println("\t\t  |/     \\||/ \\___/ \\_______/\\_______)|/     \\|(_______)\n\n"+ "\u001b[0m");
                                                              
    }
}
