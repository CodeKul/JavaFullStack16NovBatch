package collection;

public class GenericClass<T> {
    T t;
    GenericClass(T t){
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

class GenericImpl{

    public static void main(String[] args) {
        String s = "new";
        //GenericClass<String> genericClass = new GenericClass(s); //compile time error
        //System.out.println("String value "+ genericClass.getT());

        Integer i = 10;
        GenericClass<Integer> genericClass1 = new GenericClass(i);
        System.out.println("integer value "+genericClass1.getT());


    }
}