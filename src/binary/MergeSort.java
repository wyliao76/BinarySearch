package binary;
/**
 * The class MergeSort
*/

public class MergeSort
{
  // instance variables
  int i;

  /**
   * The main sort method.
   *
   * @param list - the list of elements to be sorted
   * @param first - index location of first element in list to be sorted
   * @param last - index location of last element in list to be sorted
   */
  public void Merge(int[] list, int first, int last)
  {
    if (first < last)
    {
      // calculate middle position of list
      int middle = (first + last) / 2;
      // recursive calls to MergeSort()
      Merge(list, first, middle); // breaks down first half of list
      Merge(list, middle + 1, last); // breaks down second half of list
      // recursive calls to MergeLists()
      MergeLists(list, first, middle, middle + 1, last);
    }
  }
   
  /**
   * The MergeLists method. Two virtual lists (A and B) within the
   * original list are sorted and the results stored in list C
   *
   * @param list - the list of elements to be sorted
   * @param startA - index location of first element in "list" A
   * @param endA - index location of last element in "list" A
   * @param startB - index location of first element in "list" B
   * @param endB - index location of last element in "list" B
   */
  public void MergeLists(int[] list, int startA, int endA, int startB, int endB)
  {
    int finalStart = startA; // first element of A
    int finalEnd = endB; // last element of B
    int indexC = 0; // index for list C set to zero (the first position)
    // list C created to maintain ordered list of elements from A and B
    int[] listC = new int[list.length];
       
    // while there are elements left in A and B
    while (startA <= endA && startB <= endB)
    {
      // compare current first elements in A and B
      if (list[startA] < list[startB])
      {
        // move compared element from A to C
        listC[indexC] = list[startA];
        startA++;
      }
      else
      {
        // move compared element from B to C
        listC[indexC] = list[startB];
        startB++;
      }
      // move to next position in list C
      indexC = indexC + 1;
    }
       
    // if list A has remaining elements
    if (startA <= endA)
    {
      // move remaining elements from list A to C
      for (i = startA; i <= endA; i++)
      {
        listC[indexC] = list[i];
        indexC = indexC + 1; // increment indexC
      }
    }
    // if list B has remaining elements
    else
    {
      // move remaining elements from list B to C
      for (i = startB; i <= endB; i++)
      {
        listC[indexC] = list[i];
        indexC++; // increment indexC
      }
    }
       
    indexC = 0;
    // results put back into original list
    for (i = finalStart; i <= finalEnd; i++)
    {
      list[i] = listC[indexC];
      indexC++;
    }
  }
}