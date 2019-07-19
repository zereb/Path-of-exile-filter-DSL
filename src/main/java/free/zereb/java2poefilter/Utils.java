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

    public static void creteJavaObjects(String url){
        HttpClient httpClient = HttpClient.newBuilder()
                .build();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            for (String line: response.body().split("\n")){
                String forJava = line.replaceAll(" ", "")
                        .replaceAll("'", "")
                        .replaceAll(",","")
                        .replaceAll("-","");
                System.out.println("public static final String "+forJava+" ="+quote(line.trim())+";");
            }
            System.exit(0);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
