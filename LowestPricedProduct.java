class Product {
    int productCode, productPrice;
    String productName;

    public Product(int productCode, String productName, int productPrice) {
        this.productCode = productCode;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public void display() {
        System.out.println("Product Code: " + productCode);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + productPrice);
    }
}

public class LowestPricedProduct {

    public static void main(String[] args) {
        Product product1 = new Product(101, "Keyboard", 1200);
        Product product2 = new Product(102, "Mouse", 1140);
        Product product3 = new Product(103, "Monitor", 5999);

        if ((product1.productPrice < product2.productPrice) && (product1.productPrice < product3.productPrice)) {
            System.out.println("\nProduct with the Lowest Price:");
            product1.display();
        } else if ((product2.productPrice < product1.productPrice) && (product2.productPrice < product3.productPrice)) {
            System.out.println("\nProduct with the Lowest Price:");
            product2.display();

        } else {
            System.out.println("\nProduct with the Lowest Price:");
            product3.display();
        }

    }

}
