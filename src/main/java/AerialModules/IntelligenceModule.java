package AerialModules;

import Entities.SensorType;

public class IntelligenceModule extends Module {
    private SensorType sensor;

    public IntelligenceModule(SensorType sensor) {
        this.sensor = sensor;
    }

    public SensorType getSensor() {
        return sensor;
    }

    public void setSensor(SensorType sensor) {
        this.sensor = sensor;
    }
}