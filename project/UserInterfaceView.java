package lesson7.project;

import java.io.IOException;
import java.util.Scanner;

public class UserInterfaceView {
    private lesson7.project.Controller controller = new lesson7.project.Controller();


    public void runInterface() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Для получения прогноза погоды введите 1; Для выхода из программы введите любую клавишу:");
            String choose = scanner.nextLine();
            if (choose.equals("1")) {
                System.out.println("Введите имя города: ");
                String city = scanner.nextLine();

                System.out.println("Введите 1 для получения погоды в городе " + city + " на сегодня;" +
                        "Введите 5 для прогноза на 5 дней; Введите 2 для получения данных из базы; Для выхода введите 0:");

                String command = scanner.nextLine();

                //TODO* Сделать метод валидации пользовательского ввода

                if (command.equals("0")) break;

                try {
                    controller.getWeather(command, city);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else break;
        }

    }
}
