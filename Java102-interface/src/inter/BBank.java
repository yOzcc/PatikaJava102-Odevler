package inter;

public class BBank implements IBank {
    private String bankName;
    private String terminalId;
    private String password;

    public BBank(String bankName, String terminalId, String password) {
        this.bankName = bankName;
        this.terminalId = terminalId;
        this.password = password;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean connect(String ipAddress) {
        System.out.println("User ip : " + ipAddress);
        System.out.println("Machine ip : " + this.hostIpAddress);
        System.out.println(this.getBankName() + " connected.");;
        return true;
    }

    @Override
    public boolean payment(double price, String cardNumber, String expirationDate, String cvc) {
        System.out.println("B response from the bank is awaited.");
        System.out.println("Transaction successful.");
        return true;
    }
}
