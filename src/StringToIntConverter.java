public class StringToIntConverter {
    int firstNr;
    int secondNr;

    public void covertToInt(String str1, String str2) {
        this.firstNr = Integer.parseInt(str1);
        this.secondNr = Integer.parseInt(str2);
    }

    public int getFirstNr() {
        return firstNr;
    }

    public int getSecondNr() {
        return secondNr;
    }
}
