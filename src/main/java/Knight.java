public class Knight extends Character {
    public Knight() {
        super((int)(2+Math.random()*11),(int)(2+Math.random()*19));

    }

    @Override
    public void kick(Character enemy) {

        System.out.println("I`ll protect my kindom from you "+enemy.getClass().getSimpleName());
        enemy.hp = enemy.hp - (int)(Math.random()*(this.power + 1));
    }

}
