package cs.vsu.ru.kapustin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ProgramTest test = new ProgramTest();
        TestResult result = test.checkProgram();

        if(result.getIsProgramCorrect()) {
            int arrayLength = readLength();

            int[] arr = new int[arrayLength];
            fillArray(arr);

            FindingSequence finding1 = new FindingSequence(arr);

            ResultOfFinding result1 = finding1.findIndexAndLengthOfSequence();
            int index = result1.getFirstSequenceIndex();
            int sequenceLength = result1.getSequenceLength();

            printResult(index, sequenceLength);
        } else {
            printErrorMessage(result);
        }
    }

    private static int readLength() {
        int num;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");

        while (!scn.hasNextInt()) {
            System.out.print("Invalid value! Please, try again: ");
            scn.next();
        }
        num = scn.nextInt();

        if (num < 1) {
            System.out.println("Error! Array length must be greater than 1! Please, try again...");
            return readLength();
        }

        return num;
    }

    private static void fillArray(int[] arr) {
        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter %s array element: ", i + 1);

            while (!scn.hasNextInt()) {
                System.out.print("Error! Array element must be integers! Please, try again: ");
                scn.next();
            }
            arr[i] = scn.nextInt();
        }
    }

    private static void printResult(int index, int sequenceLength) {
        System.out.println("Index of the first element of the sequence is " + index + ".");
        System.out.print("The length of the sequence is " + sequenceLength + ".");
    }

    private static void printErrorMessage(TestResult result) {
        System.out.printf("Sorry, the %s was not verified. You cannot run the program.", result.getErrorArray());
    }
}
