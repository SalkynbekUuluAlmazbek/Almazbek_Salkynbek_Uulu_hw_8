package players;

import kg.geeks.game.general.RPG_Game;

public class Boss extends GameEntity {
    private SuperAbility defence;

    public Boss(int health, int damage, String name) {
        super(health, damage, name);
    }

    public SuperAbility getDefence() {
        return defence;
    }

    public void chooseDefence(Hero[] heroes) {
        int randomIndex = RPG_Game.random.nextInt(heroes.length);
        this.defence = heroes[randomIndex].getAbility();
    }

    public void attack(Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                int bossDamage = this.getDamage();
                if (heroes[i] instanceof Berserk) {
                    ((Berserk) heroes[i]).setBlockedDamage(bossDamage);
                    bossDamage /= 2;
                }
                heroes[i].setHealth(heroes[i].getHealth() - bossDamage);
            }
        }
    }

    @Override
    public String toString() {
        return "BOSS " + super.toString() + " defence: " + this.defence;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public int getHealth() {
        return (int) health;
    }
}

