class Mountain{
    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 2, 3, 4, 5, 4, 3, 2, 0, 1, 2, 3, -2, 4};

        System.out.print("Your answer is : ");
        System.out.println(highest_mountain(arr));
    }

    private static int highest_mountain(int[] arr){
        int n = arr.length;

        int largest = 0;

        for(int i = 1; i < n-1;){
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                int cnt = 1;
                int j = i;

                //count backwards to find the length of the mountain in left side
                while(j > 0 && arr[j] > arr[j-1]){
                    cnt++;
                    j--;
                }

                //count forward to find the length of the mountain in right side
                while(i < n-1 && arr[i] > arr[i+1]){
                    cnt++;
                    i++;
                }

                largest = Math.max(largest, cnt);
                i++;
            }else{
                i++;
            }
        }
        return largest;
    }
}