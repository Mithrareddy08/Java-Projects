public class Main {
    public static void main(String[] args) {
        int arr[]= {2, 4, 6, 8};
        //System.out.println("Hello world!");
        int l = arr.length;
        int reverse[]=new int[l];
        for(int i=l-1,j=0;i>=0;i--,j++) {
            reverse[j] = arr[i];
            System.out.print(reverse[j]+" ");
        }
   }
}