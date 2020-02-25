public class InputToStringConversion {

    private String stringNumber1;
    private String stringNumber2;

    public void stringInput(int nr1, int nr2) {
        String convertNr1 = String.valueOf(nr1);
        String convertNr2 = String.valueOf(nr2);

        this.stringNumber1 = convertNr1;
        this.stringNumber2 = convertNr2;

        System.out.println(displayEquation());
    }

    private String displayEquation() {
        return stringNumber1 + " x^2 = " + stringNumber2;
    }
}
