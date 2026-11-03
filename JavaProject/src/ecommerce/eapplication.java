package ecommerce;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
class product {
    String Name;
    String company;
    int Price;
    String Desc;
    public product(String Name, String company, int Price, String Desc) {
        this.Name = Name;
        this.company = company;
        this.Price = Price;
        this.Desc = Desc;
    }
}
public class eapplication extends JFrame {
    ArrayList<product> cart = new ArrayList<>();
    JPanel panel;
    JButton electronics;
    JButton clothing;
    JButton furniture;
    JButton groceries;
    JButton homeDecor;
    JButton viewCart;
    Color backgroundColor = Color.LIGHT_GRAY;
    Color mainColor = Color.DARK_GRAY;
    Color categoryColor = Color.BLUE;
    Color subCategoryColor = Color.GREEN;
    Color backColor = Color.RED;
    Color cartColor = Color.ORANGE;
    public eapplication() {
        setTitle("E-Commerce Application");
        setSize(800, 600);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10));
        panel.setBackground(backgroundColor);
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        electronics = new JButton("Electronics");
        clothing = new JButton("Clothing");
        furniture = new JButton("Furniture");
        groceries = new JButton("Groceries");
        homeDecor = new JButton("Home Decor");
        viewCart = new JButton("View Cart");
        // Colors for main page
        styleButton(electronics, categoryColor);
        styleButton(clothing, Color.PINK);
        styleButton(furniture, Color.LIGHT_GRAY);
        styleButton(groceries, Color.GREEN);
        styleButton(homeDecor, Color.ORANGE);
        styleButton(viewCart, cartColor);
        panel.add(viewCart);
        panel.add(electronics);
        panel.add(clothing);
        panel.add(furniture);
        panel.add(groceries);
        panel.add(homeDecor);
        add(panel);
        viewCart.addActionListener(e -> showCart());
        electronics.addActionListener(e -> showElectronics());
        clothing.addActionListener(e -> showClothing());
        furniture.addActionListener(e -> showFurniture());
        groceries.addActionListener(e -> showGroceries());
        homeDecor.addActionListener(e -> showHomeDecor());
        setVisible(true);
    }
    void styleButton(JButton button, Color color) {
        button.setBackground(color);
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Arial", Font.BOLD, 16));
        button.setFocusPainted(false);
    }
    void refresh() {
        panel.revalidate();
        panel.repaint();
    }
    void addBackButton(Runnable action) {
        JButton back = new JButton("← Back");
        styleButton(back, backColor);
        panel.add(back);
        back.addActionListener(e -> action.run());
    }
    void showProduct(product p) {
        JOptionPane.showMessageDialog(
                this,
                "Name : " + p.Name + "\n" +
                "Company : " + p.company + "\n" +
                "Price : " + p.Price + "\n" +
                "Description : " + p.Desc,
                "Product Details",
                JOptionPane.INFORMATION_MESSAGE);
        cart.add(p);
        JOptionPane.showMessageDialog(
                this,
                p.Name + " added to Cart!",
                "Cart",
                JOptionPane.INFORMATION_MESSAGE);
    }
    void addProductButton(
            String buttonName,
            String productName,
            String company,
            int price,
            String description
    ) {
        JButton button = new JButton(buttonName);
        styleButton(button, subCategoryColor);
        panel.add(button);
        button.addActionListener(e -> {
            product p = new product(
                    productName,
                    company,
                    price,
                    description
            );
            showProduct(p);
        });
    }
    void showCart() {
        if (cart.isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Cart is Empty",
                    "Shopping Cart",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            String message = "";
            int total = 0;
            for (product p : cart) {
                message = message +
                        p.Name +
                        " - " +
                        p.Price +
                        "\n";
                total = total + p.Price;
            }
            message = message +
                    "\n--------------------\n" +
                    "Total = " +
                    total;
            JOptionPane.showMessageDialog(
                    this,
                    message,
                    "Shopping Cart",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
    void showMainPage() {
        panel.removeAll();
        panel.add(viewCart);
        panel.add(electronics);
        panel.add(clothing);
        panel.add(furniture);
        panel.add(groceries);
        panel.add(homeDecor);
        refresh();
    }
    void showElectronics() {
        panel.removeAll();
        JButton mobile = new JButton("Mobile");
        JButton laptop = new JButton("Laptop");
        JButton television = new JButton("Television");
        JButton speakers = new JButton("Speakers");
        JButton earphones = new JButton("Earphones");

        styleButton(mobile, categoryColor);
        styleButton(laptop, categoryColor);
        styleButton(television, categoryColor);
        styleButton(speakers, categoryColor);
        styleButton(earphones, categoryColor);
        panel.add(mobile);
        panel.add(laptop);
        panel.add(television);
        panel.add(speakers);
        panel.add(earphones);
        addBackButton(() -> showMainPage());
        mobile.addActionListener(e -> showMobile());
        laptop.addActionListener(e -> showLaptop());
        television.addActionListener(e -> showTelevision());
        speakers.addActionListener(e -> showSpeakers());
        earphones.addActionListener(e -> showEarphones());
        refresh();
    }
    void showMobile() {
        panel.removeAll();
        addProductButton("iPhone", "iPhone",
                "Apple",
                200000,
                "Smart Phone"
        );
        addProductButton(
                "Samsung",
                "Samsung",
                "Samsung",
                80000,
                "Android Smart Phone"
        );
        addProductButton(
                "OnePlus",
                "OnePlus",
                "OnePlus",
                60000,
                "Fast Android Smart Phone"
        );
        addProductButton(
                "Redmi",
                "Redmi",
                "Xiaomi",
                25000,
                "Budget Smart Phone"
        );
        addProductButton(
                "Vivo",
                "Vivo",
                "Vivo",
                30000,
                "Camera Smart Phone"
        );
        addBackButton(() -> showElectronics());
        refresh();
    }
    void showLaptop() {
        panel.removeAll();
        addProductButton(
                "Dell",
                "Dell Laptop",
                "Dell",
                55000,
                "Gaming Laptop"
        );

        addProductButton(
                "HP",
                "HP Laptop",
                "HP",
                50000,
                "Business Laptop"
        );

        addProductButton(
                "Lenovo",
                "Lenovo Laptop",
                "Lenovo",
                45000,
                "Student Laptop"
        );

        addProductButton(
                "ASUS",
                "ASUS Laptop",
                "ASUS",
                60000,
                "Gaming Laptop"
        );

        addProductButton(
                "Acer",
                "Acer Laptop",
                "Acer",
                40000,
                "Budget Laptop"
        );

        addBackButton(() -> showElectronics());

        refresh();
    }
    void showTelevision() {

        panel.removeAll();

        addProductButton(
                "Sony",
                "Sony TV",
                "Sony",
                60000,
                "Smart LED TV"
        );

        addProductButton(
                "Samsung",
                "Samsung TV",
                "Samsung",
                55000,
                "4K Smart TV"
        );

        addProductButton(
                "LG",
                "LG TV",
                "LG",
                50000,
                "OLED Smart TV"
        );

        addProductButton(
                "OnePlus",
                "OnePlus TV",
                "OnePlus",
                35000,
                "Android Smart TV"
        );

        addProductButton(
                "MI",
                "MI TV",
                "MI",
                30000,
                "Budget Smart TV"
        );

        addBackButton(() -> showElectronics());

        refresh();
    }
    void showSpeakers() {

        panel.removeAll();

        addProductButton(
                "JBL",
                "JBL Speaker",
                "JBL",
                8000,
                "Portable Bluetooth Speaker"
        );

        addProductButton(
                "Boat",
                "Boat Speaker",
                "Boat",
                3000,
                "Wireless Bluetooth Speaker"
        );

        addProductButton(
                "Sony",
                "Sony Speaker",
                "Sony",
                10000,
                "Powerful Wireless Speaker"
        );

        addProductButton(
                "Bose",
                "Bose Speaker",
                "Bose",
                15000,
                "Premium Bluetooth Speaker"
        );

        addProductButton(
                "Portronics",
                "Portronics Speaker",
                "Portronics",
                2500,
                "Compact Wireless Speaker"
        );

        addBackButton(() -> showElectronics());

        refresh();
    }
    void showEarphones() {

        panel.removeAll();

        addProductButton(
                "Apple",
                "AirPods",
                "Apple",
                15000,
                "Wireless Earbuds"
        );

        addProductButton(
                "Boat",
                "Boat Earbuds",
                "Boat",
                2000,
                "Wireless Earbuds"
        );

        addProductButton(
                "Realme",
                "Realme Buds",
                "Realme",
                2500,
                "Bluetooth Earbuds"
        );

        addProductButton(
                "Oppo",
                "Oppo Enco",
                "Oppo",
                3000,
                "Wireless Earbuds"
        );

        addProductButton(
                "Noise",
                "Noise Buds",
                "Noise",
                1800,
                "Affordable Wireless Earbuds"
        );
        addBackButton(() -> showElectronics());
        refresh();
    }
    void showClothing() {
        panel.removeAll();
        JButton tshirt = new JButton("T-Shirt");
        JButton jeans = new JButton("Jeans");
        JButton shirts = new JButton("Shirts");
        JButton dresses = new JButton("Dresses");
        JButton shoes = new JButton("Shoes");

        styleButton(tshirt, new Color(155, 89, 182));
        styleButton(jeans, new Color(155, 89, 182));
        styleButton(shirts, new Color(155, 89, 182));
        styleButton(dresses, new Color(155, 89, 182));
        styleButton(shoes, new Color(155, 89, 182));

        panel.add(tshirt);
        panel.add(jeans);
        panel.add(shirts);
        panel.add(dresses);
        panel.add(shoes);
        addBackButton(() -> showMainPage());
        tshirt.addActionListener(e -> showTShirts());
        jeans.addActionListener(e -> showJeans());
        shirts.addActionListener(e -> showShirts());
        dresses.addActionListener(e -> showDresses());
        shoes.addActionListener(e -> showShoes());
        refresh();
    }
     void showTShirts() {
        panel.removeAll();
        addProductButton(
                "Nike",
                "Nike T-Shirt",
                "Nike",
                1500,
                "Cotton T-Shirt"
        );
        addProductButton(
                "Adidas",
                "Adidas T-Shirt",
                "Adidas",
                1400,
                "Sports T-Shirt"
        );
        addProductButton(
                "Puma",
                "Puma T-Shirt",
                "Puma",
                1200,
                "Casual T-Shirt"
        );
        addProductButton(
                "Levi's",
                "Levi's T-Shirt",
                "Levi's",
                1800,
                "Premium T-Shirt"
        );
        addProductButton(
                "H&M",
                "H&M T-Shirt",
                "H&M",
                1000,
                "Casual Cotton T-Shirt"
        );
        addBackButton(() -> showClothing());
        refresh();
    }
    void showJeans() {
        panel.removeAll();
        addProductButton(
                "Levi's",
                "Levi's Jeans",
                "Levi's",
                2500,
                "Blue Denim Jeans"
        );
        addProductButton(
                "Wrangler",
                "Wrangler Jeans",
                "Wrangler",
                2800,
                "Comfort Fit Jeans"
        );
        addProductButton(
                "Lee",
                "Lee Jeans",
                "Lee",
                2200,
                "Regular Fit Jeans"
        );
        addProductButton(
                "Pepe Jeans",
                "Pepe Jeans",
                "Pepe Jeans",
                3000,
                "Slim Fit Jeans"
        );

        addProductButton(
                "Spykar",
                "Spykar Jeans",
                "Spykar",
                2000,
                "Casual Denim Jeans"
        );
        addBackButton(() -> showClothing());
        refresh();
    }
   void showShirts() {
        panel.removeAll();
        addProductButton(
                "Peter England",
                "Peter England Shirt",
                "Peter England",
                2000,
                "Formal Shirt"
        );
        addProductButton(
                "Allen Solly",
                "Allen Solly Shirt",
                "Allen Solly",
                2200,
                "Casual Shirt"
        );
        addProductButton(
                "Van Heusen",
                "Van Heusen Shirt",
                "Van Heusen",
                2500,
                "Formal Shirt"
        );
        addProductButton(
                "Louis Philippe",
                "Louis Philippe Shirt",
                "Louis Philippe",
                2800,
                "Premium Formal Shirt"
        );
        addProductButton(
                "Raymond",
                "Raymond Shirt",
                "Raymond",
                3000,
                "Premium Cotton Shirt"
        );
        addBackButton(() -> showClothing());
        refresh();
    }
     void showDresses() {
        panel.removeAll();
        addProductButton(
                "Zara",
                "Zara Dress",
                "Zara",
                3500,
                "Women's Casual Dress"
        );
        addProductButton(
                "H&M",
                "H&M Dress",
                "H&M",
                2500,
                "Casual Dress"
        );
        addProductButton(
                "Biba",
                "Biba Dress",
                "Biba",
                3000,
                "Ethnic Dress"
        );

        addProductButton(
                "Aurelia",
                "Aurelia Dress",
                "Aurelia",
                2800,
                "Women's Ethnic Dress"
        );

        addProductButton(
                "FabIndia",
                "FabIndia Dress",
                "FabIndia",
                4000,
                "Traditional Cotton Dress"
        );

        addBackButton(() -> showClothing());

        refresh();
    }
    void showShoes() {

        panel.removeAll();

        addProductButton(
                "Nike",
                "Nike Shoes",
                "Nike",
                5000,
                "Sports Shoes"
        );

        addProductButton(
                "Adidas",
                "Adidas Shoes",
                "Adidas",
                4500,
                "Running Shoes"
        );

        addProductButton(
                "Puma",
                "Puma Shoes",
                "Puma",
                3500,
                "Casual Sports Shoes"
        );

        addProductButton(
                "Reebok",
                "Reebok Shoes",
                "Reebok",
                4000,
                "Training Shoes"
        );

        addProductButton(
                "Skechers",
                "Skechers Shoes",
                "Skechers",
                5500,
                "Comfort Walking Shoes"
        );

        addBackButton(() -> showClothing());
         refresh();
    }
    void showFurniture() {
        panel.removeAll();
        JButton sofa = new JButton("Sofa");
        JButton bed = new JButton("Bed");
        JButton chair = new JButton("Chair");
        JButton table = new JButton("Table");
        JButton cupboard = new JButton("Cupboard");
        styleButton(sofa, new Color(52, 73, 94));
        styleButton(bed, new Color(52, 73, 94));
        styleButton(chair, new Color(52, 73, 94));
        styleButton(table, new Color(52, 73, 94));
        styleButton(cupboard, new Color(52, 73, 94));
        panel.add(sofa);
        panel.add(bed);
        panel.add(chair);
        panel.add(table);
        panel.add(cupboard);
        addBackButton(() -> showMainPage());
        sofa.addActionListener(e -> showSofa());
        bed.addActionListener(e -> showBed());
        chair.addActionListener(e -> showChair());
        table.addActionListener(e -> showTable());
        cupboard.addActionListener(e -> showCupboard());
        refresh();
    }
    void showSofa() {
        panel.removeAll();
        addProductButton(
                "Urban Ladder",
                "Urban Ladder Sofa",
                "Urban Ladder",
                30000,
                "Comfortable 3-Seater Sofa"
        );
        addProductButton(
                "Pepperfry",
                "Pepperfry Sofa",
                "Pepperfry",
                28000,
                "Modern Fabric Sofa"
        );
        addProductButton(
                "IKEA",
                "IKEA Sofa",
                "IKEA",
                35000,
                "Modern Living Room Sofa"
        );
        addProductButton(
                "Wakefit",
                "Wakefit Sofa",
                "Wakefit",
                25000,
                "Comfortable Fabric Sofa"
        );
        addProductButton(
                "Home Centre",
                "Home Centre Sofa",
                "Home Centre",
                32000,
                "Premium Sofa"
        );
        addBackButton(() -> showFurniture());
        refresh();
    }
      void showBed() {
        panel.removeAll();
        addProductButton(
                "Wakefit",
                "Wakefit Bed",
                "Wakefit",
                25000,
                "Wooden King Size Bed"
        );
        addProductButton(
                "IKEA",
                "IKEA Bed",
                "IKEA",
                30000,
                "Modern Wooden Bed"
        );
        addProductButton(
                "Pepperfry",
                "Pepperfry Bed",
                "Pepperfry",
                28000,
                "King Size Storage Bed"
        );
        addProductButton(
                "Urban Ladder",
                "Urban Ladder Bed",
                "Urban Ladder",
                35000,
                "Premium Wooden Bed"
        );
        addProductButton(
                "Home Centre",
                "Home Centre Bed",
                "Home Centre",
                32000,
                "Modern Storage Bed"
        );
        addBackButton(() -> showFurniture());
        refresh();
    }
     void showChair() {
        panel.removeAll();
        addProductButton(
                "Nilkamal",
                "Nilkamal Chair",
                "Nilkamal",
                2500,
                "Comfortable Plastic Chair"
        );
        addProductButton(
                "IKEA",
                "IKEA Chair",
                "IKEA",
                4500,
                "Modern Dining Chair"
        );
        addProductButton(
                "Urban Ladder",
                "Urban Ladder Chair",
                "Urban Ladder",
                6000,
                "Premium Wooden Chair"
        );
        addProductButton(
                "Pepperfry",
                "Pepperfry Chair",
                "Pepperfry",
                5000,
                "Modern Wooden Chair"
        );
        addProductButton(
                "Godrej Interio",
                "Godrej Interio Chair",
                "Godrej Interio",
                7000,
                "Ergonomic Office Chair"
        );
        addBackButton(() -> showFurniture());
        refresh();
    }
     void showTable() {
        panel.removeAll();
        addProductButton(
                "IKEA",
                "IKEA Table",
                "IKEA",
                8000,
                "Modern Dining Table"
        );
        addProductButton(
                "Urban Ladder",
                "Urban Ladder Table",
                "Urban Ladder",
                12000,
                "Wooden Dining Table"
        );
        addProductButton(
                "Pepperfry",
                "Pepperfry Table",
                "Pepperfry",
                10000,
                "Solid Wood Table"
        );
        addProductButton(
                "Wakefit",
                "Wakefit Table",
                "Wakefit",
                9000,
                "Study Table"
        );
        addProductButton(
                "Home Centre",
                "Home Centre Table",
                "Home Centre",
                11000,
                "Contemporary Dining Table"
        );
        addBackButton(() -> showFurniture());
        refresh();
    }
    void showCupboard() {
        panel.removeAll();
        addProductButton(
                "IKEA",
                "IKEA Cupboard",
                "IKEA",
                15000,
                "Modern Wooden Cupboard"
        );
        addProductButton(
                "Urban Ladder",
                "Urban Ladder Cupboard",
                "Urban Ladder",
                22000,
                "Premium Wooden Cupboard"
        );
        addProductButton(
                "Pepperfry",
                "Pepperfry Cupboard",
                "Pepperfry",
                18000,
                "Wooden Storage Cupboard"
        );
        addProductButton(
                "Godrej Interio",
                "Godrej Interio Cupboard",
                "Godrej Interio",
                20000,
                "Steel Storage Cupboard"
        );
        addProductButton(
                "Home Centre",
                "Home Centre Cupboard",
                "Home Centre",
                17000,
                "Modern Storage Cupboard"
        );
        addBackButton(() -> showFurniture());
        refresh();
    }
    void showGroceries() {
        panel.removeAll();
        JButton rice = new JButton("Rice");
        JButton wheat = new JButton("Wheat");
        JButton milk = new JButton("Milk");
        JButton fruits = new JButton("Fruits");
        JButton vegetables = new JButton("Vegetables");

        styleButton(rice, new Color(39, 174, 96));
        styleButton(wheat, new Color(39, 174, 96));
        styleButton(milk, new Color(39, 174, 96));
        styleButton(fruits, new Color(39, 174, 96));
        styleButton(vegetables, new Color(39, 174, 96));
        panel.add(rice);
        panel.add(wheat);
        panel.add(milk);
        panel.add(fruits);
        panel.add(vegetables);
        addBackButton(() -> showMainPage());
        rice.addActionListener(e -> showRice());
        wheat.addActionListener(e -> showWheat());
        milk.addActionListener(e -> showMilk());
        fruits.addActionListener(e -> showFruits());
        vegetables.addActionListener(e -> showVegetables());
        refresh();
    }
    void showRice() {
        panel.removeAll();
        addProductButton(
                "India Gate",
                "India Gate Rice",
                "India Gate",
                800,
                "Premium Basmati Rice"
        );
        addProductButton(
                "Daawat",
                "Daawat Rice",
                "Daawat",
                750,
                "Basmati Rice"
        );
        addProductButton(
                "Kohinoor",
                "Kohinoor Rice",
                "Kohinoor",
                700,
                "Long Grain Rice"
        );
        addProductButton(
                "Fortune",
                "Fortune Rice",
                "Fortune",
                600,
                "Everyday Rice"
        );
        addProductButton(
                "Lal Qilla",
                "Lal Qilla Rice",
                "Lal Qilla",
                850,
                "Premium Basmati Rice"
        );
        addBackButton(() -> showGroceries());
        refresh();
    }
    void showWheat() {
        panel.removeAll();
        addProductButton(
                "Aashirvaad",
                "Aashirvaad Atta",
                "Aashirvaad",
                450,
                "Whole Wheat Flour"
        );
        addProductButton(
                "Fortune",
                "Fortune Atta",
                "Fortune",
                400,
                "Whole Wheat Flour"
        );
        addProductButton(
                "Pillsbury",
                "Pillsbury Atta",
                "Pillsbury",
                420,
                "Chakki Atta"
        );
        addProductButton(
                "Annapurna",
                "Annapurna Atta",
                "Annapurna",
                390,
                "Whole Wheat Atta"
        );
        addProductButton(
                "Nature Fresh",
                "Nature Fresh Atta",
                "Nature Fresh",
                430,
                "Whole Wheat Flour");
        addBackButton(() -> showGroceries());
        refresh();
    }
    void showMilk() {
        panel.removeAll();
        addProductButton(
                "Amul",
                "Amul Milk",
                "Amul",
                35,
                "Fresh Milk");
        addProductButton(
                "Nandini",
                "Nandini Milk",
                "Nandini",
                35,
                "Fresh Milk");
        addProductButton(
                "Mother Dairy",
                "Mother Dairy Milk",
                "Mother Dairy",
                36,
                "Fresh Milk");
        addProductButton(
                "Heritage",
                "Heritage Milk",
                "Heritage",
                38,
                "Fresh Cow Milk");
        addProductButton(
                "Aavin",
                "Aavin Milk",
                "Aavin",
                35,
                "Fresh Milk");
        addBackButton(() -> showGroceries());
        refresh();
    }
    void showFruits() {
        panel.removeAll();
        addProductButton(
                "Fresho",
                "Fresho Apples",
                "Fresho",
                180,
                "Fresh Apples");
       addProductButton(
                "Farm Fresh",
                "Farm Fresh Fruits",
                "Farm Fresh",
                150,
                "Fresh Seasonal Fruits");
        addProductButton(
                "Organic India",
                "Organic Fruits",
                "Organic India",
                200,
                "Organic Fresh Fruits");
        addProductButton(
                "Nature's Basket",
                "Nature's Basket Fruits",
                "Nature's Basket",
                220,
                "Premium Fresh Fruits");
        addProductButton(
                "BigBasket",
                "BigBasket Fruits",
                "BigBasket",
                160,
                "Fresh Fruits"
        );

        addBackButton(() -> showGroceries());

        refresh();
    }
    void showVegetables() {

        panel.removeAll();

        addProductButton(
                "Fresho",
                "Fresho Vegetables",
                "Fresho",
                100,
                "Fresh Vegetables"
        );

        addProductButton(
                "Farm Fresh",
                "Farm Fresh Vegetables",
                "Farm Fresh",
                90,
                "Fresh Seasonal Vegetables"
        );

        addProductButton(
                "Organic India",
                "Organic Vegetables",
                "Organic India",
                140,
                "Organic Fresh Vegetables"
        );

        addProductButton(
                "Nature's Basket",
                "Nature's Basket Vegetables",
                "Nature's Basket",
                160,
                "Premium Vegetables"
        );

        addProductButton(
                "BigBasket",
                "BigBasket Vegetables",
                "BigBasket",
                120,
                "Fresh Vegetables"
        );

        addBackButton(() -> showGroceries());

        refresh();
    }
    void showHomeDecor() {

        panel.removeAll();

        JButton wallClock = new JButton("Wall Clock");
        JButton lamps = new JButton("Lamps");
        JButton curtains = new JButton("Curtains");
        JButton paintings = new JButton("Paintings");
        JButton vases = new JButton("Vases");

        styleButton(wallClock, new Color(230, 126, 34));
        styleButton(lamps, new Color(230, 126, 34));
        styleButton(curtains, new Color(230, 126, 34));
        styleButton(paintings, new Color(230, 126, 34));
        styleButton(vases, new Color(230, 126, 34));

        panel.add(wallClock);
        panel.add(lamps);
        panel.add(curtains);
        panel.add(paintings);
        panel.add(vases);

        addBackButton(() -> showMainPage());

        wallClock.addActionListener(e -> showWallClock());
        lamps.addActionListener(e -> showLamps());
        curtains.addActionListener(e -> showCurtains());
        paintings.addActionListener(e -> showPaintings());
        vases.addActionListener(e -> showVases());

        refresh();
    }
    void showWallClock() {
        panel.removeAll();

        addProductButton(
                "Ajanta",
                "Ajanta Wall Clock",
                "Ajanta",
                500,
                "Classic Wall Clock"
        );

        addProductButton(
                "Oreva",
                "Oreva Wall Clock",
                "Oreva",
                700,
                "Modern Wall Clock"
        );

        addProductButton(
                "Solimo",
                "Solimo Wall Clock",
                "Solimo",
                600,
                "Decorative Wall Clock"
        );

        addProductButton(
                "IKEA",
                "IKEA Wall Clock",
                "IKEA",
                1200,
                "Modern Designer Clock"
        );

        addProductButton(
                "Flipkart SmartBuy",
                "SmartBuy Wall Clock",
                "Flipkart SmartBuy",
                800,
                "Decorative Wall Clock"
        );

        addBackButton(() -> showHomeDecor());

        refresh();
    }
    void showLamps() {

        panel.removeAll();

        addProductButton(
                "Philips",
                "Philips Lamp",
                "Philips",
                1200,
                "LED Table Lamp"
        );

        addProductButton(
                "Wipro",
                "Wipro Lamp",
                "Wipro",
                1000,
                "LED Study Lamp"
        );

        addProductButton(
                "IKEA",
                "IKEA Lamp",
                "IKEA",
                1500,
                "Modern Table Lamp"
        );

        addProductButton(
                "Havells",
                "Havells Lamp",
                "Havells",
                1300,
                "Decorative LED Lamp"
        );

        addProductButton(
                "Syska",
                "Syska Lamp",
                "Syska",
                900,
                "LED Desk Lamp"
        );

        addBackButton(() -> showHomeDecor());

        refresh();
    }
    void showCurtains() {

        panel.removeAll();

        addProductButton(
                "D'Decor",
                "D'Decor Curtains",
                "D'Decor",
                2500,
                "Premium Window Curtains"
        );

        addProductButton(
                "IKEA",
                "IKEA Curtains",
                "IKEA",
                2000,
                "Modern Curtains"
        );

        addProductButton(
                "Home Centre",
                "Home Centre Curtains",
                "Home Centre",
                2200,
                "Decorative Curtains"
        );

        addProductButton(
                "Bombay Dyeing",
                "Bombay Dyeing Curtains",
                "Bombay Dyeing",
                1800,
                "Cotton Curtains"
        );

        addProductButton(
                "Spaces",
                "Spaces Curtains",
                "Spaces",
                2300,
                "Designer Curtains"
        );

        addBackButton(() -> showHomeDecor());

        refresh();
    }
    void showPaintings() {

        panel.removeAll();

        addProductButton(
                "Amazon Basics",
                "Wall Painting",
                "Amazon Basics",
                1500,
                "Decorative Wall Art"
        );

        addProductButton(
                "IKEA",
                "IKEA Painting",
                "IKEA",
                1800,
                "Modern Wall Art"
        );

        addProductButton(
                "Home Centre",
                "Home Centre Painting",
                "Home Centre",
                2000,
                "Decorative Canvas Art"
        );

        addProductButton(
                "Pepperfry",
                "Pepperfry Painting",
                "Pepperfry",
                1700,
                "Abstract Wall Painting"
        );

        addProductButton(
                "Myntra",
                "Myntra Wall Art",
                "Myntra",
                1400,
                "Decorative Wall Art"
        );

        addBackButton(() -> showHomeDecor());

        refresh();
    }
    void showVases() {
        panel.removeAll();
        addProductButton(
                "IKEA",
                "IKEA Vase",
                "IKEA",
                900,
                "Ceramic Flower Vase"
        );

        addProductButton(
                "Home Centre",
                "Home Centre Vase",
                "Home Centre",
                1100,
                "Decorative Ceramic Vase"
        );

        addProductButton(
                "Pepperfry",
                "Pepperfry Vase",
                "Pepperfry",
                1300,
                "Decorative Flower Vase"
        );

        addProductButton(
                "Amazon Basics",
                "Amazon Basics Vase",
                "Amazon Basics",
                800,
                "Glass Flower Vase"
        );
        addProductButton(
                "Ellementry",
                "Ellementry Vase",
                "Ellementry",
                1600,
                "Handcrafted Decorative Vase"
        );
        addBackButton(() -> showHomeDecor());
        refresh();
    }
    public static void main(String[] args) {
        new eapplication();
    }
}