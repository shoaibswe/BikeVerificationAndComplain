public class Bike {
    private String name;
    private int id;
    private int engine_number;
    private int chassis_number;

    public Bike(String name, int id, int engine_number, int chassis_number) {
        this.name = name;
        this.id = id;
        this.engine_number = engine_number;
        this.chassis_number = chassis_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEngine_number() {
        return engine_number;
    }

    public void setEngine_number(int engine_number) {
        this.engine_number = engine_number;
    }

    public int getChassis_number() {
        return chassis_number;
    }

    public void setChassis_number(int chassis_number) {
        this.chassis_number = chassis_number;
    }
    
    
}
