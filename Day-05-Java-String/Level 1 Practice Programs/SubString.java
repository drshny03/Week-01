

import java.util.Scanner;

class SubString
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

        public static String subStringUsingCharAtMethod(String string, int index1, int index2)
        {   
            String ss1="";
            for(int i =index1;i<=index2; i++)
            {
                ss1 = ss1 + string.charAt(i);
            }
            return ss1;
            
        }
        public static String subStringUsingSubStringMethod(String string, int index1, int index2)
        {
                String ss2 = string.substring(index1,index2+1);
                return ss2;
        }
    public static void main(String ar[])
    {
        Scanner input = new Scanner(System.in);
        
        

        String string = input.next();
        int startingIndex = input.nextInt();
        int endingIndex = input.nextInt();

        if(endingIndex>string.length())
        {
            System.out.println("Please Enter a valid Ending Index");
            return;
        }

        String subStringUsingCharAt = subStringUsingCharAtMethod(string,startingIndex,endingIndex);
        String subStringUsingSubStringMethod = subStringUsingSubStringMethod(string,startingIndex,endingIndex);

        System.out.println("First SubString Using CharAt Method:"+subStringUsingCharAt);
        System.out.println("Second SubString Using SubString Method:"+subStringUsingSubStringMethod);

        boolean resultUsingCharAt = compareUsingCharAt(subStringUsingCharAt,subStringUsingSubStringMethod);

       
        System.out.println("Comparison of Both substrings Using CharAt Method And SubString Method "+resultUsingCharAt);
        input.close();
       
    }
}
