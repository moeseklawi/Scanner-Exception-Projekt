import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("choose a number to divide it");
            int x = scanner.nextInt();
            System.out.println("choose a number to divide with");
            int y = scanner.nextInt();
            int z = x / y;
            System.out.println(z);
        } catch (ArithmeticException e) {
            System.out.println("You cant divide with 0 bro!!");
        } catch (InputMismatchException e) {
            System.out.println("Are u okay?, thats not a number");
        } catch (Exception e) {
            System.out.println("this prints other exceptions");
        }
        finally {
            scanner.close();
        }
    }
}
