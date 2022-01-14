package exceptionhandling;

//Custom Exception
public class InvalidAgeForVaccine extends Exception{
    public InvalidAgeForVaccine(String str){
        super(str);
    }
}
