package binary;
public class MergeSortDriver
{
    public static void main(String a[])
    {
        int i;
        int array[] = {1, 12, 5, 26, 7, 14, 3, 7, 2};
       
        System.out.println("Merge Sort Example");
        System.out.println("Values Before the sort:");
          
        for(i = 0; i < array.length; i++)
            System.out.print( array[i] + "  ");
        System.out.println();
        MergeSort myMergeSort = new MergeSort();
        
        myMergeSort.Merge(array, 0, array.length-1);
        
        System.out.print("\nValues after the sort:\n");
        
        for(i = 0; i < array.length; i++)
           System.out.print(array[i] + "  ");
        
    }
}