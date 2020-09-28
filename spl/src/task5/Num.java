package task5;
import java.util.HashMap;
import java.util.Map;

public enum Num {
    RED(0),
    GREEN(1),
    BLUE(2);

    private int value;
    private static Map map = new HashMap<>();

    Num(int value) {
        this.value = value;
    }

    static {
        for (Num pageType : Num.values()) {
            map.put(pageType.value, pageType);
        }
    }

    public static Num valueOf(int pageType) {
        return (Num) map.get(pageType);
    }

    public int getValue() {
        return value;
    }
}
