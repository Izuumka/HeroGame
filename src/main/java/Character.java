public abstract class Character {
    protected int power;
    protected int hp;
    public int ff = 3;

    public Character(int power, int hp){
        this.power = power;
        this.hp = hp;

    }
    public abstract void kick(Character enemy);
    public boolean isAlive(){
        if (this.hp > 0 ) return true;
        else return false;
    }


    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
