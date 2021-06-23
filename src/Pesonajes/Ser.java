package Pesonajes;

public class Ser {
    private int salud;
    private int armadura;
    private int ataque;
    private String raza;

    public Ser() {

    }

    public Ser(int salud, int armadura, String raza) {
        this.salud = salud;
        this.armadura = armadura;
        this.raza = raza;
    }

    public void atacar(Ser objetivo){
        System.out.println(this.toString()+"   vs   " +objetivo.toString()+"\n\n");
        int daño = this.getAtaque(objetivo) - objetivo.getArmadura(this);
        if(daño<=0){
            objetivo.setSalud(objetivo.getSalud()-daño);
        } else {
            System.out.println("La armadura absorbio todo el daño");
        }

        System.out.println("el" +this.raza+" Le hizo " +daño +" puntos de daño al " +objetivo.getRaza());
    }

    public int getAtaque(Ser objetivo) {
        return this.getAtaque();
    }

    public int getArmadura(Ser objetivo) {
        return this.getArmadura();
    }

    /** Inician getters y setters */
    public int getSalud() {
        return this.salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getArmadura() {
        return this.armadura;
    }

    public int getAtaque() {
        return this.ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public String getRaza() {
        return this.raza;
    }

    public boolean isMuerto() {
        if (this.salud == 0) {
            return true;
        } else
            return false;
    }

    @Override
    public String toString() {
        return this.raza + "\tS: " + this.salud + "\tA: " + this.armadura;
    }
}
