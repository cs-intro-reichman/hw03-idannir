/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(UniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
     public static String UniqueChars(String s) {
        String str1 = "" ;
        int length = s.length();

        for (int i =0;i<length; i++)
        {
            
                if ( (s.charAt(i)) == 32 )
                {
                     str1 += (char)(s.charAt(i));
                }  
            
                else if(str1.indexOf(s.charAt(i)) == -1)
                {
                str1 += (char)(s.charAt(i));
                }
             
        }
        return str1;
    }    
}
