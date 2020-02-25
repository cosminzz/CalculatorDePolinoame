public class SolveEquation {
    InputData input = new InputData();

    public void equationSolver() {
        //Insert the numbers and display the equation
        input.inputNumbers();

        //Get the inserted numbers
        int firstNr = input.getFirstNr();
        int secondNr = input.getSecondNr();

        //Get the result
        System.out.println(solver(firstNr, secondNr));
    }

    private int solver(int firstNr, int secondNr) {
        int division = secondNr / firstNr;

        System.out.println(division);
        return (int) Math.sqrt(division);
    }
}
