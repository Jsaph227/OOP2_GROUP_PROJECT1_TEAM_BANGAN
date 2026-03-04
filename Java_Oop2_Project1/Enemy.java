public class Enemy extends Character implements Attackable {

    public Enemy(String name, int health) {
        super(name, health);
    }

    public void attack(Character target) {
        target.takeDamage(10);
        System.out.println(name + " hits " + target.name);
    }

    public void display() {
        System.out.println("Enemy: " + name + " HP: " + health);
    }
    public void defend(){
        System.out.println(name + " defends ally! " + health + " hp left.");
    }
}