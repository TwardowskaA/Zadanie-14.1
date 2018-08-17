import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Które menu chcesz wyświetlić:");
        for (Menu value : Menu.values()) {
            System.out.println(value);
        }
        String option = scan.nextLine();
        option = option.toUpperCase();

        Menu menu = null;

        while (menu == null) {
            try {
                menu = Menu.valueOf(option);
            } catch (IllegalArgumentException e) {
                System.out.println("Podano błędną nazwe, wprowadź ponownie");
                for (Menu value : Menu.values()) {
                    System.out.println(value);
                }
                option = scan.nextLine();
            }
        }
    }
}
