package cs.vsu.ru.kapustin;

public class TestCase {
    int[] testArray;
    int correctIndex;
    int correctSequenceLength;

    public TestCase(int[] testArray, int correctIndex, int correctSequenceLength) {
        this.testArray = testArray;
        this.correctIndex = correctIndex;
        this.correctSequenceLength = correctSequenceLength;
    }
}
