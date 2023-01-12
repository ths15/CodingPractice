import java.util.Arrays;

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
