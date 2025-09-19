package functionLearning;

public class FunctionDemo1 {
    /*Function :-  A Function is a block of code to a perform certain task
    /*
     * function only runs when it's called
     * java provide some built-in function or predefined methods such as system.out.println()
     * functions are also called methods
     */
//    public  static void name(){
//        System.out.println("arko");
//    }

        public static void sayHello(String n){
            String name  = n;
            System.out.println("hey " + name);
        }
        public static void main(String[] args) {
//        name();
            sayHello("arko");
        }
    }

