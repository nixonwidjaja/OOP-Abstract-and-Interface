public class Generics
{
    public static <T extends Comparable<T> > void selectionSort(T[] arr) 
    {
        for (int i = 0; i < arr.length - 1;i++) 
        {
            int min = i;
            for (int j = i+1; j < arr.length;j++) 
            {
                if (arr[j].compareTo(arr[min])>0) 
                min = j;
            }
            T temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static void main(String args[])
    {
        Integer [] arr = {40,70,20,100,10};
        Double [] brr = {2.53,7.95,1.23,9.99,5.87};
        String [] crr = {"cecep","adi","zen","yono","ken"};
        selectionSort(arr);
        selectionSort(brr);
        selectionSort(crr);
        for (int i=0;i<5;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
        for (int i=0;i<5;i++)
        System.out.print(brr[i]+" ");
        System.out.println();
        for (int i=0;i<5;i++)
        System.out.print(crr[i]+" ");
    }
}