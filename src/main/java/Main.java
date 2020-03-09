import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Main {

    private static String PROXY_HOST = "127.0.0.1" /* proxy host */;
    private static Integer PROXY_PORT = 1086 /* proxy port */;

    public static void main(String[] args) {
        ApiContextInitializer.init();

        TelegramBotsApi botsApi = new TelegramBotsApi();

//        botOptions.setProxyHost(PROXY_HOST);
//        botOptions.setProxyPort(PROXY_PORT);
//
//        botOptions.setProxyType(DefaultBotOptions.ProxyType.SOCKS5);

        try {
            botsApi.registerBot(new DiseaseBot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
        System.out.println("Игра начинается");
    }
}
