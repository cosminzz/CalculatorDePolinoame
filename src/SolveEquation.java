public class SolveEquation {
    InputData input = new InputData();
    StringToIntConverter converter = new StringToIntConverter();

    public void equationSolver() {
        //Insert the numbers and display the equation
        input.inputNumbers();

        //Get the inserted numbers
        String firstNr = input.getFirstNr();
        String secondNr = input.getSecondNr();

        //Get the result
        System.out.println("x=" + solver(firstNr, secondNr));
    }

    private int solver(String firstNr, String secondNr) {
        converter.covertToInt(firstNr, secondNr);

        int convertedFirstNumber = converter.getFirstNr();
        int convertedSecondNumber = converter.getSecondNr();

        int division = convertedSecondNumber / convertedFirstNumber;

        return (int) Math.sqrt(division);
    }
}