import java.util.Scanner;

import com.sun.jdi.ArrayType;

import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> data = new ArrayList<>();
    System.out.print("Enter an integer: ");
    int integer = in.nextInt();
    for(int i = integer; i > 0; i--) {
      System.out.print("Enter another integer: ");
      int number = in.nextInt();
      data.add(number);
    }
    int maxValue = 0;
    int maxCount = 0, i, j;
    for(i = 0; i < integer; i++) {
      int count = 0;
      for(j = 0; j < integer; j++) {
        if(data.get(j) == data.get(i)) {
          count++;
        }
      }
      if(count > maxCount) {
        maxCount = count;
        maxValue = data.get(i);
      }
    }
    System.out.print("Mode: " + maxValue);
  }
}
