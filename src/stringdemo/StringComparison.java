package stringdemo;

/**
 * String can be compared in 3 ways
 * 1. == operator - compares references(memory address)
 * 2. equals - compares the content of the strings & case sensitivity,does not ignore the case
 * 3. compareTo - compares the values lexicographically and returns an integer
 *                 0 -> same
 *                 1 or positive  -> first string is greater than second string
 *                -1 or negative -> first string is less than  second string
 * 4. equalsIgnoreCase - compares the content of the strings & ignores the cases
 */
public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Pune";
        String str2 = new String("Pune");
        String str3 = "PUNE";
        String str4 = "Mumbai";
        String str5 = "Thane";
        String str6 = "";

        System.out.println(str1 == str2); //false
        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//false
        System.out.println(str1.equalsIgnoreCase(str3));

        System.out.println(str1.compareTo(str2)); // 0
        System.out.println(str1.compareTo(str4)); // 3
        System.out.println(str4.compareTo(str5)); //-7
        System.out.println(str5.compareTo(str6)); //5

    }
}
/**
 * Homework
 * 1. charAt()
 * 2. toUpperCase()
 * 3. toLowerCase()
 * 4. isEmpty()
 * 5. concat()
 * 6. length()
 * 7. replace()
 * 8. replaceAll()
 * 9. indexOf()
 * 10. startsWith()
 * 11. endsWith()
 * 12. trim()
 *
 */

