public class Arrays_practice {
    public static void main(String[] args) {
        // problem -- 1
/*        float sum =0;
        float marks [] = {75.5f, 65.5f, 76.9f, 80.5f, 99.6f};
        for(float element : marks){
            sum =  sum + element ;
            System.out.println("The value of Sum " +sum);
        }

        // problem -- 2
        float num = 65.5f;
        float marks[] = {75.5f, 65.5f, 76.9f, 80.5f, 99.6f};
        boolean isiNarray = false;
        for (int i =0 ;i< marks.length;i++) {
            if (num == i) {
                isiNarray = true;
                break;
            }
        }
        if (isiNarray) {
            System.out.println("the value of present in the array");
        } else
        {
            System.out.println("the value is not present in the array");
        }
    }

        // problem -- 3

        float sum =0;
        float marks [] = {75.5f, 65.5f, 76.9f, 80.5f, 99.6f};
        for(float element : marks) {
            sum = sum + element;
        }
        System.out.println("The value of average " + sum/ marks.length);
        }
    }

        // problem -- 4

        int [][] mat1 = {{1, 2, 3},
                         {4, 5, 6}};

        int [][] mat2 = {{10, 20, 30},
                         {40, 50, 60}};

        int [][] result = {{0, 0, 0},
                           {0, 0, 0}};

        // input

        for (int i =0 ; i<mat1.length;i++)   // row number of time
            for(int j=0 ; j<mat2.length;j++){  // column number of time
                result[i][j] = mat1[i][j]+ mat2[i][j] ;
            }

        // output

        for (int i =0 ; i<mat1.length;i++){   // row number of time
            for(int j=0 ; j<mat2.length;j++){  // column number of time
                result[i][j] = mat1[i][j]+ mat2[i][j] ;
                System.out.print(result[i][j] +" ") ;
            }
            System.out.println("");
        }

        //    problem -- 5
        int[] arr = {1, 2, 3, 4, 5, 6};
        int l = arr.length;
        int temp;
        int n = Math.floorDiv(l, 2);
        for (int i = 0; i < n; i++) {
            // Swap a[i] and a[l-1-i]
            // |3|  |4|  | |
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
      for(int element:arr){
          System.out.print(element +" ");
        }

    //    problem -- 6
        int[] arr = {1, 2, 344, 41, 5, 60};
        int max = Integer.MIN_VALUE;
        for(int element : arr){
            if(element>max){
                max = element;
            }
        }
        System.out.println("the maximum value in this array is :" +max);

     // problem -- 7
        int[] arr = {-78, 200, -2147483647, -401, 5, -610};
        int min = Integer.MAX_VALUE;
        for(int element : arr){
            if(element<min){
                min = element;
            }
        }
        System.out.println("the minimum value in this ar is : " + min);


//       problem -- 8
        boolean issorted = true;
        int [] marks = {78, 80, 100, 710, 990 ,6011};
        for(int i = 0; i< marks.length-1;i++) {
            if (marks[i] > marks[i + 1]) {
                issorted = false;
                break;
            }
        }
        if(issorted){
                System.out.println("The array is sorted");
            }
            else{
                System.out.println("The array is unsorted");

            }
 */
        }

    }
