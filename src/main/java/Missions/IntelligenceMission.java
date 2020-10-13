package Missions;

import AerialModules.BdaModule;
import AerialModules.IntelligenceModule;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public class IntelligenceMission extends Mission {
    private String region;
    private IntelligenceModule intelligenceModule;

    public IntelligenceMission(Coordinates coordinates, AerialVehicle aerialVehicle, String pilot) throws AerialVehicleNotCompatibleException {
        super(coordinates, aerialVehicle, pilot, IntelligenceModule.class);
        intelligenceModule = (IntelligenceModule) aerialVehicle.getModule(BdaModule.class);
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getMissionDescription() {
        return getPilot() + ": " + getAerialVehicle().getClass().getSimpleName() + " Collecting Data in " +
                getRegion() + " with: " + intelligenceModule.getCamera();
    }
}
