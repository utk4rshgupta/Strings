import javax.naming.PartialResultException;
import java.util.Arrays;

public class sortSentence {
    public static void main(String[] args) {
        String str = "This2 sentence4 This1 a3";
        System.out.println(sort(str));
//        String[] strArray= str.split(" ");
//        System.out.println(Arrays.toString(strArray));

    }

    static String sort(String s){
        String[] strA= s.split(" ");
        int n = strA.length;
        String[] ans = new String[strA.length];

            for(int j = 0;j<n-1;j++){
                int x = 1;
                if (strA[j+1].contains("j")){
                    String temp =  strA[j+1];
                    strA[j+1] = strA[x];
                    strA[x]  = temp;
                }
                x++;
            }
        String result = String.join(" ", strA);

        return result;
    }
}
