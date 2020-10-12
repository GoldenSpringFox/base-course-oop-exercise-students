package Missions;

import AerialModules.AttackModule;
import AerialModules.BdaModule;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public class BdaMission extends Mission {
    private String objective;
    private final BdaModule bdaModule;

    public BdaMission(Coordinates coordinates, AerialVehicle aerialVehicle, String pilot) {
        super(coordinates, aerialVehicle, pilot);
        bdaModule = (BdaModule) aerialVehicle.getModule(BdaModule.class);
    }

    public String getObjective() {
        return objective;
    }

    public BdaModule getBdaModule() {
        return bdaModule;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public String getMissionDescription() {
        return getPilot() + ": " + getAerialVehicle().getClass().getSimpleName() + " Taking pictures of " +
                getObjective() + " with: " + bdaModule.getSensor();
    }
}
