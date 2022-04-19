package collection;

import java.util.EnumSet;

enum Days {
    Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
}

public class EnumSetDemo {
    public static void main(String[] args) {
        EnumSet<Days> daysEnumSet = EnumSet.allOf(Days.class);
        System.out.println(daysEnumSet);

        EnumSet<Days> daysEnumSet1 = EnumSet.of(Days.Sunday,Days.Monday);
        System.out.println(daysEnumSet1);
        System.out.println(EnumSet.complementOf(daysEnumSet1));
    }
}
