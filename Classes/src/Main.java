class Customer {
    String customerName;
    String customerPhone;
    String customerAddress;
    Double squareFootage;

    Customer (String customerName, String customerPhone, String customerAddress, Double squareFootage){
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.customerAddress = customerAddress;
        this.squareFootage = squareFootage;
    }

}

class Residential extends Customer{

    private String propertyName;
    private Double residentialRate = 6.0 * (squareFootage / 1000);
    private boolean senior;
    private double seniorDiscount = residentialRate - (residentialRate * .15);

    Residential (String name, String phone, String address, Double footage, String propertyName, Boolean senior){
        super(name, phone, address, footage);
        this.propertyName = propertyName;
        this.senior = senior;

    }

    void WeekCharge(){
        System.out.println("Data for " + customerName + ":");
        System.out.println("\nPhone Number: " + customerPhone);
        System.out.println("Address: " + customerAddress);
        System.out.println("Property: " + propertyName);
        if (senior == true){
            System.out.println("Weekly Cost: $" + seniorDiscount + ". (at a 10% discount)");
        }else {
            System.out.println("Weekly Cost: $" + residentialRate);
        }
    }
}

class Commercial extends Customer{
    private String propertyName;
    private Double commercialRate = 5.0 * (squareFootage / 1000);
    private Double commercialDiscount = commercialRate - (commercialRate * .1);
    int x = 0;

    Commercial (String name, String phone, String address, Double footage,String propertyName){
        super(name, phone, address, footage);
        this.propertyName = propertyName;
    }

    void WeekCharge(){
        System.out.println("Data for " + customerName + ":");
        System.out.println("\nPhone Number: " + customerPhone);
        System.out.println("Address: " + customerAddress);
        if (x > 1){
            for (int i = 0; i <= x; i++){
                System.out.println("Property" + i + ": ");
            }
            System.out.println("Weekly Cost: $" + commercialDiscount + ". (at a 10% discount)");
        }else {
            System.out.println("Property: " + propertyName);
            System.out.println("Weekly Cost: $" + commercialRate);
        }
    }

}




public class Main {
    public static void main(String[] args) {
        Commercial commercial = new Commercial("SFDASF", "85884949", "933 street road",3000.8, "jacksons");

        Residential resident = new Residential("JacksonStreet", "767755", "323 avenue",
                1000.3, "anderson",true);

        commercial.WeekCharge();
        System.out.println(" ");
        resident.WeekCharge();
    }
}
