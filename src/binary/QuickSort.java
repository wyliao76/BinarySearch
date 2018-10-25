package binary;
public class QuickSort
{
    public static void main(String a[])
    {
        int i;
        int array[] = {1, 12, 5, 26, 7, 14, 3, 7, 2};
       
        System.out.println("Quick Sort Example");
        System.out.println("Values Before the sort:");
          
        for(i = 0; i < array.length; i++)
            System.out.print( array[i] + "  ");
        System.out.println();
        
        quickSort(array, 0, array.length-1);
        
        System.out.print("\nValues after the sort:\n");
        
        for(i = 0; i <array.length; i++)
           System.out.print(array[i] + "  ");
        
    }
    
    static int partition(int arr[], int left, int right) 
    { 
        int i = left, j = right; 
        int tmp; 
        int pivot = arr[(left + right) / 2]; 
        while (i <= j) 
	{ 
            while (arr[i] < pivot) 
                  i++; 
            while (arr[j] > pivot) 
                  j--; 
            if (i <= j) 
	    { 
                  tmp = arr[i]; 
                  arr[i] = arr[j]; 
                  arr[j] = tmp; 
                  i++; 
                  j--; 
            } 
        }; 
        return i; 
    } 

    static void  quickSort(int arr[], int left, int right) 
    { 
       int index = partition(arr, left, right); 
       if (left < index - 1) 
            quickSort(arr, left, index - 1); 
       if (index < right) 
            quickSort(arr, index, right); 
    }

}
