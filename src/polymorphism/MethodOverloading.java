package polymorphism;

/**
 * polymorphism -> ability to take one form to many form
 * or
 * One thing have many action
 *
 * method overloading ->
 * if one class have many methods with same name with different
 * number of arguments
 *
 * advantage => it increases readability of program
 */

public class MethodOverloading {

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        int k = obj.add(4,6);
        System.out.println(k);
        System.out.println(obj.add(2.3f,5));
    }

    public int add(int i,int j){
        return i+j;
    }

    public float add(float i,int j){
        return i+j;
    }

    public int add(int i,int j,int k){
        return i+j+k;
    }

}
