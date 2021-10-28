public class Product {
    String name;
    int price;
    String description;
    public Product(String name, int price, String description){
        this.name=name;
        this.price=price;
        this.description=description;
    }
    public void setName(String newName) {

        this.name=newName;
    }
    public String  getName() {

        return name ;
    }
    public void setPrice(int newPrice) {

        this.price=newPrice;
    }
    public int getPrice() {

        return price;
    }
    public void setDescription(String description) {

        this.description=description;
    }
    public String getDescription(){

        return description;
    }

}
