package Missions;
import AerialModules.BdaModule;
import AerialModules.Module;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;
import Tools.Printer;
import com.sun.org.apache.xpath.internal.operations.Mod;

import java.util.HashMap;
import java.util.List;

public abstract class Mission{
    private Coordinates coordinates;
    private AerialVehicle aerialVehicle;
    private String pilot;
    private Class<? extends Module> relevantModule;

    public Mission(Coordinates coordinates, AerialVehicle aerialVehicle, String pilot, Class<? extends Module> relevantModule) throws AerialVehicleNotCompatibleException {
        this.coordinates = coordinates;
        this.aerialVehicle = aerialVehicle;
        this.pilot = pilot;
        this.relevantModule = relevantModule;
        checkAerialVehicleCompatibility();
    }

    private void checkAerialVehicleCompatibility() throws AerialVehicleNotCompatibleException {
        if (null == aerialVehicle.getModule(relevantModule))
            throw new AerialVehicleNotCompatibleException("Can't assign aerial vehicle to mission");
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

    public void begin() {
        this.aerialVehicle.flyTo(this.coordinates);
        Printer.print("Beginning Mission!");
    }
    public void cancel() {
        this.aerialVehicle.land();
        Printer.print("Abort Mission!");
    }
    public void finish() {
        this.aerialVehicle.land();
        Printer.print("Finish Mission!");
    }

    public abstract String getMissionDescription();
}
