import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
public class FileUserService {
    Scanner scanner = new Scanner(System.in);
    public void addUser(){
        try{
            System.out.println("Enter email: ");
            String email = scanner.nextLine();
            System.out.println("Enter your password");
            String password = scanner.nextLine();
            System.out.println("Enter your full name: ");
            String name = scanner.nextLine();
            System.out.println("Enter your age: ");
            int age = scanner.nextInt();
            PrintWriter writer = new PrintWriter(email + ".txt");
            writer.println(email);
            writer.println(name);
            writer.println(age);
            writer.println(password);
            writer.close();
        }catch (IOException e){
            System.out.println("file not found");
        }
    }
    public void login() {
        System.out.println("Enter your email: ");
        String enteredEmail = scanner.nextLine();
        System.out.println("Enter password: ");
        String enteredPassword = scanner.nextLine();
        try{
            Path filePath = Paths.get(enteredEmail + ".txt");
            List<String> lines = Files.readAllLines(filePath);

            if(lines.get(0).equals(enteredEmail) && lines.get(3).equals(enteredPassword)){
                System.out.println("Welcome " + lines.get(1));
            } else{
                System.out.println("Entered Email or password is Incorrect");
                return;
            }

        }catch (IOException e){
            System.out.println("Password or email is incorrect");
        }
    }
}
