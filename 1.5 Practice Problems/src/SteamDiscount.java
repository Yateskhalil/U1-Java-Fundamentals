public class SteamDiscount {
    public static void main(String[] args) {
        double gameCost = 60.00;
        double gameDiscount= gameCost*0.2;

       double discountPrice = gameCost-gameDiscount;

        System.out.println("The discounted game now cost $: " + discountPrice);
    }
    /*
    A game on Steam costs $60.00, but is currently on sale for 20% off. Create a program to display how much the game costs after the discount.
     */
}
