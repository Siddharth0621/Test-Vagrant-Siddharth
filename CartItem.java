
public class CartItem {
  
  private String product;
  private double price, gst, quantity;


  public CartItem(String product, int price, int gst, int quantity) {
    this.product = product;
    this.price = price;
    this.gst = gst;
    this.quantity = quantity;
  }


  public String getProduct() {
    return product;
  }


  public void setProduct(String product) {
    this.product = product;
  }


  public double getPrice() {
    return price;
  }


  public void setPrice(double price) {
    this.price = price;
  }


  public double getGst() {
    return gst;
  }


  public void setGst(int gst) {
    this.gst = gst;
  }


  public double getQuantity() {
    return quantity;
  }


  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
  
  @Override
  public String toString() {
    return "CartItem {name: " + this.product + " amount: " + this.price + " gst: " + this.gst + " quantity: " + this.quantity; 
  }

  

}
