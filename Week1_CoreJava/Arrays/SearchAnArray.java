package Arrays;

public class SearchAnArray {
    public static void main(String[] args) {
        int arr[] = {39,10,3,8,12,17};
        int x = 3;
        boolean flag = false;
        for (int i = 0 ; i < arr.length ; i++){
            if(arr[i] == x){

                flag = true;
                break;
            }
        }
        if(flag == true){
            System.out.println("element found in an array:");
//            System.out.println("target found in an array :" + i +"th index");

        }
        else{
            System.out.println("not found in an array :");
        }


    }
}
