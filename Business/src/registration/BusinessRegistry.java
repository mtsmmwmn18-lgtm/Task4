package registration;

import national.NationalID;

public class BusinessRegistry {
    public String register(String name, String ownerNin) {
        if (NationalID.verify(ownerNin)) {
            return "Business " + name + " registered";
        }
        return "Invalid owner ID";
    }
}
