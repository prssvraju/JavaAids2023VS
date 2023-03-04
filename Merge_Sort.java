import java.util.*;

class Merge_sort {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int a[] = new int[5];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
       
        merge(a, 0, n);
    }

    public static void merge(int a[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            merge(a, low, mid);
            merge(a, mid + 1, high);
            merge_sort(a, low, mid, high);
        }
    }

    public static void merge_sort(int a[], int low, int mid, int high) 
    {    
        int i, j, k;
        int n1,n2;
        
        n1= mid-low+1;
        n2=high-mid;

        int leftarray[] = new int[n1];
        int rightarray[] = new int[n2];

         /* copy data to temp arrays */  
        for (i = 0; i < n1; i++)    
            leftarray[i] = a[low + i];    
        for (j = 0; j < n2; j++)    
            rightarray[j] = a[mid + 1 + j];    
        
        
        i = 0;
        j = 0;
        k = low;

        while (i < n1 && j < n2) 
        {
            if (leftarray[i] <= rightarray[j]) 
            {
                a[k] = leftarray[i];
                i++;
                k++;
            } else
            {
                a[k] = rightarray[j];
                j++;
                k++;
            }
        }
        
        while (i < n1) {
            a[k] = leftarray[i];
            i++;
            k++;
        }
        
        
        while (j < n2) {
            a[k] = rightarray[j];
            j++;
            k++;
        }
    }
}
