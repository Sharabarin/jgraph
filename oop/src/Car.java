public class Car {
    private Engine engine;

    private String name;
    private String model;
    private boolean status;




    public Car(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isStatus() {
        status = engine.getStatus();
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

