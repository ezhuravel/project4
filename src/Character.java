public class Character {
    String name;
    int health;

    public Character(String name, int health){
        this.name = name;
        this.health = health;
    }

    @Override
    public String toString(){
        return "Name: " + name + " Health: " + health;
    }
}
