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


    public static String genBaseTypes(String url){
        HttpClient httpClient = HttpClient.newBuilder().build();
        HttpRequest httpRequest = HttpRequest.newBuilder(URI.create(url)).build();
        StringBuilder result = new StringBuilder();
        try {
            HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            String baseTypes = response.body();

            baseTypes.lines().forEach(line -> {
                result.append("public static String ").append(line.replaceAll("[ '|,|\\-|)|(]", "")).append(" = \"").append(line).append("\";\n");
            });
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }


        return result.toString();
    }

}
