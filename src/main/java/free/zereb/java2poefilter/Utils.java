package free.zereb.java2poefilter;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Utils {
    public static int clamp(int var, int min, int max) {
        var = var > max ? max : var < min ? min : var;
        return var;
    }
    public static String quote(String s){
        return "\""+s+"\"";
    }


}
