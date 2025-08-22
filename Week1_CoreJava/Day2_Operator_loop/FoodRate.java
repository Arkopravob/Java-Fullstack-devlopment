package Day2_Operator_loop;

import java.util.Scanner;

public class FoodRate {
//    Food Corner home delivers vegetarian and non-vegetarian meals to its customers based on the order.
//
//    A vegetarian combo costs $12 per plate and a non-vegetarian combo costs $15 per plate. Apart from the cost per plate of food, customers are also charged for home delivery based on the distance in kms from the restaurant to the delivery point. The delivery charges are as mentioned below:
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("choice of your food 'V'/'N': ");
    char typeOfFood = sc.next().charAt(0);
    System.out.println("enter the distance: ");
    int dist = sc.nextInt();
    System.out.println("enter the quantity of food: ");
    int quantity = sc.nextInt();
        if((typeOfFood != 'V' && typeOfFood != 'N') || quantity < 1 || dist <=0){
            System.out.println("the bill amount is : -1 ");
        }
        else{
            int foodPercost = (typeOfFood == 'V') ? 12 : 15;
            int foodCost = foodPercost * quantity;
            int deleveryCost = 0;
            if(dist > 3 && dist <=6){
                deleveryCost = (dist - 3)*1;
                double bill_amount = foodCost + deleveryCost;
                System.out.println(bill_amount);
            } else if (dist > 6) {
                deleveryCost = (dist - 6)*2;
                double bill_amount = foodCost + deleveryCost;
                System.out.println(bill_amount);
            }
        }
}
}