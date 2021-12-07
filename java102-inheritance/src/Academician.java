public abstract class Academician extends Worker{

    private String department;
    private String title;

    public Academician(String nameLastName, String mPhone, String eMail, String department, String title) {
        super(nameLastName, mPhone, eMail);
        this.department = department;
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract void enterLesson(String lessonHour);

    @Override
    public void login() {
        System.out.println(this.getNameLastName() + " is entered through Gate A.");
    }
}
