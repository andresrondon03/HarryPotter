import Characters.Harry;
import Characters.Ron;
import Characters.Hermione;
import Spells.WingardiumLeviosa;
import Spells.OculusReparo;
import Spells.Expelliarmus;
//import Spells.ExpectoPatronum;

public class Controller {

    public void run(){
        Harry harry = new Harry();
        harry.display();
        harry.throwSp();
        System.out.println();

        Ron ron = new Ron();
        ron.display();
        ron.throwSp();
        System.out.println();

        Hermione hermione = new Hermione();
        hermione.display();
        hermione.throwSp();
        System.out.println();

        // Cambio de comportamiento en tiempo de ejecución
        System.out.println(">>> Harry, Ron and Hermione are goint to cast other spells");
        System.out.println();
        harry.setSpell(new Expelliarmus());
        ron.setSpell(new WingardiumLeviosa());
        hermione.setSpell(new OculusReparo());

        // Se imprime en pantalla el cambio realizado
        harry.display();
        harry.throwSp();
        System.out.println();

        ron.display();
        ron.throwSp();
        System.out.println();

        hermione.display();
        hermione.throwSp();
        System.out.println();
    }
}
