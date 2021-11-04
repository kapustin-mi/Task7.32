package cs.vsu.ru.kapustin;

public class CollectionOfTests {

    public TestCase[] getTestValues() {
        TestCase case1 = new TestCase(new int[]{5, 8, 0, 0, 0, 8, 8, 7, 5, 5}, 6, 3);
        TestCase case2 = new TestCase(new int[]{8, 2, 7, 7, 4, 5, 4, 2, 8, 6}, 5, 5);
        TestCase case3 = new TestCase(new int[]{1, 3, 8, 8, 0, 2, 3, 0, 6, 8}, 5, 5);
        TestCase case4 = new TestCase(new int[]{2, 4, 9, 3, 3, 2, 2, 0, 8, 3}, 6, 4);
        TestCase case5 = new TestCase(new int[]{8, 3, 8, 4, 4, 6, 6, 8, 8, 5}, 1, 3);
        TestCase case6 = new TestCase(new int[]{0, 5, 7, 2, 0, 4, 3, 9, 4, 3}, 1, 7);
        TestCase case7 = new TestCase(new int[]{9, 8, 3, 1, 1, 5, 7, 8, 1, 8}, 5, 4);
        TestCase case8 = new TestCase(new int[]{6, 8, 4, 7, 1, 1, 9, 3, 2, 6}, 5, 5);
        TestCase case9 = new TestCase(new int[]{3, 2, 6, 6, 0, 0, 2, 7, 5, 3}, 5, 5);
        TestCase case10 = new TestCase(new int[]{3, 0, 0, 0, 2, 2, 7, 2, 7, 1}, 7, 3);

        return new TestCase[]{case1, case2, case3, case4, case5, case6, case7, case8, case9, case10};
    }
 }