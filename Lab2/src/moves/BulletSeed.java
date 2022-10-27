package moves;

import ru.ifmo.se.pokemon.*;

public class BulletSeed extends StatusMove {
    public BulletSeed(){
        super(Type.GRASS , 0, 85);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK, 2-5);
        Effect.confuse(p);
    }
    protected String describe() {
        return "немножко потерялся";
    }
}