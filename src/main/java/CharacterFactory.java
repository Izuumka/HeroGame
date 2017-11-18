public class CharacterFactory {
    public static Character CharacterFactory() {

        int index = (int) (1 + Math.random()*4);

        switch (index){
            case 1:
                return new Hobbit();
            case 2:
                return new Elf();
            case 3:
                return new King();
            case 4:
                return new Knight();
            default:
                return null;



        }
    }
}
