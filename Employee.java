public class Employee {

    private String name;
    private String email;
    private int id;
    private float salary;

    public void setName(String name) {
        this.name = name;
        System.out.println(name);
    }

    public void setEmail(String email) {
        this.email = email;
        System.out.println(email);
    }

    public void setId(int id) {
        if (id > 50) {
            System.out.println(this.id = 0);
        } else {
            System.out.println(id);
        }
    }

    public void setSalary(float salary) {
        if (salary > 10000 || salary < 5000) {
            System.out.println("Its not good manner to ask salary");
        } else {
            System.out.println(salary);
        }
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
       return id;
    }

    public float getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee name = new Employee();
        Employee email = new Employee();
        Employee id = new Employee();
        Employee salary = new Employee();

        name.setName("A");
        email.setEmail("a@a.com");
        id.setId(25);
        salary.setSalary(8000);

        name.getName();
        email.getEmail();
        id.getId();
        salary.getSalary();
    }
}

