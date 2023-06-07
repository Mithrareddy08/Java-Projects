public class Main {
    public static void main(String[] args) {
        int arr[]=new int[]{1,3,45,78,32,89};
        int s=4;
        int n=arr.length;
        int t[]=new int[s];
        for(int i=0;i<s;i++){
            t[i]=arr[i];
        }
        for(int i=0;i<(n-s);i++){
            arr[i]=arr[s+i];
        }
        for(int i=n-s;i<n;i++){
            arr[i]=t[i-(n-s)];
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);

        }
    }
    }
