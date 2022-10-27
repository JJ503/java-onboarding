package onboarding;

public class Problem3 {
    public static int solution(int number) {
        int answer = 0;

        for (int i = 0; i <= number; i++) {
            answer += getCount369(i);
        }

        return answer;
    }

    private static int getCount369(int number) {
        int checkNumber;
        int count = 0;

        while (number != 0) {
            checkNumber = number % 10;

            if (checkNumber == 3 || checkNumber == 6 || checkNumber == 9) {
                count += 1;
            }

            number /= 10;
        }

        return count;
    }
}
