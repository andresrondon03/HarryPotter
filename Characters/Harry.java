package Characters;

import Spells.ExpectoPatronum;

public class Harry extends Character{
    public Harry (){
        spell= new ExpectoPatronum();
    }

    public void display(){
        System.out.println("Hi, I'm Harry Potter.");
    }
}
