import java.util.Random;

public class ShuffleArray 
{

    public static void shuffleArray(int[] array) 
    {
        Random rand = new Random();

        for (int i = array.length - 1; i > 0; i--)
         {
            int randomIndex = rand.nextInt(i + 1);

            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
            
        }
    }

    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Original Array:");
        printArray(arr);

        shuffleArray(arr);

        System.out.println("\nShuffled Array:");
        printArray(arr);
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}


        // first, I am creating an Array with the values (1, 2, 3, 4, 5, 6, 7).
        // then, I have created an fuction called shuffleArray which takes array as an input.
        // In this function I have used logic for shuffle.
        // Then, I also have created am function called printArray to print the shuffled Array.


