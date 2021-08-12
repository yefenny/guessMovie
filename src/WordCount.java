import java.io.File;
import java.sql.Array;
import java.util.Scanner;

public class WordCount {

    Scanner scanner ;

    WordCount(Scanner scner){
        scanner = scner;
    }
    int totalWorld(){

        int worlds = 0;

        while (this.scanner.hasNextLine()){
            String line = scanner.nextLine();
            worlds += line.split(" ").length;
        }
        return worlds;
    }
    String randomWorld(int index, int lenght){
        String[] movies;
        movies = new String[lenght];
        int i = 0;
        while (this.scanner.hasNextLine()|| i < lenght){
            String line = scanner.nextLine();
            movies[i] = line;
            i++;
        }
        return movies[index];
    }

}
