package interfacedemo;

import java.io.Serializable;

public class TestMarker implements Serializable {
    private int n;
    private String str;

    public TestMarker(int n, String str) {
        this.n = n;
        this.str = str;
    }

    public static void main(String[] args) {
        TestMarker testMarker = new TestMarker(5,"abc");
       // FileOutputStream fout = new FileOutputStream();
    }
}
