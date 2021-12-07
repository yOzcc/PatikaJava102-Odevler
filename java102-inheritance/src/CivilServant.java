public abstract class CivilServant extends Worker{
    private String department;
    private String shift;

    public CivilServant(String nameLastName, String mPhone, String eMail, String department, String shift) {
        super(nameLastName, mPhone, eMail);
        this.department = department;
        this.shift = shift;
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getShift(){
        return shift;
    }

    public void setShift(String shift){
        this.shift = shift;
    }

    public void work(){
        System.out.println(this.getNameLastName() + " is working.");
    }
    @Override
    public void login(){
        System.out.println(this.getNameLastName() + " is entered through Gate C.");
    }
}
