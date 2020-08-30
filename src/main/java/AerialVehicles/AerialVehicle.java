package AerialVehicles;

import Entities.Coordinates;
import Missions.Mission;
import Missions.MissionTypeException;


public abstract class AerialVehicle {
    private int hoursOfFlightSinceLastRepair;

    public AerialVehicle() {
        this.hoursOfFlightSinceLastRepair = 0;
    }

    public int getHoursOfFlightSinceLastRepair() {
        return hoursOfFlightSinceLastRepair;
    }
    public void setHoursOfFlightSinceLastRepair(int hoursOfFlightSinceLastRepair) {
        this.hoursOfFlightSinceLastRepair = hoursOfFlightSinceLastRepair;
    }
    public abstract int getHoursOfFlightBeforeHasToBeRepaired();

    protected void repair() {
        setHoursOfFlightSinceLastRepair(0);
    }

    public void check() {
        if (getHoursOfFlightSinceLastRepair() > getHoursOfFlightBeforeHasToBeRepaired())
            repair();
    }
}
