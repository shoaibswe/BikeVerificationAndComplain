public class Admin {
    private int id;
    private String name;
private double salary;
    public Admin(int id, String name,double salary) {
        this.id = id;
        this.name = name;
        this.salary=salary;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    void check_data(Bike b1){    
    }
}