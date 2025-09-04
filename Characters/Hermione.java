package Characters;

import Spells.WingardiumLeviosa;

public class Hermione extends Character {
    public Hermione (){
        spell= new WingardiumLeviosa();
    }

    public void display(){
        System.out.println("Hi, I'm Hermione Granger.");
    }
}
