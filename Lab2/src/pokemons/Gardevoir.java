package pokemons;

import moves.Charm;
import moves.Hypnosis;
import moves.Rest;
import moves.WillOWisp;
import ru.ifmo.se.pokemon.*;

    public class Gardevoir extends Pokemon{
        public Gardevoir(String name, int level){
            super(name, level);
            setStats(68, 65, 65,125,115,80);
            setType(Type.PSYCHIC, Type.FAIRY);
            setMove(new Rest(), new Hypnosis(), new Charm(), new WillOWisp());
        }
}
