import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;

public class DiseaseBot extends TelegramLongPollingBot {

    String a = new String("Новое задание");

    @Override
    public void onUpdateReceived(Update update) {
//        if (update.getMessage().getText().equals("/start")) {
//            // Set variables
//            String message_text = update.getMessage().getText();
//            long chat_id = update.getMessage().getChatId();
//            SendMessage message = new SendMessage() // Create a message object object
//                    .setChatId(chat_id)
//                    .setText("Этот симулятор предлагает вам прожить опыт человека с ментальными особенностями. \n" +
//                            "После принятия решения об участии: в жизни люди не выбирают себе заболевание, поэтому, если вы хотите, чат-бот выберет вам особенность случайным образом. Или  вы сможете выбрать ментальную особенность из предложенных вариантов:\n" +
//                            "-Обсессивно-компульсивное расстройство\n" +
//                            "-Тревожное расстройство\n" +
//                            "-Расстройство аутистического спектра\n" +
//                            "-Самоповреждающее поведение\n" +
//                            "Важно: Мы не рекомендуем участвовать в симуляторе, если вы — человек с ментальными особенностями, заболеваниями или если они были у вас в прошлом, потому что вы можете столкнуться с триггерами. Сверьтесь с собой и продолжайте, если уверены, что готовы. \n");
//            try {
//                execute(message); // Sending our message object to user
//            } catch (TelegramApiException e) {
//                e.printStackTrace();
//            }
//        } else
        if (update.hasMessage() && update.getMessage().hasText()) {
            String message_text = update.getMessage().getText();
            long chat_id = update.getMessage().getChatId();
            if (update.getMessage().getText().equals("/start")) {


                SendMessage message = new SendMessage() // Create a message object object
                        .setChatId(chat_id)
                        .setText("You send /start");
                InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
                List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();
                List<InlineKeyboardButton> rowInline = new ArrayList<>();
                rowInline.add(new InlineKeyboardButton().setText("Продолжить").setCallbackData("update_msg_text"));
                rowInline.add(new InlineKeyboardButton().setText("Продолжить2").setCallbackData("update_msg_text2"));
                // Set the keyboard to the markup
                rowsInline.add(rowInline);
                // Add it to the message
                markupInline.setKeyboard(rowsInline);
                message.setReplyMarkup(markupInline);
                try {
                    execute(message); // Sending our message object to user
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }} else if (update.hasCallbackQuery()) {
            String call_data = update.getCallbackQuery().getData();
            long message_id = update.getCallbackQuery().getMessage().getMessageId();
            long chat_id = update.getCallbackQuery().getMessage().getChatId();

            if (call_data.equals("update_msg_text")) {
                SendMessage message = new SendMessage() // Create a message object object
                        .setChatId(chat_id)
                        .setText(a);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            } else if (call_data.equals("update_msg_text2")) {
                SendMessage message = new SendMessage() // Create a message object object
                        .setChatId(chat_id)
                        .setText("button2");

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
    }



    }

    @Override
    public String getBotUsername() {
        return "diseasebot";
    }

    @Override
    public String getBotToken() {
        return "1048432751:AAFD8KJNVE_9PKJm9yLQIryZrXbsedtdBds";
    }
}
