package controlstatements;

public class ContinueKey {
    public static void main(String[] args) {
        for (int i= 0;i<10;i++){
            if (i==3 || i==6){
                continue;
            }
        //    System.out.println("i "+i);
        }

        for (int i=1;i<=3;i++){
            for (int j=1;j<=3;j++){
                if (i==2 && j==2){
                    continue;
                }
                System.out.println("i="+i +" j="+j);
            }
        }
    }
}
