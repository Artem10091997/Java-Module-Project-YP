import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();
        for (int i = 1; i <= 3; i++) {
            System.out.println("Введите название машины №" + i + ":");
            String name = scanner.next();
            System.out.println("Введите скорость машины №" + i + ":");
            int speed = scanner.nextInt();
            if (speed <= 0 || speed > 250) {
                System.out.println("Неправильная скорость");
                System.out.println("Введите корректную скорость (от 1 до 250):");
                speed = scanner.nextInt();
            }
            Car car = new Car(name, speed);
            race.newLeader(car);
        }
        System.out.println("Самая быстрая машина: " + race.getCurrentLeader());
    }
}

