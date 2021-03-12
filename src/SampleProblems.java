import java.util.Arrays;
import java.util.HashSet;

public class SampleProblems {

    public static void noOfPair() {

        Integer[] pairOfSocks = {1, 2,1,5,3,2,1, 2, 1, 2};

        int count = 0;
        int finalCount = 0;
        HashSet<Integer> uniqueSocks = new HashSet<>();

        for (int i = 0; i < pairOfSocks.length; i++) {


            if (!uniqueSocks.contains(pairOfSocks[i])) {
                uniqueSocks.add(pairOfSocks[i]);

                count = 1;
                for(int j = i+1; j < pairOfSocks.length; j++){
                    if(pairOfSocks[i].equals(pairOfSocks[j])){
                        count++;
                    }
                }
                finalCount = finalCount + count/2 ;
            }
        }
        System.out.println("No of Pairs :" + finalCount);
    }
}
