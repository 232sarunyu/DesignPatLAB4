//make this class a subclass of customer
public class RegularCustomer implements ICustomer {
    @Override
    public String createMail() {
        return "Regular Customer";
    }
    @Override
    public String createBrochue() {
       return "Regular Customer Brochure";
        
    }
}
