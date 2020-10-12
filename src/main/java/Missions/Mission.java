package Missions;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;
import Tools.Printer;

public abstract class Mission{
    private Coordinates coordinates;
    private AerialVehicle aerialVehicle;
    private String pilot;

    public Mission (Coordinates coordinates, AerialVehicle aerialVehicle, String pilot) {
        this.coordinates = coordinates;
        this.aerialVehicle = aerialVehicle;
        this.pilot = pilot;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public AerialVehicle getAerialVehicle() {
        return aerialVehicle;
    }

    public void setAerialVehicle(AerialVehicle aerialVehicle) {
        this.aerialVehicle = aerialVehicle;
    }

    public String getPilot() {
        return pilot;
    }

    public void setPilot(String pilot) {
        this.pilot = pilot;
    }

    public void begin() {Printer.print("Beginning Mission!");}
    public void cancel() {Printer.print("Abort Mission!");}
    public void finish() {Printer.print("Finish Mission!");}

    public abstract String getMissionDescription();
}
