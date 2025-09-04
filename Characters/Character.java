package Characters;

import Spells.Spell;

public abstract class Character {
    Spell spell;

    public Character () {}

    public abstract void display();

    public void throwSp() {
        spell.spell();
    }

    // Método para cambiar el comportamiento en tiempo de ejecución
    public void setSpell(Spell sp) {
        spell = sp;
    }
}
