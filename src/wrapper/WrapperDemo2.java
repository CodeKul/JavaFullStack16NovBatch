package wrapper;

public class WrapperDemo2 {
    public static void main(String[] args) {
        Integer i = 60;
        int a;

        a = i.intValue(); // Unboxing - converting wrapper type of data into corresponding primitive type
        a = i;

        System.out.println("a:"+a +" ||i:"+i);

    }
}
