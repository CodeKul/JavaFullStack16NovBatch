package exceptionhandling;

public class TestAgeForVaccine {
    static void validateAge(int age) throws InvalidAgeForVaccine{
        if (age < 45){
            throw new InvalidAgeForVaccine("You are not eligible for vaccine");
        }
    }

    public static void main(String[] args) {
        try {
            TestAgeForVaccine.validateAge(44);
        }catch (InvalidAgeForVaccine v){
            System.out.println("Exception "+v);
        }
    }
}
