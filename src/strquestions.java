import java.util.Scanner;

public class strquestions {
    public static void main(String[] args) {

//	String str = "utkarsh@gmail.com";
//	// get domain name and username from this mail and find if this is on gmail or not
//
//	int i = str.indexOf("@");
//	System.out.println(i);
//	String domain= str.substring(i+1);
//	String username = str.substring(0,i);
//	System.out.println(username);
//	System.out.println(domain);
//	System.out.println(domain.startsWith("gmail"));
//


//	// check if binary
//	int b = 1001001;
//	//String str = b + " ";
//	String str = String.valueOf(b);
//	System.out.println(str.matches("[01]+"));


//	// check if hexa-decimal
//	String str1 = "122345abcf";
//	System.out.println(str1.matches("[0-9a-f]+"));


//	// check correct format of date
//	String d = "01/03/2005";
//	System.out.println(d.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
//
//

        // remove special char from a string
//
//	String str = "ab#nfib&ffn)( fjn";
//	System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));
//
//	// REMOVE SPACES from string
//	String str2 = "   bj     sjb     jr     uirh    ";
//	System.out.println(str2.replaceAll("\\s+ " , " "));  // trims spaces in betn
//	System.out.println(str2.replaceAll("\\s+ " , " ").trim());   // trims leading and tailing spaces also
//
//
//	String str = "   dnnd neknk  knk  kk";
//	str = str.replaceAll("\\s+ " , " ").trim();
//	String words[] = str.split("\\s");
//	System.out.println(words.length);


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a URL");
        String url = scan.nextLine();

        String protocol = url.substring(0, url.indexOf(":"));

        if (protocol.equals("http"))
            System.out.println("Hypertext Transfer Protocol");
        else if (protocol.equals("ftp"))
            System.out.println("File Transfer Protocol");


        String ext = url.substring(url.lastIndexOf(".") + 1);

        if (ext.equals("com"))
            System.out.println("Commercial");
        else if (ext.equals("org"))
            System.out.println("Organisation");
        else if (ext.equals("net"))
            System.out.println("Network");
    }
}
