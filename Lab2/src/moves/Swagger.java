package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Swagger extends PhysicalMove {
    public Swagger() {
        super(Type.NORMAL, 0, 85);
    }
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, +2);
    }
    protected String describe() {
        return "феф";
    }
}
