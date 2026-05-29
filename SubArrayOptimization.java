public class SubArrayOptimization{
    public static void main(String [] arg){
        int array[]={1,2,3,4};
        int k=0;
        for(int i=1;i<array.length;i++){
            for(int j=k;j<=i-1;j++){
                System.out.print(array[j]+" ");
            }
            if(i==array.length && k<array.length){
                k++;
                i=k;
            }
            System.out.println();
        }
    }
}