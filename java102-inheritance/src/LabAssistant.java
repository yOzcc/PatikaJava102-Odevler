public class LabAssistant extends Assistan{

    public LabAssistant(String nameLastName, String mPhone, String eMail, String department, String title, String officeHour){
        super(nameLastName, mPhone, eMail, department, title, officeHour);
    }

    public void enterLabs(){
        System.out.println(this.getNameLastName() + " entered the laboratories.");
    }

}
