public class countlast {
   public static void main(String[] args) {
       String str = "hello   Worldssss s ";
       str  =  str.trim();
//       int last =  str.lastIndexOf(' ');
//       System.out.println(last);

       for(int i = str.length()-1;i>0;i--){
           if(str.charAt(i)==' '){
               System.out.println(str.length()-i-1);
               break;
           }
       }

    }
}
