package AerialVehicles;

public abstract class Haron extends UAV {
    private final int hoursOfFlightBeforeHasToBeRepaired = 150;

    @Override
    public int getHoursOfFlightBeforeHasToBeRepaired() {
        return hoursOfFlightBeforeHasToBeRepaired;
    }
}
