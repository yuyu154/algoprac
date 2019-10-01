package kakao.test2017;

public class Problem1 {

    public static String[] test(final int n, final int[] arr1, final int[] arr2) {

        String[] answer = new String[n];

        for (int i = 0; i < n; ++i) {
            StringBuilder token = new StringBuilder();
            int line = arr1[i] | arr2[i];

            int checkBit = 1;
            for (int j = 0; j < n; ++j) {
                int isWall = line & checkBit;
                token = token.append(isWall >= 1 ? "#" : " ");
                checkBit = checkBit << 1;
            }

            answer[i] = token.reverse().toString();
        }

        return answer;
    }
}
