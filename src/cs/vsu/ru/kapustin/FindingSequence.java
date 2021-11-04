package cs.vsu.ru.kapustin;

public class FindingSequence {
    int[] arr;

    public FindingSequence(int[] arr) {
        this.arr = arr;
    }

    public ResultOfFinding findIndexAndLengthOfSequence() {
        int newFirstSequenceIndex = 0;
        int lastIndexOfSequence = 0;
        int newSequenceLength;
        int oldSequenceLength = 1;
        int oldFirstSequenceIndex = 0;

        while (lastIndexOfSequence != arr.length) {
            newFirstSequenceIndex = findFirstIndexOfNewSequence(newFirstSequenceIndex, lastIndexOfSequence, arr);

            ResultOfFinding newResult = findSequenceLengthAndFirstIndex(newFirstSequenceIndex, arr);
            lastIndexOfSequence = newResult.getLastIndexOfSequence();
            newSequenceLength = newResult.getSequenceLength();

            if (oldSequenceLength <= newSequenceLength) {
                oldSequenceLength = newSequenceLength;
                oldFirstSequenceIndex = newFirstSequenceIndex;
            }
        }

        return new ResultOfFinding(lastIndexOfSequence, oldSequenceLength, oldFirstSequenceIndex);
    }

    private static ResultOfFinding findSequenceLengthAndFirstIndex(int firstSequenceIndex, int[] arr) {
        int sequenceLength = 1;

        for (int i = firstSequenceIndex + 1; i < arr.length; i++) {
            if (equalToOneOfPreviousOnes(arr, firstSequenceIndex, i)) {
                sequenceLength++;
            } else {
                return new ResultOfFinding(i, sequenceLength, firstSequenceIndex);
            }
        }
        return new ResultOfFinding(arr.length, sequenceLength, firstSequenceIndex);
    }

    private static boolean equalToOneOfPreviousOnes(int[] arr, int startingIndexForComparison, int i) {
        for (int j = startingIndexForComparison; j < i; j++) {
            if (arr[i] == arr[j]) {
                return false;
            }
        }
        return true;
    }

    private static int findFirstIndexOfNewSequence(int firstIndexOfSequence, int lastIndexOfSequence, int[] arr) {
        int firstIndexOfNewSequence = 0;

        for (int k = firstIndexOfSequence; k < lastIndexOfSequence; k++) {
            if (arr[k] == arr[lastIndexOfSequence]) {
                firstIndexOfNewSequence = k + 1;
            }
        }
        return firstIndexOfNewSequence;
    }
}
