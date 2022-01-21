package stringdemo;

public final class StudentImmutableExample {
    final private String prn;

    public StudentImmutableExample(String prn){
        this.prn = prn;
    }

    public String getPrn() {
        return prn;
    }
}

class StudentImpl{
    public static void main(String[] args) {
        StudentImmutableExample s1 = new StudentImmutableExample("PRN-001");
        String prn = s1.getPrn();
        System.out.println("Permanent Registration No: "+prn);
    }
}
