public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        game.AddCharacter(new Character("Jack", 100));
        game.AddCharacter(new Character("Jill", 100));
        game.AddCharacter(new Character("Zombie 1", 50));
        game.AddCharacter(new Character("Zombie 2", 50));
        game.AddCharacter(new Character("Dead Zombie", 0));

        Iterator characterIterator = game.createIterator();

        while(characterIterator.hasNext()){
            System.out.println(characterIterator.next());
        }
    }
}
