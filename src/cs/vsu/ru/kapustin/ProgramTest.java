package cs.vsu.ru.kapustin;

import java.util.Arrays;

public class ProgramTest {

    public TestResult checkProgram() {
        System.out.println("Wait, please. The program is being tested...");
        System.out.println("===============================================================");

        CollectionOfTests collection = new CollectionOfTests();
        TestCase[] testes = collection.getTestValues();

        int firstSequenceIndex;
        int sequenceLength;
        int i = 0;

        while (i < testes.length) {
            FindingSequence finding = new FindingSequence(testes[i].getTestArray());

            ResultOfFinding result = finding.findIndexAndLengthOfSequence();
            firstSequenceIndex = result.getFirstSequenceIndex();
            sequenceLength = result.getSequenceLength();

            printTestResult(testes, firstSequenceIndex, sequenceLength, i);

            if (!(testes[i].getCorrectIndex() == firstSequenceIndex ||
                    testes[i].getCorrectSequenceLength() == sequenceLength)) {
                return new TestResult(false, testes[i]);
            }

            i++;
        }

        return new TestResult(true, null);
    }

    private void printTestResult(TestCase[] testes, int firstSequenceIndex, int sequenceLength, int i) {
        System.out.printf("For array %s:\n", Arrays.toString(testes[i].getTestArray()));
        System.out.printf("1) The index of the first element is %s, ", firstSequenceIndex);
        System.out.printf("the correct index is %s.\n", testes[i].getCorrectIndex());
        System.out.printf("2) The length of the sequence is %s, ", sequenceLength);
        System.out.printf("the correct length is %s.\n", testes[i].getCorrectSequenceLength());
        System.out.println("===============================================================");
    }
}
