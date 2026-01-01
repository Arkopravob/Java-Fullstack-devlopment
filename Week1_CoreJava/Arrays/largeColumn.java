public class largeColumn {
    public static int largeColumn(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        int max = arr[0][0];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(largeColumn(arr));
    }
        
}
