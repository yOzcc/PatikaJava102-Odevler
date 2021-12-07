public class Computing extends CivilServant{
    private String task;

    public Computing(String nameLastName, String mPhone, String eMail, String department, String shift, String task){
        super(nameLastName, mPhone, eMail, department, shift);
        this.task = task;
    }

    public void setTask(String task){
        this.task = task;
    }

    public String getTask(){
        return task;
    }

    public void networkSetup(){
        System.out.println(this.getNameLastName() + " is setting up the network.");
    }
}
