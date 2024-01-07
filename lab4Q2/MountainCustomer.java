//make this class a subclass of customer
public class MountainCustomer implements ICustomer {
    @Override
    public String createMail() {
        return "Mountain Customer";
    }
    @Override
    public String createBrochue() {
       return "Mountain Customer Brochure";
        
    }
}
