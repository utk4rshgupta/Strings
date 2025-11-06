public class NumberOfWords {
    public static void main(String[] args) {
        String str =  "   this  is        a mango  tree ";

        str = str.trim().replaceAll("\\s+"," " );
        //str = str.replaceAll("\\s+"," " );
        System.out.println(str);
        int count =0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        System.out.println(count+1);
    }
}
