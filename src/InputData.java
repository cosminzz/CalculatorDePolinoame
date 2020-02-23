import java.util.Scanner;

public class InputData {
    private Scanner in = new Scanner(System.in);

    private int firstNr;
    private int secondNr;

    public InputData() {
        System.out.println("Solve the following polynomial equation > aX^2=b");

        inputNumbers();
    }

    private void inputNumbers() {
        System.out.println("Enter the first number (a)");
        this.firstNr = in.nextInt();

        System.out.println("Enter the second number (b)");
        this.secondNr = in.nextInt();

        convert();
    }

    private void convert() {
        new InputToStringConversion(firstNr, secondNr);
    }
}
