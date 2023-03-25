package players;

public class Reaper extends Hero{

    public Reaper(int health, int damage, SuperAbility ability, String name) {
        super(health, damage, ability, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        double multiplier = 1;
        if (this.getHealth() <= this.getMaxHealth() * 0.15) {
            multiplier = 3;
        } else if (this.getHealth() <= this.getMaxHealth() * 0.3) {
            multiplier = 2;
        }
        boss.setHealth(boss.getHealth() - multiplier * this.getDamage());
    }

}
