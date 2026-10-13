package secure;

public class IdVault {
    public static boolean exists(String nin) {
        return nin != null && nin.startsWith("CM") && nin.length() > 2;
    }
}
