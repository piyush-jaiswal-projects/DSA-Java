
public class arrayPairs {
    public static void main(String[] args) {
        System.out.println("'I am running'");
        int arr[] = {2,4,6,8,10};
        int j = 1;
        for(int i=0; i<arr.length-1;){
            System.out.print('('+arr[i]+','+arr[j]+')');
            j++;
            if( j == arr.length){
                i++;
                j=i+1;
            }
        }
    }
}
