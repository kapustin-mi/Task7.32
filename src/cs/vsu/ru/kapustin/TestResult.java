package cs.vsu.ru.kapustin;

import java.util.Arrays;

public class TestResult {
    private final boolean isProgramCorrect;
    private final TestCase errorCase;

    public TestResult(boolean isProgramCorrect, TestCase errorCase) {
        this.isProgramCorrect = isProgramCorrect;
        this.errorCase = errorCase;
    }

    public boolean getIsProgramCorrect() {
        return isProgramCorrect;
    }

    public String getErrorArray() {
        return Arrays.toString(errorCase.getTestArray());
    }
}
