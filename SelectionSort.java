  class SelectionSort {
   public static void main(String[] args) {
      // let min_index be be at 0 intially
      int min_index = 0;
      int arr[] = { 20, 10, 10, 15, 25, 75, 65 };
      for (int i = 0; i < arr.length; i++) {
         min_index = i;
         for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[min_index]) {
               min_index = j;
            }
         }

         if (min_index != i) {
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
         }

      }
      for (int i = 0; i < arr.length; i++) {
         System.out.print("\t" + arr[i]);
      }
   }

}