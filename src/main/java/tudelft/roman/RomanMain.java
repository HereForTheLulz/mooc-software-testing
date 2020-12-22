package tudelft.roman;

public class RomanMain {
    public static void main (String[] args){
        tudelft.roman.RomanNumeral rn = new RomanNumeral();
        int number = rn.convert("XC");
        System.out.println(number);
    }
}