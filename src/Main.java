public class Main {

    /** 1. Write a method called numberOfVowels that returns the number of vowels in a string.
     Consider a, e, i, o, u as vowels. **/
    public static int numberOfVowels(String str){
        int count =0;
        int len = str.length();
        for (int i =0; i<len; i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }

    /** 2. Write a method called notDivisibleBy235 that finds the number of natural numbers not exceeding N
     and not divisible by any of the numbers [2, 3, 5].
     Example
     Let's take the number 5 as an example:
     1 - doesn't divide integer by 2, 3, and 5
     2 - divides integer by 2
     3 - divides integer by 3
     4 - divides integer by 2
     5 - divides integer by 5
     Answer: 1 (only one number doesn't divide integer by any of 2, 3, 5) **/

    public static int notDivisibleBy235(int N){
        int output = 0;
        int count =0;

        for(int i=0; i<=N; i++){
            if((i%2!=0)||(i%3!=0)||(i%5!=0)){
                count++;
            }

        }
        return count;
    }


    /** 3. Write a method called camelCaseMe so that it converts dash/underscore delimited words into camel casing.
     * The first word within the output should be capitalized only if the original word was capitalized
     * (known as Upper Camel Case, also often referred to as Pascal case).
     * The next words should always be capitalized.
     Examples
     "the-stealth-warrior" gets converted to "theStealthWarrior"
     "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
     "The_Stealth-Warrior" gets converted to "TheStealthWarrior" **/

    public static String camelCaseMe(String str) {
        int len = str.length();
        String output = "";
        int count = 0;

        while (count < len) {
            if (str.charAt(count) == '-' || str.charAt(count) == '_') {
                String chara = str.substring(count + 1, count + 2);
                String upper = chara.toUpperCase();
                output += upper;
                count += 2;
            }
            output += str.charAt(count);
        }
        return output;

    }



}