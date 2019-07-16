package free.zereb.java2poefilter;

public class Utils {
    public static int clamp(int var, int min, int max) {
        var = var > max ? max : var < min ? min : var;
        return var;
    }
}
