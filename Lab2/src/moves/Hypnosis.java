package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Hypnosis extends StatusMove {
    public Hypnosis(){
        super(Type.PSYCHIC, 0, 60);
    }
    public static final Status SLEEP = null;
    protected String describe() {
        return "наконец-то....";
    }
}


