import java.util.ArrayList;

public class CharacterIterator implements Iterator {
    ArrayList<Character> characters;
    int position;

    public CharacterIterator(ArrayList<Character> characterArray){
        position = 0;
        characters = characterArray;
    }

    @Override
    public boolean hasNext() {
        if(position < characters.size() && characters.get(position) != null)
            return true;
        else
            return false;
    }

    @Override
    public Character next() {
        Character character = characters.get(position);
        position++;
        return character;
    }
}
