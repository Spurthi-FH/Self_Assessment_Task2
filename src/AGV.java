import java.time.Duration;

public class AGV {
    private String ID;
    private double batteryLoad;        // in percentage (0 to 100)
    private double consumption;        // energy consumption per time unit
    private Duration chargingTime;     // time required to fully charge
    private Position position;         // current position of AGV
    private float maxSpeed;            // max speed
    private float actSpeed;            // actual current speed 

    // Constructor
    public AGV(String ID, double batteryLoad, double consumption, Duration chargingTime,
               Position position, float maxSpeed, float actSpeed) {
        this.ID = ID;
        this.batteryLoad = batteryLoad;
        this.consumption = consumption;
        this.chargingTime = chargingTime;
        this.position = position;
        this.maxSpeed = maxSpeed;
        this.actSpeed = actSpeed;
    }

    // Set AGV data 
    public void setData(String key, Object value) {
        switch (key) {
            case "ID":
                this.ID = (String) value;
                break;
            case "batteryLoad":
                this.batteryLoad = (Double) value;
                break;
            case "consumption":
                this.consumption = (Double) value;
                break;
            case "chargingTime":
                this.chargingTime = (Duration) value;
                break;
            case "position":
                this.position = (Position) value;
                break;
            case "maxSpeed":
                this.maxSpeed = (Float) value;
                break;
            case "actSpeed":
                this.actSpeed = (Float) value;
                break;
        }
    }

    // Return all AGV data
    public String getData() {
        return String.format("AGV ID: %s | Battery: %.2f%% | Consumption: %.2f units/time | " +
                        "Charge Time: %d mins | Position: %s | Max Speed: %.2f | Current Speed: %.2f",
                ID, batteryLoad, consumption, chargingTime.toMinutes(), position, maxSpeed, actSpeed);
    }

    // Getters and Setters
    public String getID() {
        return ID;
    }

    public double getBatteryLoad() {
        return batteryLoad;
    }

    public void setBatteryLoad(double batteryLoad) {
        this.batteryLoad = batteryLoad;
    }

    public double getConsumption() {
        return consumption;
    }

    public Duration getChargingTime() {
        return chargingTime;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public float getActSpeed() {
        return actSpeed;
    }

    @Override
    public String toString() {
        return getData();
    }
}
