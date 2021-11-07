package cs.vsu.ru.kapustin;

public class TestResult {
    private final boolean isProgramCorrect;
    private final String errorArray;

    public TestResult(boolean isProgramCorrect, String errorCase) {
        this.isProgramCorrect = isProgramCorrect;
        this.errorArray = errorCase;
    }

    public boolean getIsProgramCorrect() {
        return isProgramCorrect;
    }

    public String getErrorArray() {
        return errorArray;
    }
}
