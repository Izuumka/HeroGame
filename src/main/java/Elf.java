public class Elf extends Character {

    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character enemy) {
        if (enemy.isAlive() && enemy.hp < this.hp){
            enemy.hp = 0;
            System.out.println("Elf: You are already dead" + enemy.getClass().getSimpleName());
        }
        else{
            enemy.power--;
            System.out.println("Elf: You dump" + enemy.getClass().getSimpleName() + "I`ll kill you!!!");
        }

    }

}
