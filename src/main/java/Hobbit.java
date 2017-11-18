public class Hobbit extends Character {

    public Hobbit(){
        super(0, 3);
    }

    @Override
    public void kick(Character enemy) {
        System.out.println(Hobbit.class.getSimpleName() + ": Mama, aaaaaa!!!! I cant kick "+ enemy.getClass().getSimpleName());
        this.hp = 0;

    }

}
