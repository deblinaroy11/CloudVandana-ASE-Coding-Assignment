import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
                                    // Java Task-2
public class RomanNumberToInteger
 {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = sc.nextLine();
        int result = romanToInt(romanNumeral);
        System.out.println("Integer equivalent: " + result);
        sc.close();
        
    }

    public static int romanToInt(String s) 
    {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) 
        {
            int currValue = romanMap.get(s.charAt(i));
            if (currValue < prevValue) 
            {
                result -= currValue;
            } 
            else 
            {
                result += currValue;
            }
            prevValue = currValue;
        }
        return result;


      // Here, I define a romanToInt function that converts a Roman numeral string to an integer.
      // Then, I use a HashMap to map Roman Numerals to their corresponding integer values. 


    }
}


