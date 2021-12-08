package controlstatements;

public class SwitchEx {
    public static void main(String[] args) {
       // int input = 5; //
        String s = "5";
        int result;
        switch (s){// either int or short or byte or String
            case "1":
                System.out.println("Today is Sunday");
                break;
            case "2":
                System.out.println("Today is Monday");
                break;
            case "3":
                System.out.println("Today is Tuesday");
                break;
            case "4":
                System.out.println("Today is Wednesday");
                break;
            case "5":
                System.out.println("Today is Thursday");
                break;
            case "6":
                System.out.println("Today is Friday");
                break;
            default:
                System.out.println("Today is Saturday");
                break;
        }
    }
}

// WAP for calculator
//Add,subt,mult,div,mod

