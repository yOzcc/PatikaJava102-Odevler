package inter;

public interface IBank {

   final String hostIpAddress = "127.0.0.1";

   boolean connect(String ipAdress);

   boolean payment(double price, String cardNumber, String expirationDate, String cvc);
}
