package pl.tlewandster.task3;

import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("JavaPrintToLogpoint")

public class Main {
    static void main() {
        final String SET_GREEN_FONT = "\u001B[32m";
        final String RESET_FONT_COLOR = "\u001B[0m";

        System.out.println(SET_GREEN_FONT + "1. The first array of numbers" + RESET_FONT_COLOR);
        createArray();
        System.out.println(SET_GREEN_FONT + "2. Array of names" + RESET_FONT_COLOR);
        printNames();
        System.out.println(SET_GREEN_FONT + "3. Array of values from 1 to n" + RESET_FONT_COLOR);
        createArray1ToN();
        System.out.println(SET_GREEN_FONT + "4. Sum of elements in array" + RESET_FONT_COLOR);
        sumElements();
        System.out.println(SET_GREEN_FONT + "5. Average of elements in array" + RESET_FONT_COLOR);
        avgElements();
        System.out.println(SET_GREEN_FONT + "6. Largest element of array" + RESET_FONT_COLOR);
        findMaxValue();
        System.out.println(SET_GREEN_FONT + "7. Smallest element of array" + RESET_FONT_COLOR);
        findMinValue();
        System.out.println(SET_GREEN_FONT + "8. Number of occurrences of a given value" + RESET_FONT_COLOR);
        countValue();
        System.out.println(SET_GREEN_FONT + "9. Search for an item" + RESET_FONT_COLOR);
        searchItem();
        System.out.println(SET_GREEN_FONT + "10. Reverse array" + RESET_FONT_COLOR);
        reverseArray();
        System.out.println(SET_GREEN_FONT + "11. Switching Places" + RESET_FONT_COLOR);
        swapFirstAndLast();
        System.out.println(SET_GREEN_FONT + "12. Two arrays – sum of elements" + RESET_FONT_COLOR);
        sumTwoArrays();
        System.out.println(SET_GREEN_FONT + "13. Character Array – String" + RESET_FONT_COLOR);
        changeToCharArray();
        System.out.println(SET_GREEN_FONT + "14. 3x3 matrix – filling" + RESET_FONT_COLOR);
        fillMatrix();
        System.out.println(SET_GREEN_FONT + "15. 3x3 matrix – sum of elements" + RESET_FONT_COLOR);
        sumMatrix();
        System.out.println(SET_GREEN_FONT + "16. Matrix – sum of rows" + RESET_FONT_COLOR);
        sumRowMatrix();
        System.out.println(SET_GREEN_FONT + "17. Matrix – sum of columns" + RESET_FONT_COLOR);
        sumColumnMatrix();
        System.out.println(SET_GREEN_FONT + "18. Matrix – maximum element" + RESET_FONT_COLOR);
        findMaxMatrixValue();
        System.out.println(SET_GREEN_FONT + "19. Main diagonal of a matrix" + RESET_FONT_COLOR);
        getMatrixDiagonal();
    }

