package stringdemo;

/**
 *
 */
public class StringLiteral {
    public static void main(String[] args) {
        String str1 = "Codekul";
        String str2 = "Codekul";
        String str3 = new String("Pune");
        String str4 = new String("Pune");

        if (str1 == str2){ // == compares str1 & str2 refer to same object or not
            System.out.println("Pointing same object");
        }else {
            System.out.println("Different object");
        }

        if (str3 == str4){
            System.out.println("Pointing same object");
        }
        else {
            System.out.println("Different object");
        }
    }



}
