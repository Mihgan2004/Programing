package pokemons;
import moves.Charm;
import moves.Hypnosis;
import moves.Rest;
import ru.ifmo.se.pokemon.*;

public class Kirlia extends Pokemon {
    public Kirlia(String name, int level) {
        super(name, level);
        setStats(38, 35, 35, 65, 55, 50);
        setType(Type.PSYCHIC, Type.FAIRY);
        setMove(new Rest(), new Hypnosis(), new Charm());
    }
}