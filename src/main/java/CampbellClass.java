/**

 * @author Karthikeya Arikirevula
 * @version 1
 */

public final class CampbellClass{


    private CampbellClass(){

    }

    /**

     * @param num int - the integer being converted to a String
     * @return string - the string version of the integer given
     */
    public static String convertString(int num){
        return Integer.toString(num);
    }

    /**
     * Converts a double to a String
     * @param num double - the double being converted to a String
     * @return String - the string version of the double given
     */
    public static String convertString(double num){
        return Double.toString(num);
    }

    /**
     * Converts a character to a String
     * @param letter char - the character being converted to a String
     * @return String - the string version of the character given
     */
    public static String convertString(char letter){
        return Character.toString(letter);
    }

    /**

     * @param bool boolean - the boolean being converted to a String
     * @return String - the string version of the boolean given
     */
    public static String convertString(boolean bool){
        return Boolean.toString(bool);
    }
    

    /**

     * @param meters int - the number of meters
     * @return the number of meters converted to centimeters as an integer
     */
    public static int convertMetersToCenti(int meters){
        return (meters*100);
    }

    /**

     * @param meters double - the number of meters
     * @return the number of meters converted to centimeters as a double
     */
    public static double convertMetersToCenti(double meters){
        return (meters*100.0);
    }

    /**

     * @param word String - the word given, without characters removed
     * @return the word as a String with only letter characters
     */
    public static String removeNonAlpha(String word){
        return word.replaceAll("[^a-zA-Z]", "");
    }

    /**

     * @param word String - the word given, without characters removed
     * @param bool boolean - represents if the word will be returned as uppercase or lowercase
     * @return the word as a String with only letter characters and in upper or lower case depending on the variable bool
     */
    public static String removeNonAlpha(String word, boolean bool){
        word = word.replaceAll("[^a-zA-Z]", "");
        if(bool){
            return word.toUpperCase();
        }
        else{
            return word.toLowerCase();
        }
    }
}