    private static void askRepeat(Runnable action) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nRepeat [y/n] ?");
        if (scanner.nextLine().equals("y")) {
            action.run();
        }
    }

    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    private static int[] getRandomIntArray(int length) {
        int[] nums = new int[length];
        for (int i = 0; i < length; i++) {
            nums[i] = (int) (Math.random() * 100);
        }
        return nums;
    }

    private static int[][] getRandomIntMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
        return matrix;
    }

    private static void createArray() {
        int[] nums = getRandomIntArray(5);
        printArray(nums);
        askRepeat(Main::createArray);
    }

    private static void printNames() {
        String[] names = {"Arek", "Marek", "Czarek"};
        for (String name : names) {
            System.out.println("Hi, " + name + "!");
        }
        askRepeat(Main::printNames);
    }

    private static void createArray1ToN() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array length: ");
        int length = scanner.nextInt();
        int[] nums = new int[length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }
        printArray(nums);
        askRepeat(Main::createArray1ToN);
    }

    private static void sumElements() {
        int[] nums = getRandomIntArray(3);
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.print("Array: ");
        printArray(nums);
        System.out.println("Sum:\n" + sum);
        askRepeat(Main::sumElements);
    }

    private static void avgElements() {
        int[] nums = getRandomIntArray(3);
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        double avg = (double) sum / nums.length;
        System.out.print("Array: ");
        printArray(nums);
        System.out.println("Average:\n" + avg);
        askRepeat(Main::avgElements);
    }

    private static void findMaxValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array length:");
        int[] nums = getRandomIntArray(scanner.nextInt());
        System.out.print("Array: ");
        printArray(nums);
        Arrays.sort(nums);
        System.out.println("Largest number of array: " + nums[nums.length - 1]);
        askRepeat(Main::findMaxValue);
    }

    private static void findMinValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array length:");
        int[] nums = getRandomIntArray(scanner.nextInt());
        System.out.print("Array: ");
        printArray(nums);
        Arrays.sort(nums);
        System.out.println("Smallest number of array: " + nums[0]);
        askRepeat(Main::findMinValue);
    }

    private static void countValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value to count: ");
        int valueToCount = scanner.nextInt();
        int[] nums = getRandomIntArray(50);
        System.out.print("Array: ");
        printArray(nums);
        int count = 0;
        for (int num : nums) {
            if (num == valueToCount) count++;
        }
        System.out.println("Number of occurrences: " + count);
        askRepeat(Main::countValue);
    }

    private static void searchItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value to search: ");
        int valueToSearch = scanner.nextInt();
        int[] nums = getRandomIntArray(50);
        System.out.print("Array: ");
        printArray(nums);
        Arrays.sort(nums);
        boolean isFounded = Arrays.binarySearch(nums, valueToSearch) >= 0;
        System.out.println(isFounded ? "Founded" : "Not founded");
        askRepeat(Main::searchItem);
    }

    private static void reverseArray() {
        int[] nums = getRandomIntArray(10);
        int[] reversedNums = new int[nums.length];
        System.out.print("Array: ");
        printArray(nums);
        for (int i = 0; i < nums.length; i++) {
            reversedNums[reversedNums.length - 1 - i] = nums[i];
        }
        System.out.print("Reversed array: ");
        printArray(reversedNums);
        askRepeat(Main::reverseArray);
    }

    private static void swapFirstAndLast() {
        int[] nums = getRandomIntArray(5);
        System.out.print("Array: ");
        printArray(nums);
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        System.out.print("Array after swap: ");
        printArray(nums);
        askRepeat(Main::swapFirstAndLast);
    }

    private static void sumTwoArrays() {
        int length = 5;
        int[] firstNums = getRandomIntArray(length);
        System.out.print("First array: ");
        printArray(firstNums);
        int[] secondNums = getRandomIntArray(length);
        System.out.print("Second array: ");
        printArray(secondNums);
        int[] finalNums = new int[length];
        for (int i = 0; i < length; i++) {
            finalNums[i] = firstNums[i] + secondNums[i];
        }
        System.out.print("Array of sums: ");
        printArray(finalNums);
        askRepeat(Main::sumTwoArrays);
    }

    private static void changeToCharArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Word: ");
        String word = scanner.nextLine();
        char[] chars = word.toCharArray();
        for (char aChar : chars) {
            System.out.println(aChar);
        }
        askRepeat(Main::changeToCharArray);
    }

    private static void fillMatrix() {
        int num = 1;
        int[][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = num++;
            }
        }
        printMatrix(matrix);
        askRepeat(Main::fillMatrix);
    }

    private static void sumMatrix() {
        int[][] matrix = getRandomIntMatrix(3, 3);
        System.out.println("Matrix: ");
        printMatrix(matrix);
        int sum = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                sum += num;
            }
        }
        System.out.println("Sum: " + sum);
        askRepeat(Main::sumMatrix);
    }

    private static void sumRowMatrix() {
        int[][] matrix = getRandomIntMatrix(3, 2);
        System.out.println("Matrix: ");
        printMatrix(matrix);
        int sum = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                sum += num;
            }
            System.out.printf("Sum of row %s: %d%n", Arrays.toString(row), sum);
            sum = 0;
        }
        askRepeat(Main::sumRowMatrix);
    }

    private static void sumColumnMatrix() {
        int[][] matrix = getRandomIntMatrix(3, 2);
        System.out.println("Matrix: ");
        printMatrix(matrix);
        int sumCol0 = 0;
        int sumCol1 = 0;
        for (int[] row : matrix) {
            sumCol0 += row[0];
            sumCol1 += row[1];
        }
        System.out.printf("Sum of column 1: %d%nSum of column 2: %d", sumCol0, sumCol1);
        askRepeat(Main::sumColumnMatrix);
    }

    private static void findMaxMatrixValue() {
        int[][] matrix = getRandomIntMatrix(5, 5);
        System.out.println("Matrix: ");
        printMatrix(matrix);
        int[] sortedFlatArray = Arrays.stream(matrix).flatMapToInt(Arrays::stream).sorted().toArray();
        int[] firstValue = new int[]{sortedFlatArray[sortedFlatArray.length - 1], -1, -1};
        int[] thirdValue = new int[]{sortedFlatArray[sortedFlatArray.length - 3], -1, -1};
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == firstValue[0] && firstValue[1] == -1) {
                    firstValue[1] = row + 1;
                    firstValue[2] = col + 1;
                } else if (matrix[row][col] == thirdValue[0] && thirdValue[1] == -1) {
                    thirdValue[1] = row + 1;
                    thirdValue[2] = col + 1;
                }
            }
        }
        System.out.printf("Largest value: %d (%d row, %d column)%nThird largest value: %d (%d row, %d column)", firstValue[0], firstValue[1], firstValue[2], thirdValue[0], thirdValue[1], thirdValue[2]);
        askRepeat(Main::findMaxMatrixValue);
    }

    private static void getMatrixDiagonal(){
        int[][] matrix = getRandomIntMatrix(10, 10);
        System.out.println("Matrix: ");
        printMatrix(matrix);
        int[] diagonalValues = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            diagonalValues[i] = matrix[i][i];
        }
        System.out.print("Matrix diagonal values: ");
        printArray(diagonalValues);
        askRepeat(Main::getMatrixDiagonal);
    }
}
