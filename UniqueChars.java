/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String str) {
        String str1 = "";
        for (int i =0;i < str.length(); i++)
        {
            for (int j=0; j < str.length() ;j++)
            {
            if ((char) (str.charAt(i)) != (char) (str1.charAt(j)))
            {
             str1 += (char)(str.charAt(i));
            }  
            }
        }
        return str1;
    }    
}

