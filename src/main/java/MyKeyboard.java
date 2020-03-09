//public class MyKeyboard {
//}
//
//else if (update.getMessage().getText().equals("/markup")) {
//        String message_text = update.getMessage().getText();
//        long chat_id = update.getMessage().getChatId();
//        SendMessage message = new SendMessage() // Create a message object object
//        .setChatId(chat_id)
//        .setText("Here is your keyboard");
//        // Create ReplyKeyboardMarkup object
//        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
//        // Create the keyboard (list of keyboard rows)
//        List<KeyboardRow> keyboard = new ArrayList<>();
//        // Create a keyboard row
//        KeyboardRow row = new KeyboardRow();
//        // Set each button, you can also use KeyboardButton objects if you need something else than text
//        row.add("Row 1 Button 1");
//        row.add("Row 1 Button 2");
//        row.add("Row 1 Button 3");
//        // Add the first row to the keyboard
//        keyboard.add(row);
//        // Create another keyboard row
//        row = new KeyboardRow();
//        // Set each button for the second line
//        row.add("Row 2 Button 1");
//        row.add("Row 2 Button 2");
//        row.add("Row 2 Button 3");
//        // Add the second row to the keyboard
//        keyboard.add(row);
//        // Set the keyboard to the markup
//        keyboardMarkup.setKeyboard(keyboard);
//        // Add it to the message
//        message.setReplyMarkup(keyboardMarkup);
//        try {
//        execute(message); // Sending our message object to user
//        } catch (TelegramApiException e) {
//        e.printStackTrace();
//        }
//        }