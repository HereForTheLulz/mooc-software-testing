package tudelft.roman_convert_self;

import tudelft.numfinder.NumFinder;

public class RomanNumeralMain {
    public static void main (String[] args){
        RomanNumeral rn = new RomanNumeral();
        int number = rn.convert("CMXLIII");
        System.out.println(number);
    }
}