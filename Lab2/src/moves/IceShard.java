package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class IceShard extends PhysicalMove {
    public IceShard() {
        super(Type.ICE, 40, 100);
    }
    protected String describe() {
        return "у меня два джипа в москве, я тебя сейчас сделаю...";
    }
}