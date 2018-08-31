import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileUserService fileUserService = new FileUserService();
        while (true) {
            System.out.println("1. Sign up");
            System.out.println("2. Log in");
            int answer = Integer.parseInt(scanner.nextLine());
            switch (answer) {
                case 1:
                    fileUserService.addUser();

                case 2:
                    fileUserService.login();
                    }



        }
    }
}
