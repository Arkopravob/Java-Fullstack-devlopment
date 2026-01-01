package Arrays;
class Student{
    int rollno;
    String name;
}
public class JaggedArray {
    public static void main(String[] args) {
//        int Arr[] = new int[4];
//        System.out.println(Arr);
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s[] = {s1,s2,s3,s4};
        int nums[] = {8,12,76,54};
//        Arr[0] = 4;
//        Arr[1] = 10;
//        Arr[2] = 11;

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
