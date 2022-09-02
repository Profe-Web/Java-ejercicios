package com.mycompany.superheroes;


public class Heroe {
    public String name="";
    public String country = "";
    public String power = "";
    public int points =0;
    
     public Heroe(String name, String country, String power, int points) {  
         this.name = name;
         this.country = country;
         this.power= power;
         this.points=points;
    }

    @Override //toString automatico
    public String toString() {
        return "Heroe{" + "name=" + name + ", country=" + country + ", power=" + power + ", points=" + points + '}';
    }
}
