import java.util.*;
public class reverseWords {
    public static void main(String[] args) {
        String s =  "ILL LOVE MY INDIA";
        //String str1 = "";
        StringBuilder str1  =  new StringBuilder(" ");
        int a =0;
        for(int i =0;i<=s.length();i++){
            if( i == s.length() || s.charAt(i)==' '){
                for(int j = i-1 ; j>=a ; j--) {
                    char ch = s.charAt(j);
                    str1.append(ch);
                }
                if(i!=s.length()){
                    str1.append(' ');

                }
                a=i+1;
            }
        }
        System.out.println(str1);
    }
}
