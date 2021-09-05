package customermailapplication;

public class CustomerFactory {
    public static Customer createCustomer(String type) {
        switch(type) {
            case "1":
                return new RegularCustomer();
            case "2":
                return new MountainCustomer();
            case "3":
                return new DelinquentCustomer();
        }
        return null;
    }
}
