public abstract class Worker {
    private String nameLastName;
    private String mPhone;
    private String eMail;

    public Worker(String nameLastName, String mPhone, String eMail) {
        this.nameLastName = nameLastName;
        this.mPhone = mPhone;
        this.eMail = eMail;
    }

    public String getNameLastName() {
        return nameLastName;
    }

    public void setNameLastName(String nameLastName) {
        this.nameLastName = nameLastName;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void login(){
        System.out.println(this.nameLastName + " entered the University.");
    }

    public void exit(){
        System.out.println(this.nameLastName + " exited from University.");
    }

    public void diningHall(){
        System.out.println("Entered the dining hall.");
    }

    public static void loginUsers(Worker[] loginUser){
        for (Worker w : loginUser){
            w.login();
        }
    }
}
