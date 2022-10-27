package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Hurricane extends PhysicalMove {
    public Hurricane() {
        super(Type.FLYING, 110, 30);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.HP, -110);
    }
    protected String describe() {
        return "Лол.";
    }
}
