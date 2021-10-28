import java.util.ArrayList;
import java.util.Scanner;

public class MyShop {

    boolean menuoptions;
    ArrayList<Product> Fruitslist;
    ArrayList<String> shoppingcart;

    public MyShop() {

        menuoptions = true;
        Fruitslist = new ArrayList<Product>();
        shoppingcart = new ArrayList<String>();
        Product Fruitname = new Product("Mango", 34, "Colour: green, Taste:Sour");
        Fruitslist.add(Fruitname);
        Fruitname = new Product("Banana", 20,  "colour: Yellow, Taste: Sweet ");
        Fruitslist.add(Fruitname);
        Fruitname= new Product("grapes", 40, "colour: red, bunch of grapes, Taste:Sweet");
        Fruitslist.add(Fruitname);

    }

    public void start() {

        while(menuoptions) {

            printMenu();
            int options=getUserInt();
            switch (options){
                case 1:

                    System.out.println("list of Fruits and cost available in the shop");
                    getFruitslist();
                    break;
                case 2:

                    getFruitslist();
                    System.out.println("Add things in shopping cart: ");
                    String AddListCart=getUserString();
                    shoppingcart.add(AddListCart);
                    System.out.println("list of items in My cart: ");
                    System.out.println("Fruit Name:" + "\t\t" + "Cost : " );
                    for(int item=0;item<Fruitslist.size();item++) {

                        if(shoppingcart.contains(Fruitslist.get(item).name)) {
                            System.out.println(Fruitslist.get(item).name +"\t\t\t"+ Fruitslist.get(item).price);

                        }
                    }

                    //System.out.println(shoppingcart);
                    System.out.println();
                    break;

                case 3:

                    int sum=0;
                    System.out.print("The cost of items in your cart is: ");

                    for(int item=0;item<Fruitslist.size();item++) {

                        if(shoppingcart.contains(Fruitslist.get(item).name)) {
                            sum=Fruitslist.get(item).price+sum;
                        }
                    }
                    System.out.println(sum);
                    break;

                case 4:

                    System.out.println("Remove things in shopping cart");
                    String RemoveListCart=getUserString();
                    shoppingcart.remove(RemoveListCart);
                    System.out.println("The " + RemoveListCart + "is removed from the cart");
                    System.out.println("The list of items in your cart : ");
                    System.out.println(shoppingcart);

                    break;
                case 5:

                    System.out.println("Write the Fruit name:");
                    String describeListCart=getUserString();
                    for(int i=0; i< Fruitslist.size();i++){
                        if(describeListCart.equals(Fruitslist.get(i).name)){
                            System.out.println("The description of" + describeListCart + ":");
                            System.out.println(Fruitslist.get(i).description);
                        }
                    }
                    break;

                default:

                    menuoptions=false;
                    System.out.println("You have entered the WRONG option. Please try again!");
                break;
            }
        }
    }

    public static void printMenu() {

        System.out.println("Click one of the following options:");
        System.out.println("1. List of fruits available in the shop.");
        System.out.println("2. Put things in the shopping cart.");
        System.out.println("3. Ask how much all the items in the shopping cart cost.");
        System.out.println("4. Remove items from the shopping cart.");
        System.out.println("5. Ask for the description of a specific product.");
    }

    public static int getUserInt() {

        int options;
        Scanner myscanner= new Scanner(System.in);
        options =myscanner.nextInt();
        return options;
    }

    public static String getUserString() {

        String cart;
        Scanner myscanner =new Scanner(System.in);
        cart=myscanner.next();
        return cart;
    }

    public void getFruitslist() {

        System.out.println("Fruit Name:" + "\t\t" + "Cost : " );
        for(int i=0;i<Fruitslist.size(); i++) {

            System.out.println(Fruitslist.get(i).name +"\t\t\t"+ Fruitslist.get(i).price);
        }
    }
}

