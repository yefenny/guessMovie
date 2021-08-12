public class ArrayToString {
    String string;
    String arrayToString(String [] array){
        string = "";
        for(int i=0; i < array.length; i++){
            if(i == 0){
                string += array[i].toUpperCase();
            } else {
                string += array[i].toLowerCase();
            }

        }
        return string;
    }
}
