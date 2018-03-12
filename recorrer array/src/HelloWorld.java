import java.util.Optional;
import java.util.Set;
import java.util.HashSet;

public class HelloWorld {

  public static void main(String[] args){
    
    Optional<Character> character = findFirstCharacterRepetition("abcdabcd");
    System.out.println(character.isPresent());
    Optional<Character> character2 = findFirstCharacterRepetition("abcd");
    System.out.println(character2.isPresent());
  }
  
  private static Optional<Character> findFirstCharacterRepetition(String word) {
    Set<Character> set = new HashSet<>();
    char[] characters = word.toCharArray();
    for (char character : characters) { 
      if(!set.add(character)) {
        return Optional.of(character);
      }
    }
    return Optional.empty();
  }
}