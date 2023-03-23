import javax.swing.*;
import java.util.Arrays;
import java.util.Locale;

public class TeamQA {
    //global static / class variables
    static double a = 30.00;
    static int b = 20;
    static int c = 10;
    static boolean d = true;
    static boolean e = false;
    static boolean f = true;
    static boolean g = false;
    static String input = "We are 10 people in QA team, spending £1650 to learn    ";
    static String input2 = "We are future QA's";
    static String value = "£1650";
    static String value2 = "$1900";
    static int answer ;
    static int answer1 ;

    //main method
    public static void main(String[] args) {
//        System.out.println(input.charAt(34));                              //D?    gives the character at # specified
//        System.out.println(input.codePointAt(14));                         //D?    unicode of l (#14) is 108
//        System.out.println(input.codePointBefore(14));                     //D?    unicode of p (#13) is 112
//        System.out.println(input.codePointCount(0,50));                    //D?    giving the end index value - don't understand the use as we have to provide the int index number anyway
//        System.out.println(input.compareTo(input2));                       //D?    compares in unicode input # of characters input2 # of characters
//        System.out.println(input.compareToIgnoreCase(input2));             //D     compares the unicode ignoring case
//        System.out.println(input+" ".concat(input2));                      //      concats /joins two strings, same function as + between two strings
//        System.out.println(input+" "+input2);                              //      same function as string method .concat()
//        System.out.println(input.contains("16"));                          //      returns the answer in boolean - checks if specified character /s are there in the string
//        System.out.println(input.contentEquals("We are 10 people in QA team, spending £$1650 to learn "));              //returns the answer in boolean, true only if the whole string is exactly same in variable & string method
//        System.out.println(input.endsWith(" "));                           //      gives answer in boolean, true if last character matches, space sensitive
//        System.out.println(input.equals(input2));                          //      check the # of characters in each string and returns the value in boolean
//        System.out.println(input.equalsIgnoreCase(input2));                //      check the # of characters in each string ignoring the case and returns the value in boolean
//        System.out.println((String.format(input,input2)));                 // NOT CLEAR
//        System.out.println(input.getChars(5,7,'a'[]));                     // NOT CLEAR, showing RED WHEN WRITING
//        System.out.println(input.hashCode());                              // D?   didn't understand the output
//        System.out.println(input.indexOf("QA",0));                         // Not clear on from index as the output value doesn't change on changing this # -
                                                                             // Returns the output in int, gives the index(place #) of specified character, string's first occurrence
//        System.out.println(input2.intern());                               //NOT CLEAR
//        System.out.println(input.isEmpty());                               //          Returns the answer in boolean, true only if there is nothing in the string
//        System.out.println(input.lastIndexOf("ar"));                       // Not clear on from index as the output value doesn't change on changing this # -
//                                                                           // Returns the output in int, gives the index(place #) of specified character, string's last occurrence
//        System.out.println(input.length());                                //          gives answer in int, gives the total no of characters in the string
//        System.out.println(input.matches(input));                          //          Returns the answer in boolean, true if no of characters matches (are equal) in both specified variables/strings
//        System.out.println(input.regionMatches());                         //NOT CLEAR, showing red, think something to do with sub region
//        System.out.println(input.replace("ea","cd"));                      //           Replaces the characters specified by the characters specified after, example team will become tcdm & learn will become lcdrn in this
                                                                             // ReplaceAll is for substring
//        System.out.println(input.replaceFirst("ea","cd"));                 //           Replaces the characters specified by the characters specified after but only on first occurrence, example team will become tcdm in this but & learn will remain learn
//        System.out.println(Arrays.toString(input.split(" ")));             //           gives the output in arrays of strings on wrapping with yellow bulb
//        System.out.println(input.startsWith("W"));                         //           Returns the output in boolean, true if it the variable / string starts with the same character as specified in parameter, & it is case sensitive
//        System.out.println(input.subSequence(5,12));                       //           Gives the characters only mentioned within the specified parameters and omits everything else, example in this only character from index 5 to 12 will show, characters before index 5 and after 12 will vanish
//        System.out.println(input.substring(12));                           //           Omits all the characters before the specified index #, example everything before character index 12 will vanish
//        System.out.println(input2.toCharArray());                          //Not clear    returning the same output as specified variable, should return char array
//        System.out.println(input.toLowerCase(Locale.ROOT));                //             converts the string to lower case
//        System.out.println(input.toString());                              //Not clear     related to string object
//        System.out.println(input.toUpperCase());                           //              converts the string to uppercase
//        System.out.println(input.trim());                                  //             Trims out the extra spaces from front & back of the string
//        System.out.println(String.valueOf(input));                         //Not clear    returns the same value as specified in the parameter variable
//





//        System.out.println(a+=b);           //a=30, b=20            a=50.0
//        System.out.println(a-=b);           //a=50, b=20            a=30.0
//        System.out.println(a%=b);           //a=30, b=20            a=10.0
//        System.out.println(b%=c);           //a=10, b=20, c=10      b=0
//        System.out.println(a%=c);           //a=10, b=0, c=10       a=0
//        System.out.println(a/=b);           //a=0, b=0, c=10        a=0
//        System.out.println(b/=c);           //a=0, b=0, c=10        b=0
//        System.out.println(a/=c);           //a=0, b=0, c=10        a=0
//        System.out.println(a*=b);           //a=0, b=0, c=10        a=0
//        System.out.println(b*=c);           //a=0, b=0, c=10        b=0
//        System.out.println(a*=c);           //a=0, b=0, c=10        a=0

//        System.out.println(d&&e);           //f
//        System.out.println(d&&f);           //t
//        System.out.println(e&&g);           //f
//        System.out.println(d||e);           //t
//        System.out.println(d||f);           //t
//        System.out.println(e||g);           //f


//        System.out.println(d && e);         //f
//        System.out.println(d||e);           //t
//        System.out.println(d && !e);        //t
//        System.out.println(!d && !e);       //f
//        System.out.println(d||!e);          //t
//        System.out.println(!d||!e);         //t
//        System.out.println(!d && e);        //f
//        System.out.println(!(d && e));      //t
//        System.out.println(!d && !e);       //f
//        System.out.println(!(d && !e));     //f
//        System.out.println(!(!d && !e));    //t
//        System.out.println(!d || e);        //f
//        System.out.println(!(d || e));      //f
//        System.out.println(!d || !e);       //t
//        System.out.println(!(d || !e));     //f
//        System.out.println(!(!d || !e));    //f


//        System.out.println(a>b); //T
//        System.out.println(a<b);    //f
//        System.out.println(a>=b);   //t
//        System.out.println(a<+b);   //f


//        System.out.println(a==b);
//        System.out.println(a!=b);
//        System.out.println(!(a==b));
//        System.out.println(!(a!=b));



//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a*b);
//        System.out.println(a/b);
//        System.out.println(a%b);
//        System.out.println(a++);
//        System.out.println(++a);
//        System.out.println(b--);
//        System.out.println(--b);

//        String amount1 = value.replaceAll("£","");
//        System.out.println(amount1);
//        double amount2 = Double.parseDouble(amount1);
//        System.out.println(amount2);
//        System.out.println(input.replaceAll("[^0-9]",""));
//        System.out.println(input.replaceAll("[a-z A-Z]",""));
//        System.out.println(input.replaceAll("[^\\w ,]",""));
//        System.out.println(input.isBlank());
//        System.out.println(input.split("QA"));
//        System.out.println(input.replaceAll("[^0-9]",""));

        }



    }

