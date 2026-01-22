import javax.naming.PartialResultException;
import java.util.Arrays;

public class sortSentence {
    public static void main(String[] args) {
        String str = "is2 sentence4 This1 a3";
        System.out.println(sort(str));
    }

    static String sort(String s){
        String[] words = s.split(" ");
        String[] ans = new String[words.length];
        for(int i =0;i<words.length;i++){
            int pos = words[i].charAt(words[i].length()-1)-'0';
            ans[pos-1]=words[i].substring(0,words[i].length()-1);
        }
        return String.join(" ",ans);

    }
}
