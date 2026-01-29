import java.util.Scanner;
import java.util.concurrent.Callable;

class Customer {
    //instance variable
    int customerId;
    long contactNo;
    String CustomerName;
    String address;

    void customerDetails(){//method creation
        System.out.println("Displaying customer details \n***************************");
        System.out.println("Customer Id : " + customerId);
        System.out.println("Customer Name : " + CustomerName);
        System.out.println("Contact Number : " + contactNo);
        System.out.println("Address : " + address);
        System.out.println();
    }
 public  void updateContact(Customer c1){
     System.out.println("this the updated contact no : ");
        c1.contactNo = 74284799703l;

    }

}
class Food{
    //instance variable
    String FoodName;
    String cusine;
    String foodType;
    int Quantity;
    double unitPrice;

    public double PayBill(double total_price ){      //pass by value
         total_price = Quantity * unitPrice;
        double discountPrice = 10;
        System.out.println("Calculating final amount to be paid......");
        double priceAfterDiscount = total_price*(1-discountPrice/100);
        return priceAfterDiscount;
    }
}



public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //object creation
        Customer c1 = new Customer();
        //assign value to the instance variable
        c1.CustomerName = "Rohit";
        c1.contactNo = 6783878223l;
        System.out.println(c1.contactNo);
        c1.updateContact(c1);
        c1.customerId = 34;
        c1.address = "kolkata";
        Customer newOne  = new Customer();

        c1.customerDetails();
        Food f1 = new Food();
        System.out.println("enter the food unit price: ");
        f1.unitPrice = sc.nextInt();
        System.out.println("enter food quantity: ");
        f1.Quantity = sc.nextInt();
        f1.cusine ="bengali";
        f1.foodType = "veg";
        f1.FoodName = "kachuri";
        System.out.println(f1.PayBill(700));






    }
}
