package cs.vsu.ru.kapustin;

public class TestCase {
    private final int[] testArray;
    private final int correctIndex;
    private final int correctSequenceLength;

    public TestCase(int[] testArray, int correctIndex, int correctSequenceLength) {
        this.testArray = testArray;
        this.correctIndex = correctIndex;
        this.correctSequenceLength = correctSequenceLength;
    }

    public int[] getTestArray() {
        return testArray;
    }

    public int getCorrectIndex() {
        return correctIndex;
    }

    public int getCorrectSequenceLength() {
        return correctSequenceLength;
    }
}
