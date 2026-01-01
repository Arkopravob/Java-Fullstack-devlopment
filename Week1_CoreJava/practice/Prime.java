package practice;

public class Prime {
    public static void main(String[] args) {
        int n = 15;
        int temp = 0;
        for(int i = 2 ; i < n/2 ;i++){
                if(n % i==0){
                    temp++;
                    break;
                }
            }
            if (temp == 0 && n!= 1){
                System.out.println("it is prime number " + n);
            }
            else{
                System.out.println("Its not a prime " + n);
            }
        }
    }

