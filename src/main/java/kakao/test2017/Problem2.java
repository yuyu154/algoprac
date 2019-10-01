package kakao.test2017;

public class Problem2 {

    public boolean test(final String input) {
        final String pattern = "^[0-9]+[S|D|T][*|#]?";

        return input.matches(pattern);
    }
}
