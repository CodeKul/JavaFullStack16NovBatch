package exceptionhandling;

//Custom Exception 2
public class CustomException extends Exception {
    public CustomException(String str) {
        super(str);
    }
}

class TestException {
    public static void main(String[] args) {
        try {
            throw new CustomException("Custom Exception get caught");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}

