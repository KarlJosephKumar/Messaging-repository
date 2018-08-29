import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Sign up");
            System.out.println("2. Log in");
            int answer = Integer.parseInt(scanner.nextLine());
            switch (answer) {
                case 1:
                    System.out.println("Enter email: ");
                    String email = scanner.nextLine();
                    System.out.println("Enter your password");
                    String password = scanner.nextLine();
                    System.out.println("Enter your full name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter your age: ");
                    int age = scanner.nextInt();
                    User user = new User(email, name, age, password);
                case 2:
                    System.out.println("Enter your email: ");
                    String enteredEmail = scanner.nextLine();
                    System.out.println("Enter password: ");
                    String enteredPassword = scanner.nextLine();
                    if(enteredEmail == user.getEmail() && enteredPassword == user.getPassword()){
                        //login
                    }



        }
    }
}
