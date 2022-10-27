package onboarding;

import java.util.List;

class Problem1 {
    private final static int EXCEPTIONS_NUMBER = -1;
    private static final int DRAW_NUMBER = 0;
    private static final int WIN_POBI_NUMBER = 1;
    private static final int WIN_CRONG_NUMBER = 2;

    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = 0;

        if (isNotTwoElements(pobi) || isNotSidePage(pobi)) {
            return EXCEPTIONS_NUMBER;
        }

        if (isNotTwoElements(crong) || isNotSidePage(crong)) {
            return EXCEPTIONS_NUMBER;
        }

        int pobiLargerNumber = getLargerNumber(pobi);
        int crongLargerNumber = getLargerNumber(crong);

        return answer;
    }

    private static boolean isNotTwoElements(List<Integer> checkList) {
        return checkList.size() != 2;
    }

    private static boolean isNotSidePage(List<Integer> checkList) {
        return checkList.get(0) != checkList.get(1) - 1;
    }

    private static int getSum(int number) {
        int result = 0;

        while (number != 0) {
            result += number % 10;
            number /= 10;
        }

        return result;
    }

    private static int getMultiplication(int number) {
        int result = 1;

        while (number != 0) {
            result *= number % 10;
            number /= 10;
        }

        return result;
    }

    private static int getLargerNumber(List<Integer> checkList) {
        int leftSumResult = getSum(checkList.get(0));
        int leftMultiplicationResult = getMultiplication(checkList.get(0));
        int rightSumResult = getSum(checkList.get(1));
        int rightMultiplicationResult = getMultiplication(checkList.get(1));

        int leftLargerNumber = Math.max(leftSumResult, leftMultiplicationResult);
        int rightLargerNumber = Math.max(rightSumResult, rightMultiplicationResult);

        return Math.max(leftLargerNumber, rightLargerNumber);
    }
}