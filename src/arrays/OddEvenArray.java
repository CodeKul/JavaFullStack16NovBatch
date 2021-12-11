package arrays;

public class OddEvenArray {
    public static void main(String[] args) {
        int[] no = {1,2,3,4,5,6,7,8,9,10};
        int[] even = new int[no.length/2]; //  pending - remove extras zeros from output
        int[] odd = new int[no.length/2];  //  pending - remove extras zeros from output
        int j = 0;
        int k = 0;

        for (int i=0;i<no.length;i++){ //i = 0,1
            if (no[i]%2==0) {
                even[j] = no[i];
                j++;
            }
            else {
                odd[k] = no[i];
                k++;
            }
        }
        System.out.println("Even nos ");
        for (int i=0;i<even.length;i++)
            System.out.print(even[i]+"\t");
        System.out.println("\nOdd nos ");
        for (int i=0;i<odd.length;i++)
            System.out.print(odd[i]+"\t");

    }
}
