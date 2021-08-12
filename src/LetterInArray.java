import java.util.Locale;

public class LetterInArray {
    boolean isInArray;
    String [] newArray;
    LetterInArray(String [] array){
        isInArray = false;
        newArray = new String [array.length];
    }
    boolean letterIsInArray(String world, String letter){
        return world.toLowerCase().indexOf(letter.toLowerCase()) >=0;
    }
    String [] arrayWithLetters(String [] array, String letter, String world){
        for(int i = 0; i < world.length(); i++){
            String [] otherArray = world.split("");
            if(otherArray[i].toLowerCase().equals(letter.toLowerCase())){
                array[i] = letter.toLowerCase();
            }
            newArray[i] = array[i];
        }
        return array;
    }

}
