

public class GameManager {
    Character character1;
    Character character2;

    public GameManager( Character character1, Character character2) {
        this.character1 = character1;
        this.character2 = character2;


    }
    public void game_play(){
        boolean deth = false;

        Character[] faighters = {this.character1, this.character2};


        int first = whom_is_first();
        int second = first + 1;
        int raund = 1;
        System.out.println("Faighters: N1" + character1.getClass().getSimpleName() + "and N2" + character2.getClass().getSimpleName());
        System.out.println("");
        while (deth != true){
            System.out.println("Raund " + raund + "------------------------------");
            faighters[first% 2].kick(faighters[second%2]);
            System.out.println("");
            System.out.println(this.character1.getClass().getSimpleName() + ":" + this.character1.getHp());
            System.out.println(this.character2.getClass().getSimpleName() + ":" + this.character2.getHp());
            System.out.println("");
            if(!this.character1.isAlive() || !this.character2.isAlive()) deth = true;
            first ++;
            raund ++;
        }
        whom_win();



    }
    private void whom_win(){
        if(character1.isAlive()){
            System.out.println("------------------" + character1.getClass().getSimpleName() + " is winner!!!!!!");
        }
        else{
        System.out.println("------------------" + character2.getClass().getSimpleName() + " is winner!!!!!!");
    }
    }

    private int whom_is_first(){
        int whom;
        int index = (int)(1 + Math.random() * 2);
        switch (index){
            case 1:
                whom = 1;
                break;
            default:
                whom = 2;
                break;
        }
        return whom;
    }
}
