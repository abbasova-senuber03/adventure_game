public class Monster {
    private String name;
    private int damage;
    private int health;

    public Monster(String name, int damage,int health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    public String getName() {return name;}
    public int getDamage() {return damage;}
    public int getHealth() {return health;}
    public void setHealth(int health) {this.health = health;}

}
