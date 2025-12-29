import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        RentalService service = new RentalService();

        int choice;

        do {
            System.out.println("\n=== Сервис аренды транспорта ===");
            System.out.println("1. Добавить автомобиль");
            System.out.println("2. Добавить мотоцикл");
            System.out.println("3. Показать весь транспорт");
            System.out.println("4. Найти по бренду");
            System.out.println("5. Фильтр по максимальной цене");
            System.out.println("6. Сортировать по цене");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // очистка буфера

            switch (choice) {

                case 1:
                    System.out.print("Введите ID автомобиля: ");
                    String carId = scanner.nextLine();

                    System.out.print("Введите бренд: ");
                    String carBrand = scanner.nextLine();

                    System.out.print("Введите цену за день: ");
                    double carPrice = scanner.nextDouble();

                    service.addVehicle(new Car(carId, carBrand, carPrice));
                    System.out.println("Автомобиль успешно добавлен!");
                    break;

                case 2:
                    System.out.print("Введите ID мотоцикла: ");
                    String motoId = scanner.nextLine();

                    System.out.print("Введите бренд: ");
                    String motoBrand = scanner.nextLine();

                    System.out.print("Введите цену за день: ");
                    double motoPrice = scanner.nextDouble();

                    service.addVehicle(new Motorcycle(motoId, motoBrand, motoPrice));
                    System.out.println("Мотоцикл успешно добавлен!");
                    break;

                case 3:
                    System.out.println("\nСписок всего транспорта:");
                    service.showAllVehicles();
                    break;

                case 4:
                    System.out.print("Введите бренд для поиска: ");
                    String brand = scanner.nextLine();

                    System.out.println("Результаты поиска:");
                    for (Vehicle v : service.searchByBrand(brand)) {
                        System.out.println(v);
                    }
                    break;

                case 5:
                    System.out.print("Введите максимальную цену: ");
                    double maxPrice = scanner.nextDouble();

                    System.out.println("Подходящий транспорт:");
                    for (Vehicle v : service.filterByPrice(maxPrice)) {
                        System.out.println(v);
                    }
                    break;

                case 6:
                    service.sortByPrice();
                    System.out.println("Транспорт отсортирован по цене.");
                    break;

                case 0:
                    System.out.println("Выход из программы. До свидания!");
                    break;

                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }

        } while (choice != 0);

        scanner.close();
    }
}
