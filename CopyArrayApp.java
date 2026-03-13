import java.util.Arrays;
import java.util.ArrayList;

public class CopyArrayApp{
  public static void main(String[] args) {
    int nVals = args.length;
    ArrayList<Integer> unique_values = new ArrayList<>(0);

    // to create a new array of ints
    int[] myVals = new int[nVals];

    for (int i = 0; i < nVals; i++) {
        // to allocate a value into the created array at index i
        myVals[i] = Integer.parseInt(args[i]);
        // int item = myVals[myVals.length - 1];
        if (unique_values.contains(Integer.parseInt(args[i]))) {
        } else {
            unique_values.add(Integer.parseInt(args[i]));
        }
    }
    System.out.println("original values: " + Arrays.toString(myVals));
    System.out.println("unique values: " + unique_values);
  }
}