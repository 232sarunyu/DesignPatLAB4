public class CustomMailFactory {
    public static Customer createCustomer(String NameT) {
        Customer customer = null;
        switch(NameT) {
            case "Regular":
                customer = new RegularCustomer();
                break;
            case "Mountain":
                customer = new MountainCustomer();
                break;
            case "Delinquent":
                customer = new DelinquentCustomer();
                break;
        }
        return customer;
    }
}