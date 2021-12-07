public class Assistan extends Academician{
    private String officeHour;

    public Assistan(String nameLastName, String mPhone, String eMail, String department, String title, String officeHour){
        super(nameLastName, mPhone, eMail, department, title);
        this.officeHour = officeHour;
    }

    public void setOfficeHour(){
        this.officeHour = officeHour;
    }

    public String getOfficeHour(){
        return officeHour;
    }

    public void quiz(){
        System.out.println(this.getNameLastName() + " did a quiz.");
    }

    @Override
    public void enterLesson(String lessonHour) {
        System.out.println(this.getNameLastName() + " is entered the course : " + lessonHour);
    }
}
