import java.util.Scanner;

public class InputData {
    private Scanner in = new Scanner(System.in);

    private String firstNr;
    private String secondNr;

    public void inputNumbers() {
        System.out.println("Solve the following equation > aX^2=b");

        System.out.println("Enter the first number (a)");
        this.firstNr = in.next();

        System.out.println("Enter the second number (b)");
        this.secondNr = in.next();

        System.out.println(this.firstNr + "x^2 = " +  this.secondNr);
    }

    public String getFirstNr() {
        return firstNr;
    }

    public String getSecondNr() {
        return secondNr;
    }
}
