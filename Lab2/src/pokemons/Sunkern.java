package pokemons;
import moves.Confide;
import moves.EnergyBall;
import moves.Swagger;
import ru.ifmo.se.pokemon.*;
public class Sunkern extends Pokemon{
    public Sunkern(String name, int level) {
        super(name, level);
        setStats(30, 30, 30, 30, 30, 30);
        setType(Type.GRASS);
        setMove(new Confide(), new EnergyBall(), new Swagger());
    }
}
