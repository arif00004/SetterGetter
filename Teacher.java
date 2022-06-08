public class Teacher {

    private String name;
    private String subject;
    private int students;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public String getSubject(){
        return subject;
    }

    public void setStudents(int students){
        this.students = students;
    }

    public int getStudents(){
        return students;
    }

    public static void main(String[] args) {
        Teacher name = new Teacher();
        Teacher subject = new Teacher();
        Teacher students = new Teacher();

        name.setName("A");
        subject.setSubject("Biology");
        students.setStudents(20);

        System.out.println(name.getName());
        System.out.println(subject.getSubject());
        System.out.println(students.getStudents());
    }
}
