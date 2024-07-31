
/*

Your task is to implement the function strstr. The function takes two strings as arguments (s,x) and  locates the occurrence of the string x in the string s. The function returns an integer denoting the first occurrence of the string x in s (0 based indexing).

Note: You are not allowed to use inbuilt function.

Input:
s = GeeksForGeeks, x = Fr
Output: -1
Explanation: Fr is not present in the
string GeeksForGeeks as substring.

 */



import java.util.*;

public class Check_String_if_string_SubstringOf_another {

        public static int strstr(String s, String x)
        {
            return s.indexOf(x);
        }
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            sc.nextLine();
            while(t>0)
            {
                String line = sc.nextLine();
                String a = line.split(" ")[0];
                String b = line.split(" ")[1];
                System.out.println(strstr(a,b));

                t--;
            }
        }



}
