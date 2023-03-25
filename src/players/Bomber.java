package players;

public class Bomber extends Hero {


    public Bomber(int health, int damage, SuperAbility ability, String name) {
        super(health, damage, ability, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (this.getHealth() <= 0) {
            boss.setHealth(boss.getHealth() - 100);

        }
    }
}

