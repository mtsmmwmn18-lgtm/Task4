package national;

public class NationalID {
    public static boolean verify(String nin) {
        return nin != null && nin.startsWith("CM") && nin.length() == 7;
    }
}
