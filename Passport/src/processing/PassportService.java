package processing;

import national.NationalID;
import secure.IdVault;

public class PassportService {
    public String issue(String nin) {
        if (NationalID.verify(nin) && IdVault.exists(nin)) {
            return "Successfully issued passport for " + nin;
        }
        return "Passport denied";
    }
}
