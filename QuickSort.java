import java.util.Arrays;
import java.util.Random;
public class QuickSort {
	int count=0;
    int division(int arr[], int beg, int end) 
    { 
        int pivot = arr[end];  
        int i=(beg-1);
        for (int j=beg;j<end;j++) 
        { 
            if (arr[j]<pivot) 
            { 
                i++; 
                int temp=arr[i]; 
                arr[i]=arr[j]; 
                arr[j]=temp; 
            } 
        } 
 
        int temp = arr[i+1]; 
        arr[i+1] = arr[end]; 
        arr[end] = temp; 
  
        return i+1;
        
    } 
    void sort(int arr[], int beg, int end) 
    { 
        if (beg<end) 
        { 
            int p =division(arr,beg,end); 
            sort(arr, beg, p-1); 
            sort(arr, p+1,end); 
        }  
        
        count++;
        
    } 
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuickSort qs = new QuickSort(); 
    	int arr[]=new int[1000];
    	int n =1000;
        Random rand= new Random();
        
	    for(int i=0;i<1000;i++)
	    {
	       arr[i]=rand.nextInt(100000);
	    }
	    
	    long startTime= System.nanoTime();
	    qs.sort(arr,0,arr.length-1);
	    long endTime = System.nanoTime();
	    long duration = (endTime - startTime);
	    System.out.println("Time taken(random): "+ duration);
	    System.out.println("count: "+qs.count);
	    qs.count=0;
	    
	    System.out.println("Sorted array is: "); 
        for (int i=0; i<1000; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println();
	    
        int[] arr1=Arrays.copyOf(arr, 1000);
        
	    long starTime= System.nanoTime();
	    qs.sort(arr1,0,arr1.length-1);
	    long enTime = System.nanoTime();
	    long duratio = (enTime - starTime);
	    System.out.println("Time taken(asec): "+ duratio);
	    System.out.println("Sorted array is: "); 
        for (int i=0; i<1000; ++i) 
            System.out.print(arr1[i]+" "); 
        System.out.println();
        System.out.println("count: "+qs.count);
        qs.count=0;
        
        int arr2[]=new int[n];
        int j=n-1;
        for (int i=0; i<n; i++)
        {
            arr2[j]=arr1[i];
            j--;
        }
        
        long stTime= System.nanoTime();
	    qs.sort(arr2,0,arr2.length-1);
	    long ennTime = System.nanoTime();
	    long durat = (ennTime - stTime);
	    System.out.println("Time taken(desec): "+ durat);
	    System.out.println("Sorted array is: "); 
	    for (int i=500   ; i>=0; i--) 
            System.out.print(arr2[i]+" "); 
        System.out.println();
        System.out.println("count: "+qs.count);
        qs.count=0;
	    
	    
	    for(int i=0;i<1000;i++)
	    {
	       arr[i]=8;
	    }
	    
	    long staTime= System.nanoTime();
	    qs.sort(arr,0,arr.length-1);
	    long eTime = System.nanoTime();
	    long durati = (eTime - staTime);
	    System.out.println("Time taken(same): "+ durati);
	    for (int i=0; i<1000; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println();
	    System.out.println("count: "+qs.count);
	}

}
