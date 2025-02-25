import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Test code for sorting strings
    String[] arr = {"forest", "apple", "willow", "lake", "trees"};
    sortAndPrintDescending(arr);

    // Test code for sorting integers
    ArrayList<Integer> list = new ArrayList<>();
    list.add(4);
    list.add(6);
    list.add(3);
    list.add(7);
    selectSortDescending(list);
  }

  /** Precondition: No element of arr is null.
   * Precondition: arr is non-empty
   */
  public static void sortAndPrintDescending(String[] arr)
  {
    // Perform selection sort in descending order
    for (int i = 0; i < arr.length - 1; i++)
    {
      int maxIndex = i;
      for (int j = i + 1; j < arr.length; j++)
      {
        // Compare strings in reverse order (for descending)
        if (arr[j].compareTo(arr[maxIndex]) > 0)
        {
          maxIndex = j;
        }
      }
      // Swap the current element with the maximum element found
      String temp = arr[i];
      arr[i] = arr[maxIndex];
      arr[maxIndex] = temp;
    }

    // Print the sorted array
    for (String s : arr)
    {
      System.out.print(s + " ");
    }
    System.out.println(); // Newline after printing
  }

  /** Precondition: No element of arr is null.
   * Precondition: arr is non-empty
   */
  public static void selectSortDescending(ArrayList<Integer> list)
  {
    // Perform selection sort in descending order
    for (int i = 0; i < list.size() - 1; i++)
    {
      int maxIndex = i;
      for (int j = i + 1; j < list.size(); j++)
      {
        // Compare integers for descending order
        if (list.get(j) > list.get(maxIndex))
        {
          maxIndex = j;
        }
      }
      // Swap the current element with the maximum element found
      int temp = list.get(i);
      list.set(i, list.get(maxIndex));
      list.set(maxIndex, temp);
    }

    // Print the sorted list
    System.out.print("[");
    for (int i = 0; i < list.size(); i++)
    {
      System.out.print(list.get(i));
      if (i < list.size() - 1)
      {
        System.out.print(", ");
      }
    }
    System.out.println("]");
  }
}
