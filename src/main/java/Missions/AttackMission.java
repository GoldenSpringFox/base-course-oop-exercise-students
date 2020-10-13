package Missions;

import AerialModules.AttackModule;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public class AttackMission extends Mission {
    private String target;
    private final AttackModule attackModule;

    public AttackMission(String target, Coordinates coordinates, AerialVehicle aerialVehicle, String pilot) throws AerialVehicleNotCompatibleException {
        super(coordinates, aerialVehicle, pilot, AttackModule.class);
        this.target = target;
        attackModule = (AttackModule) getAerialVehicle().getModule(AttackModule.class);
    }

    public String getTarget() {
        return target;
    }

    public String getMissionDescription() {
        return getPilot() + ": " + getAerialVehicle().getClass().getSimpleName() + " Attacking " + getTarget() +
                " with: " + attackModule.getMissileType() + "X" + attackModule.getMissileType();
    }
}
