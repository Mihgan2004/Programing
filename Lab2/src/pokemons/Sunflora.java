package pokemons;
import moves.BulletSeed;
import moves.Confide;
import moves.EnergyBall;
import moves.Swagger;
import ru.ifmo.se.pokemon.*;

public class Sunflora extends  Pokemon{
    public Sunflora(String name, int level) {
        super(name, level);
        setStats(75, 75, 55, 105, 85, 30);
        setType(Type.GRASS);
        setMove(new Confide(), new EnergyBall(), new BulletSeed(), new Swagger());
    }

    private void setMove(Confide confide, EnergyBall energyBall, BulletSeed bulletSeed, Swagger swagger) {

    }
}