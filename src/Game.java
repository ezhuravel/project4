import java.util.ArrayList;

public class Game {
    ArrayList<Character> gameCharacters;
    static final int MAX_CHARACTERS = 10;

    public Game(){
        gameCharacters = new ArrayList<Character>(MAX_CHARACTERS);
    }

    public void AddCharacter(Character character){
        if(gameCharacters.size() >= MAX_CHARACTERS)
            throw new IllegalStateException("Max character count reached");

        gameCharacters.add(character);
    }

    public Iterator createIterator(){
        return new CharacterIterator(gameCharacters);
    }

}
