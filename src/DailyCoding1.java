import java.util.Arrays;
/*
 Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass?
 */
public class DailyCoding1 {
    public static void main(String[] args) throws Exception {

        int k = 17;
        int [] array = {10, 15, 3, 7};
        boolean acceptedArray = false;

        System.out.println("List of numbers: " + Arrays.toString(array) + "\n"
        + "Target of addition: " + k);

        for(int i = 0; i < array.length - 1; i++)
        {
            for(int j = i + 1; j < array.length; j++)
            {
                if(array[i] + array[j] == k)
                {
                    acceptedArray = true;
                    break;
                }
            }

            if(acceptedArray)
                break;
        }

        if(acceptedArray)
            System.out.println("This list is accepted");
        else
            System.out.println("This list is not accepted");

    }
}
