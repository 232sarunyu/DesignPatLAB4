//make this class a subclass of customer
public class DelinquentCustomer implements ICustomer {
    @Override
    public String createMail() {
        return "Delinquent Customer";
    }

    @Override
    public String createBrochue() {
       return "Delinquent Customer Brochure";
        
    }   
}
