package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Emp implements Comparable<Emp>{
    private String name;

    public Emp(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Emp e) {
        return name.compareTo(e.name);
    }
}
class EmpSortingImpl{
    public static void main(String[] args) {
        ArrayList<Emp> emps = new ArrayList<>();
        emps.add(new Emp("tina"));
        emps.add(new Emp("siya"));
        emps.add(new Emp("veena"));
        Collections.sort(emps);
        for (Emp e : emps){
            System.out.println("Sorted Emp List "+e.getName());
        }
    }
}
