
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args){
        Battle b = new Battle();
        Pokemon Articuno = new Pokemon("Игорь ", 2);
        Pokemon Sunkern = new Pokemon("Горб", 2);
        Pokemon Sunflora = new Pokemon("правильный", 2);
        Pokemon Ralts = new Pokemon("какой нибудь ", 3);
        Pokemon Kirlia = new Pokemon("желтый", 3);
        Pokemon Gardevoir = new Pokemon("розовый", 3);
        b.addAlly(Articuno);
        b.addFoe(Sunkern);
        b.addAlly(Sunflora);
        b.addFoe(Ralts);
        b.addAlly(Kirlia);
        b.addFoe(Gardevoir);
        b.go();
    }
}