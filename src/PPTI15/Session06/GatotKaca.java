package PPTI15.Session06;

public class GatotKaca extends Hero {
    public GatotKaca() {
        // super();
        atk = 200;
        setHp(1000);
        mp = 100;
    }

    @Override
    public void attack(Hero enemy) {
        super.attack(enemy);
        this.setHp((int) (this.getHp() + this.atk * 0.1));
        // this.hp += this.atk * 0.1;
    }

    @Override
    public void skill1(Hero target) {
        target.setHp(target.getHp() - 100);
    }


}
