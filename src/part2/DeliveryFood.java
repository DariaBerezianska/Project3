package part2;

import java.util.Random;

//Outer class
public class DeliveryFood {
    private boolean orderAccepted;

    public void setOrderAccepted(boolean orderAccepted) {
        this.orderAccepted = orderAccepted;
    }

    //Inner class
    public class OrderStatus {
        public void infoStatus() {
            if (orderAccepted) {
                System.out.println("Your order is accepted!");
            } else {
                System.out.println("We will accept your order soon");
            }
        }
    }

    // Local class
    public void cookFood() {
        class Cooking {
            private void cook() {
                Random random = new Random();
                int randomValue = random.nextInt(70);
                System.out.println("Your order will be cooked in " + randomValue + " minutes");
            }
        }
        Cooking food = new Cooking();
        food.cook();
    }

    // Anonymous class
    public void delivery() {
        Runnable action = new Runnable() {
            @Override
            public void run() {
                System.out.println("Your order is on its way to you");
            }
        };
        action.run();
    }

    public static void main(String[] args) {
        DeliveryFood deliveryFood = new DeliveryFood();
        deliveryFood.setOrderAccepted(true);
        //using Inner class
        DeliveryFood.OrderStatus orderStatus = deliveryFood.new OrderStatus();
        orderStatus.infoStatus();
        //using Local class
        deliveryFood.cookFood();
        //using Anonymous class
        deliveryFood.delivery();

    }
}
