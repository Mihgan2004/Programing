package pokemons;

import moves.AerialAce;
import moves.FrostBreath;
import moves.Hurricane;
import moves.IceShard;
import ru.ifmo.se.pokemon.*;
public class Articuno extends Pokemon {
    public Articuno(String name, int level){
        super(name, level);
        setStats(90, 85, 100,95,125,85);
        setType(Type.ICE, Type.FLYING);
        setMove(new AerialAce(), new IceShard(), new FrostBreath(), new Hurricane());
    }

}
