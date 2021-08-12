public class RandomIndex {
    double number;

    RandomIndex(double num){
        number = num;
    }
   int getRandomIndex(){
        double randomNumber = Math.random() * number ;
        return (int) randomNumber;
    }
}
