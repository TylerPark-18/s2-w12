   public class MergeSort {
   public int[] mergeSort(int[] values){
       if(values.length <= 1)
           return values;
       else{
           int[] leftHalf = new int[values.length/2];
           int[] rightHalf = new int[values.length - leftHalf.length];
           for(int x = 0; x < leftHalf.length; x++){
               leftHalf[x] = values[x];
           }
           for(int x = leftHalf.length; x < values.length; x++){
               rightHalf[x-leftHalf.length] = values[x];
           }
           mergeSort(leftHalf);
           mergeSort(rightHalf);
           return merge(leftHalf, rightHalf, values);
       }
   }
   public int[] merge(int [] l, int[] r, int[] v){
         int right =0;
         int left =0;
         for(int i = 0; i<v.length;i++){
            if(right< r.length && l[left] < r[right] ){
                v[i] = l[left];
                left++;
            } else if(left<l.length && l[left] > r[right]){
                v[i] = r[right];
                right++;
            } else if(l[left] == r[right]){
                v[i] = r[right];
                i++;
                v[i]=l[left];
                left++;
                right++;
            }
         }
         return v;
   }
   public void print(int[] arr){
       for (int x : arr)
           System.out.print(x + ", ");
       System.out.println();
   }
   public static void main(String[] args) {
    //    MergeSort m = new MergeSort();
    //    int[] c = m.mergeSort(new int[]{10,5,7,6,2,9});
    //    m.print(c);
       System.out.println(25+25%2);
   }
}

