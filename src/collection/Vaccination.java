package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Vaccination implements Comparable<Vaccination>{
    private String name;
    private Integer age;
    private String mobile;

    public Vaccination(String name, Integer age, String mobile) {
        this.name = name;
        this.age = age;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getMobile() {
        return mobile;
    }

    @Override
    public String toString() {
        return "Vaccination{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mobile='" + mobile + '\'' +
                '}';
    }

    @Override
    public int compareTo(Vaccination v) {
        return age.compareTo(v.age);
    }
}

class VaccinationSortingImpl{
    public static void main(String[] args) {
        ArrayList<Vaccination> vaccinations = new ArrayList<>();
        vaccinations.add(new Vaccination("Vipin",23,"9965324125"));
        vaccinations.add(new Vaccination("Aditya",21,"9965324525"));
        Collections.sort(vaccinations);
        System.out.println("Sorted list by age");
        for (Vaccination vaccination:vaccinations){
            System.out.println(vaccination);
        }

        checkValidForVaccination(vaccinations);
    }

    private static void checkValidForVaccination(ArrayList<Vaccination> vaccinations) {
        for (Vaccination v:vaccinations){
            if (v.getAge() > 18){
                System.out.println(v.getName()+" Valid for vaccination");
            }else
                System.out.println(v.getName()+ " Not Valid");

            System.out.println(v.getAge()>18?"Valid":"Not Valid");
        }

        vaccinations.forEach(v -> {
            if (v.getAge()>18)
                System.out.println("Valid");
            else
                System.out.println("Invalid");
        });
    }
}