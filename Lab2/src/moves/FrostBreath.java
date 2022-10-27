package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class FrostBreath extends StatusMove {
    public FrostBreath(){
        super(Type.ICE, 60, 90);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.HP, -60);
    }
    protected String describe() {
        return "ГЫыыыыыыыыыыыыыы";
    }
}

