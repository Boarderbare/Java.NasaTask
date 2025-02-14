import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class NasaBot extends TelegramLongPollingBot {

    String url =  "https://api.nasa.gov/planetary/apod" +
             "?api_key=P2zrteJCEl3NvP6XoXjDDI0axBb8tuPvWnMTbVI6"+
            "&date=2025-02-13";
    @Override
    public void onUpdateReceived(Update update) {
        // We check if the update has a message and the message has text
        if (update.hasMessage() && update.getMessage().hasText()) {
            long chatId = update.getMessage().getChatId();
            String text = update.getMessage().getText();
            SendMessage message = new SendMessage(); // Create a SendMessage object with mandatory fields
            message.setChatId(chatId);
            message.setText("Yours message is " +  text);

            try {
                execute(message); // Call method to send the message
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String getBotUsername() {
        // TODO
        return "BareLearnJavaBot";
    }

    @Override
    public String getBotToken() {
        // TODO
        return "7448751643:AAGOWRQhDA8UITfJDTiC2ZzjOoIAIfr8z6c";
    }
}
