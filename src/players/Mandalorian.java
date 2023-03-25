package players;

import kg.geeks.game.general.RPG_Game;

public class Mandalorian extends Hero{

    public Mandalorian(int health, int damage, SuperAbility ability, String name) {
        super(health, damage, ability, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int megaAttack = RPG_Game.random.nextInt(5) + 2;
        boss.setHealth(boss.getHealth() - this.getDamage() + megaAttack);
    }
}
