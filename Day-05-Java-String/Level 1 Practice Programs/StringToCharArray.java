
import java.util.Scanner;

 class StringToCharArray
     {
       
        public static char[] getCharacterUsingUserMethod(String s)
        {
            int length = s.length();
            char[] charArray = new char[length];
            
            for(int i = 0; i<length; i++)
            {
                charArray[i]= s.charAt(i);
            }
            return charArray;
        }

        public static char[] getCharacterUsingBuiltInMethod(String string)
        {
           
            char[] charArray =  string.toCharArray();

            return charArray;
        }

        public static boolean compareArray(char firstArray[], char secondArray[])
        {
           for(int i = 0; i<firstArray.length; i++)
           {
            if(firstArray[i]!=secondArray[i])
            {
                return false;
            }
           }
           return true;
        }

        public static void displayArray(char [] array)
        {
           int length  = array.length; 
            for(int i = 0; i<length; i++)
            {
                System.out.print(array[i]+" ");
            }
            System.out.println();
        }
         public static void main(String ar[])
         {
             Scanner input = new Scanner(System.in);
             
             String string = input.next();

             char[] userDefineCharacters = getCharacterUsingUserMethod(string);
             char[] builtInCharcter = getCharacterUsingBuiltInMethod(string);

             displayArray (userDefineCharacters);
             displayArray(builtInCharcter);

            boolean isSame = compareArray(userDefineCharacters,builtInCharcter);

           
            System.out.println("Is both array are same "+isSame);


            

 
                input.close();
         }
 
     }
 