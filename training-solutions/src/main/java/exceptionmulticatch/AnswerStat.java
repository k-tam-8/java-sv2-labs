package exceptionmulticatch;

public class AnswerStat {
    BinaryStringConverter binaryStringConverter;

    public AnswerStat(BinaryStringConverter binaryStringConverter) {
        this.binaryStringConverter = binaryStringConverter;
    }

    public boolean[] convert(String input) {
        boolean[] boolArr;
        try {
            boolArr = binaryStringConverter.binaryStringToBooleanArray(input);
        } catch (NullPointerException | IllegalArgumentException e) {
            throw new InvalidBinaryStringException("Invalid input!");
        }
        return boolArr;
    }

    public int answerTruePercent(String answers) {
        int trueCount = 0;
        boolean[] boolArr = convert(answers);
        for (boolean b : boolArr) {
            if (b) {
                trueCount++;
            }
        }
        return boolArr.length / 100 * trueCount;
    }
}
