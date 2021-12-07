public class SecurityGuard extends CivilServant{
    private String document;

    public SecurityGuard(String nameLastName, String mPhone, String eMail, String department, String shift, String document) {
        super(nameLastName, mPhone, eMail, department, shift);
        this.document = document;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void watch(){
        System.out.println(this.getNameLastName() + " is keeping watch.");
    }
}
