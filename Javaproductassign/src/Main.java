public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Product p = new Product();
        p.setPrice(20.0);
        int quantity = 10;
        //System.out.println("" + p.getPrice());
       double productPrice = p.getPrice();
      double quantityPrice = p.getPrice(quantity);
        System.out.println("Product price : " + productPrice);
        System.out.println(("Price Based on quantity : " + quantityPrice));
    }
}