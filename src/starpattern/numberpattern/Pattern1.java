package starpattern.numberpattern;

/**
 *    12345
 *    678910
 *    11---15
 *    16-20
 *    21-25
 */
public class Pattern1 {
    public static void main(String[] args) {
        int cnt = 1;
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                System.out.print(" "+cnt);
                cnt++;
            }
            System.out.println("");
        }
    }
}
