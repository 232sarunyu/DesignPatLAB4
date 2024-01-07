public class CustomMailFactory implements IcustomerFactory{
    @Override
    public ICustomer createcustomer(String NameT) {
        ICustomer customer = null;
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