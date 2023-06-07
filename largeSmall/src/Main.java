public class Main {
    public static void main(String[] args) {
       int arr[] = {6, 2, 10, 8};
       int small = arr[0];
       int large = arr[0];
       int n = 4;
       for (int i=0;i<n;i++)
       {
           if(arr[i]<small)
           {
               small = arr[i];
           } else if (arr[i]>large) {
               large = arr[i];
           }
       }
        System.out.println("Largest:"+ large);
       System.out.println("Smallest:"+ small);
    }
}