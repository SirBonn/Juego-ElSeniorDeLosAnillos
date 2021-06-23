package Pesonajes;

public class Ser {
    private int salud;
    private int armadura;
    private int ataque;

    public Ser(){

    }

    public Ser(int salud, int armadura){
        this.salud = salud;
        this.armadura = armadura;
    }


    /**Inician getters y setters */
    public int getSalud(){
        return this.salud;
    }

    public int getArmadura(){
        return this.armadura;
    }

    public int getAtaque(){
        return this.ataque;
    }
    
    public void setAtaque(int ataque){
        this.ataque = ataque;
    }
}
