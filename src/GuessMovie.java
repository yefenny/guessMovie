import java.io.File;
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;
public class GuessMovie {

    public static void main (String [] args) throws Exception{
//        scan the file to count the words
        File file = new File("book1.txt");
        Scanner scanner = new Scanner(file);
        WordCount wordCount = new WordCount(scanner);
        int wordsCount = wordCount.totalWorld();
        RandomIndex randomIndex = new RandomIndex(wordsCount);

//        Create another scanner with the same file to get a random worl from the list of titles in the file
        Scanner scanner1 = new Scanner(file);
        WordCount wordCount1 = new WordCount(scanner1);
        String world = wordCount1.randomWorld(randomIndex.getRandomIndex(),wordsCount);
//      Player points and boolean hasWon to stop the loop
        int points = 10;
        boolean hasWon = false;
        String wrongLetters = "";
//      Get what has guessed of the world and store wrong letters
        String [] guessed ;
        guessed = new String [world.length()];
//        Create array with "_" for each character in the world to guess
        for(int i = 0; i < world.length(); i++){
            guessed[i] = "_";
        }
        ArrayToString arrayToString = new ArrayToString();
        LetterInArray letterInArray = new LetterInArray(guessed);
        ArrayToString guessedString = new ArrayToString ();
        while (points >0 && !hasWon){
            String worldString = arrayToString.arrayToString(guessed);
            System.out.println("Your are guessing: " +worldString);
            System.out.println("Guess a letter: ");
            Scanner scanner2 = new Scanner(System.in);
            String response = scanner2.next();

            if(letterInArray.letterIsInArray(world,response) ){
                guessed = letterInArray.arrayWithLetters(guessed,response, world);
            } else {
                points--;
                wrongLetters += " "+response;
                System.out.println("You have guessed ("+ (10 - points) + ") wrong letters:"+ wrongLetters);

            }
            if (guessedString.arrayToString(guessed).toLowerCase().equals(world.toLowerCase())) {
                System.out.println("You win!");
                System.out.println("You have guessed '" + world +"' correctly.");
                hasWon = true;
            }
        }


    }


}
