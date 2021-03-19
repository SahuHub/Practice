import java.util.*;

public class SampleProblems {

    public static void noOfVallys() {

        String path = "DUDUDDUUUUDD";

        Stack<Character> testStack = new Stack<>();

        int count = 0;
        char[] chars = path.toCharArray();

        for (char aChar : chars) {

            if (aChar == 'D' && testStack.empty()) {
                count++;
                testStack.push(aChar);
            } else if (aChar == 'D' && !testStack.empty() && testStack.peek().equals('U')) {
                testStack.pop();
            } else if (aChar == 'D' && !testStack.empty() && !testStack.peek().equals('U')){
                testStack.push(aChar);
            } else if (aChar == 'U' && testStack.empty()) {
                testStack.push(aChar);
            } else if (aChar == 'U' && !testStack.empty() && testStack.peek().equals('D')) {
                testStack.pop();
            } else if(aChar == 'U' && !testStack.empty() && !testStack.peek().equals('D')){
                testStack.push(aChar);
            }

        }

        if(!testStack.empty())
            count--;

        System.out.println("No Of Vally:" + count);

    }

    public static void noOfPair() {

        Integer[] pairOfSocks = {1, 2, 1, 5, 3, 2, 1, 2, 1, 2};

        int count = 0;
        int finalCount = 0;
        HashSet<Integer> uniqueSocks = new HashSet<>();

        for (int i = 0; i < pairOfSocks.length; i++) {

            if (!uniqueSocks.contains(pairOfSocks[i])) {
                uniqueSocks.add(pairOfSocks[i]);

                count = 1;
                for (int j = i + 1; j < pairOfSocks.length; j++) {
                    if (pairOfSocks[i].equals(pairOfSocks[j])) {
                        count++;
                    }
                }
                finalCount = finalCount + count / 2;
            }
        }
        System.out.println("No of Pairs :" + finalCount);
    }
}
