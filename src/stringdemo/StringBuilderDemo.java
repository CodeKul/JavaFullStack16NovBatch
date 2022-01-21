package stringdemo;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Codekul");
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
