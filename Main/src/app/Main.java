package app;

import tax.TaxService;
import processing.PassportService;
import registration.BusinessRegistry;

public class Main {
    public static void main(String[] args) {
        double income = 5000000;
        System.out.println(new TaxService().calculate(income));
        String nin = "CM123";
        System.out.println("Passport result: " + new PassportService().issue(nin));
        System.out.println(new BusinessRegistry().register("Kampala Ltd", "CM123"));
    }
}
