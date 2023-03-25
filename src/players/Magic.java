package players;

import kg.geeks.game.general.RPG_Game;

public class Magic extends Hero {

    public Magic(int health, int damage, String name) {
        super(health, damage, SuperAbility.BOOST, name);

    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int attackIncrease = 5;
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0) {
                int currentAttack = hero.getDamage();
                hero.setDamage(currentAttack + attackIncrease);
            }
        }
        System.out.println("Magic increased the attack of each hero by " + attackIncrease);
    }
}
