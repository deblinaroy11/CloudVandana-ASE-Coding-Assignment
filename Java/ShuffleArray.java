import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
                                // Java Task-1
public class ShuffleArray
{
    public static void main(String[] args) 
    {
        Integer[] mainArray = {1, 2, 3, 4, 5, 6, 7};

        List<Integer> list = new ArrayList<>(Arrays.asList(mainArray));
        Collections.shuffle(list);
        Integer[] shuffledArray = list.toArray(new Integer[0]);
        System.out.println("Shuffled Array: " + Arrays.toString(shuffledArray));



        // first, I am creating an Array with the values (1, 2, 3, 4, 5, 6, 7).
        // then, convert this Array to a list for shuffling.
        // convert the shuffled list back to an Array.
        // Then, print the shuffled Array.

    }
}
