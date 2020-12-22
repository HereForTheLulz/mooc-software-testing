package tudelft.roman_convert_self;

public class RomanNumeral {
    int number= 0;
    public int convert (String romanstr) {

       romanstr = romanstr.replace("IV","A");
       romanstr = romanstr.replace("IX","B");
       romanstr = romanstr.replace("XL","E");
       romanstr = romanstr.replace("XC","F");
       romanstr = romanstr.replace("CM","K");
       romanstr = romanstr.replace("CD","N");


        for(int i = 0; i<=romanstr.length()-1; i++){
          if (romanstr.charAt(i)=='A'){number = number+4; }
           // System.out.println(romanstr.charAt(i));
           if (romanstr.charAt(i)=='B'){number = number+9; }
           if (romanstr.charAt(i)=='E'){number = number+40; }
           if (romanstr.charAt(i)=='F'){number = number+90; }
           if (romanstr.charAt(i)=='K'){number = number+900; }
           if (romanstr.charAt(i)=='N'){number = number+400; }

           // original roman signs
           if (romanstr.charAt(i)=='I'){number = number+1; }
           if (romanstr.charAt(i)=='V'){number = number+5; }
           if (romanstr.charAt(i)=='X'){number = number+10; }
           if (romanstr.charAt(i)=='L'){number = number+50; }
           if (romanstr.charAt(i)=='C'){number = number+100; }
           if (romanstr.charAt(i)=='D'){number = number+500; }
           if (romanstr.charAt(i)=='M'){number = number+1000; }
        }

        return number;
    }
}
