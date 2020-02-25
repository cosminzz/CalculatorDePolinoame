import java.util.Scanner;

public class InputData {
    private Scanner in = new Scanner(System.in);
    InputToStringConversion strInput = new InputToStringConversion();

    private int firstNr;
    private int secondNr;

    public void inputNumbers() {
        System.out.println("Solve the following equation > aX^2=b");

        System.out.println("Enter the first number (a)");
        this.firstNr = in.nextInt();

        System.out.println("Enter the second number (b)");
        this.secondNr = in.nextInt();

        displayEqInConsole();
    }

    private void displayEqInConsole() {
        strInput.stringInput(firstNr, secondNr);
    }

    public int getFirstNr() {
        return firstNr;
    }

    public int getSecondNr() {
        return secondNr;
    }
}
