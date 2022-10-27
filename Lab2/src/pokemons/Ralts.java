package pokemons;
import moves.Hypnosis;
import moves.Rest;
import ru.ifmo.se.pokemon.*;
public class Ralts extends Pokemon{
    public Ralts(String name, int level) {
        super(name, level);
        setStats(28, 25, 25, 45, 35, 40);
        setType(Type.PSYCHIC, Type.FAIRY);
        setMove(new Rest(), new Hypnosis());
    }

    private void setMove(Rest rest, Hypnosis hypnosis) {

    }

    private void setStats(int i, int i1, int i2, int i3, int i4, int i5) {
    }
}