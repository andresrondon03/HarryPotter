package Characters;

import Spells.Expelliarmus;

public class Ron extends Character {
    public Ron (){
        spell= new Expelliarmus();
    }

    public void display(){
        System.out.println("Hi, I'm Ron Weasley.");
    }
}
