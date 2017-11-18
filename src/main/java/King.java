
public class King extends Character {

    public King() {
        super((int)(5+Math.random()*11), (int)(5+Math.random()*11));
    }

    @Override
    public void kick(Character enemy) {
        System.out.println("King: I am the King!!! I`ll never lose");
        enemy.hp = enemy.hp - (int)(Math.random()*(this.power + 1));

    }

}
