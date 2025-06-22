class Product{
    int productid;
    String productname;
    String category;

    public Product(int productid, String productname, String category){
        this.productid = productid;
        this.productname = productname;
        this.category =  category;
    }
    public String toString(){
        return "Product ID: "+ productid + ", Name: " + productname + ", Catrgory: " + category; 
    }
}


public class App {

    //linear search by product id
    public static Product linearSearch(Product[] products, int targetId){
         for(int i = 0; i<products.length; i++){
            if(products[i].productid == targetId){
                return products[i];
            }
         }
         return null;
    }

    //binary search
    public static Product binarySearch(Product[] products, int targetId){
        int left = 0, right = products.length -1;
        while(left<= right){
            int mid = (left + right) / 2;
            if(products[mid].productid == targetId){
                return products[mid];
            }
            else if(products[mid].productid < targetId){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return null;
    }
    public static void main(String[] args)  {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Smartphone", "Electronics"),
            new Product(3, "Tablet", "Electronics"),
            new Product(4, "Headphones", "Accessories"),
            new Product(5, "Smartwatch", "Accessories")
        };
        System.out.println("Linear search gives product id: ");
        Product res1 = linearSearch(products, 3);
        if(res1 != null){
            System.out.println(res1);
        } else {
            System.out.println("Product not found");
        }
        System.out.println("Binary search gives product id: ");
        Product res2 = binarySearch(products, 3);
        if(res2 != null){
            System.out.println(res2);
        } else {
            System.out.println("Product not found");
        }
    }
}
