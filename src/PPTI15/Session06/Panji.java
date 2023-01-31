package PPTI15.Session06;

public class Panji extends Hero {

    @Override
    public void skill1(Hero target) {
        target.setHp(target.getHp() + 200);
    }
}
