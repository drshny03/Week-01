import java.util.Scanner;

class CompareString
    {
        
        public static boolean compareUsingCharAt(String firstString, String secondString)
        {
            int length1 = firstString.length();
            int length2 = secondString.length();

            if(length1!=length2)
            {
                return false;
            }
            
            for(int i = 0; i<length1; i++)
            {
                if(firstString.charAt(i) != secondString.charAt(i))
                {
                    return false ;
                }
            }    
            
            return true;
        
        }

        public static boolean compareUsingEqual(String firstString, String secondString)
        {
            if(firstString.equals(secondString))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        public static void main(String ar[])
        {
            Scanner input = new Scanner(System.in);
            
            // Taking input from user from scanner class
            System.out.println("Enter two Strings");
            String string1 = input.next();
            String string2 = input.next();

            boolean resultUsingCharAt = compareUsingCharAt(string1, string2);
            boolean resultUsingEqual = compareUsingEqual(string1, string2);

            System.out.println("Result Using CharAt Method "+resultUsingCharAt);
            System.out.println("Result Using Equal Method "+resultUsingEqual);

            input.close();

        }

    }
