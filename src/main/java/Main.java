import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws TelegramApiException {

        TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
        botsApi.registerBot(new NasaBot());

//        String url = "https://api.nasa.gov/planetary/apod" +
//                "?api_key=P2zrteJCEl3NvP6XoXjDDI0axBb8tuPvWnMTbVI6" +
//                "&date=2025-02-13";

//        String[] splttedImageUrl = imageUrl.split("/");
//        String filename = splttedImageUrl[splttedImageUrl.length - 1];
//        boolean ext = filename.matches(".*(" + "jpg|jpeg|png" + ").*");
//        if (!ext) {
//            System.out.println("Файл не картинка ");
//            System.exit(0);
//        }
//        HttpGet imageRequest = new HttpGet(imageUrl);
//        CloseableHttpResponse image = httpClient.execute(imageRequest);
//
//        FileOutputStream fos = new FileOutputStream("images/" + filename);
//        image.getEntity().writeTo(fos);
//        System.out.println("Файл загружен:  " + filename);
    }
}
