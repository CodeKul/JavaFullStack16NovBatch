package stringdemo;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Codekul");
        System.out.println(sb.capacity());
        sb.append(" PVT. Ltd.");
        System.out.println(sb);

        sb.insert(5,"***");
        System.out.println(sb);

        sb.delete(5,7);
        System.out.println(sb);
        sb.deleteCharAt(5);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
}

