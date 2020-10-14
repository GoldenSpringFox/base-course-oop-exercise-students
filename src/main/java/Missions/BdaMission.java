package Missions;

import AerialModules.BdaModule;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public class BdaMission extends Mission {
    private String objective;
    private final BdaModule bdaModule;

    public BdaMission(Coordinates coordinates, AerialVehicle aerialVehicle, String pilot) throws AerialVehicleNotCompatibleException {
        super(coordinates, aerialVehicle, pilot, BdaModule.class);
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
                getObjective() + " with: " + bdaModule.getCamera();
    }
}
