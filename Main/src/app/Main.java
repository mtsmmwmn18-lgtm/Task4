package app;

import tax.TaxService;
import processing.PassportService;
import registration.BusinessRegistry;

public class Main {
    public static void main(String[] args) {
        System.out.println(new TaxService().calculate(5000000));
        System.out.println(new PassportService().issue("CM123"));
        System.out.println(new BusinessRegistry().register("Kampala Ltd", "CM123"));
    }
}
