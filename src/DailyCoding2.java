import java.util.Arrays;

public class DailyCoding2 {
/*
 Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?
 */
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int [] initialArray = {1, 2, 3, 4, 5};
        int [] manipulatedArray = new int [initialArray.length];

        for(int i = 0; i < initialArray.length; i++)
        {
            int productVar = 1;
            for(int j = 0; j < initialArray.length; j++)
            {
                if(j != i)
                    productVar *= initialArray[j];
            }
            manipulatedArray[i] = productVar;
        }

        System.out.println("Initial Array: " + Arrays.toString(initialArray) + "\n"
        + "Manipulated Array: " + Arrays.toString(manipulatedArray));
    }

}
