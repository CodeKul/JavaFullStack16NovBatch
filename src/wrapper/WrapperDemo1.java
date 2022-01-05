package wrapper;
// primitive data type are not objects
//they do not belong to any class
/**
 * int -> Integer
 * float -> Float
 * char -> Character
 * long -> Long
 * double -> Double
 * boolean -> Boolean
 * byte -> Byte
 */

public class WrapperDemo1 {
    public static void main(String[] args) {
        int a = 50;
        Integer i =30;
        i = Integer.valueOf(a); // autoboxing  // java 5
        i= a;
        System.out.println("a:"+a +" ||i:"+i);
    }
}
