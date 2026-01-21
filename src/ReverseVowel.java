public class ReverseVowel {
    public static void main(String[] args) {
        //System.out.println(isVowel('b'));
        String s = "IceCreAm";
        System.out.println(reverseVowels(s));
        //System.out.println(a);
    }
    public static String reverseVowels(String s) {
    char[] ans = s.toCharArray();
    int left = 0;
    int right = ans.length-1;
    while(left<right){
        char x = ans[left];
        char y = ans[right];
        if(!isVowel(ans[left])){
            left++;
        }
        if(!isVowel(y)) {
            right--;
        }
        if(isVowel(ans[left]) && isVowel(ans[right])){
            char temp = ans[left];
            ans[left] = ans[right];
            ans[right] = temp;
            left++;
            right--;
        }
    }
    String str = new String(ans);
    return str;
}
     static boolean isVowel(char x){
         if(x == 'a' || x =='e' || x =='i' || x =='o' || x =='u' || x == 'A' || x =='E' || x =='I' || x =='O' || x =='U'  ){
             return true;
         }
        return false;

    }
}
