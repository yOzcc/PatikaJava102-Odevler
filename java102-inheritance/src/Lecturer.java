public class Lecturer extends Academician{

    private String doorNumber;

    public Lecturer(String nameLastName, String mPhone, String eMail, String department, String title, String doorNumber) {
        super(nameLastName, mPhone,eMail,department, title);
        this.doorNumber = doorNumber;
    }

    public void setDoorRoom(String doorRoom){
        this.doorNumber = doorRoom;
    }

    public String getDoorRoom(){
        return doorNumber;
    }

    @Override
    public void enterLesson(String lessonHour) {
        System.out.println(this.getNameLastName() + " is entered the course : " + lessonHour);
    }

    @Override
    public void login() {
        System.out.println(this.getNameLastName() + " is entered through Gate B.");
    }

}
