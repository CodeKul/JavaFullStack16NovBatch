package exceptionhandling;

public class TestAgeForVaccine {
    static void validateAge(int age){
        if (age < 45 && age > 60){
            //throw new InvalidAgeForVaccine();
        }
    }
}
