package pajerowski.tony;

public class HurtLockerModel {
    String name;
    String price;
    String type;
    String expiration;

    HurtLockerModel(String name, String price, String type, String expiration) throws MissingDataException {
        this.name = name;
        this.price = price;
        this.type = type;
        this.expiration = expiration;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String getExpiration() {
        return expiration;
    }
}
