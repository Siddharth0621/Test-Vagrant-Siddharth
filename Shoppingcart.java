import java.util.Comparator;
import java.util.PriorityQueue;
/* 
 * name: VT Siddharth
 * USN: 1BI20IS116
 * Branch : ISE
 */
class ShoppingCart {

  public static void main(String[] args) {
    CartItem c1 = new CartItem("Leather wallet", 1100, 18, 1);
    CartItem c2 = new CartItem("Umbrella", 900, 12, 4);
    CartItem c3 = new CartItem("Cigarette", 200, 28, 3);
    CartItem c4 = new CartItem("Honey", 100, 0, 2);

    PriorityQueue<CartItem> pq = new PriorityQueue<>(new Comparator<CartItem>() {
      @Override
      public int compare(CartItem o1, CartItem o2) {
        return Double.compare((o2.getGst() / 100.0 * o2.getPrice() * o2.getQuantity()), (o1.getGst() / 100.0 * o1.getPrice() * o1.getQuantity()));
      }
    });
    pq.add(c1);
    pq.add(c2);
    pq.add(c3);
    pq.add(c4);
    System.out.println("Highest gst amount paid item : " + pq.peek());
    double amount = 0.0;
    for (CartItem item : pq) {
      double itemPrice = item.getPrice();
      if(itemPrice >= 500) {
        itemPrice = itemPrice - (itemPrice * 0.05);
      }  
      amount += (itemPrice + (itemPrice * item.getGst() / 100)) * item.getQuantity();
    }
    System.out.println("Amount to be paid : " + amount);
  }
}