import java.util.Scanner;
public class CustomerMailApplication {
    /**
     * @param args the command line arguments
     */
    private ICustomer customer;
    public CustomerMailApplication(ICustomer customer) {
        this.customer = customer;
    }
    public static String getCustomerTypeFromUser() {
        String customerType = null;
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int type = inp.nextInt();
        switch(type) {
            case 1:
                customerType = "Regular";
                break;
            case 2:
                customerType = "Mountain";
                break;
            case 3:
                customerType = "Delinquent";
                break;
        }
        inp.close();
        return customerType;
    }
    public String generateMail() {
        return customer.createMail();
    }
    
    public static void main(String[] args) {
        IcustomerFactory icos = new CustomerBrochueFactory();
        String customerType = getCustomerTypeFromUser();
        ICustomer app = icos.createcustomer(customerType);
        System.out.println(app.createMail());
        System.out.println(app.createBrochue());        
    }
}
