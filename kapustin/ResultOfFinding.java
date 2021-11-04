package cs.vsu.ru.kapustin;

public class ResultOfFinding {
    int lastIndexOfSequence;
    int sequenceLength;
    int firstSequenceIndex;

    public ResultOfFinding(int lastIndexOfSequence, int sequenceLength, int firstSequenceLength) {
        this.lastIndexOfSequence = lastIndexOfSequence;
        this.sequenceLength = sequenceLength;
        this.firstSequenceIndex = firstSequenceLength;
    }

    public int getLastIndexOfSequence() {
        return lastIndexOfSequence;
    }

    public int getSequenceLength() {
        return sequenceLength;
    }

    public int getFirstSequenceIndex() {
        return firstSequenceIndex;
    }
}
