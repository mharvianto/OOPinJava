package PPTI15.Session06;

public abstract class Hero {
    protected int atk;
    private int hp;
    int mp;
    private int lvl;

    public int getLvl() {
        return lvl;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public Hero() {
        lvl = 1;
    }

    public Hero(int lvl) {
        this.lvl = lvl;
    }

    public void attack(Hero enemy) {
        enemy.hp -= this.atk;
    }

    public abstract void skill1(Hero target);

}
