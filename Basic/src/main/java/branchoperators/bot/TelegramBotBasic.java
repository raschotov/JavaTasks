package branchoperators.bot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Базовые элементы бота
 */
public class TelegramBotBasic {

    public static void main(String[] args) throws IOException {

        // Данный код мы вообще никак не трогаем. Просто смотрим и любуемся им.
        var bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int number = 0;
            try {
                number = Integer.parseInt(bufferedReader.readLine());
            } catch (Exception e) {
                System.out.println("Enter number please.. only number =). And not big.");
                bufferedReader.close();
                break;
            }

            // с этого момента пишем код

        }
    }
}
