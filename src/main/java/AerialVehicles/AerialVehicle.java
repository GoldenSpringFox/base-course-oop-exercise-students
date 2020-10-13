package AerialVehicles;

import AerialModules.Module;
import Entities.Coordinates;
import Tools.Printer;

import java.util.HashMap;
import java.util.List;


public abstract class AerialVehicle {
    private int hoursOfFlightSinceLastRepair;
    private boolean readyToFly;
    private final HashMap<Class<? extends Module>, Module> modules;

    public AerialVehicle(List<Class<? extends Module>> possibleModules) {
        this.hoursOfFlightSinceLastRepair = 0;
        this.readyToFly = true;
        this.modules = declarePossibleModules(possibleModules);
    }

    public int getHoursOfFlightSinceLastRepair() {
        return hoursOfFlightSinceLastRepair;
    }
    public void setHoursOfFlightSinceLastRepair(int hoursOfFlightSinceLastRepair) {
        this.hoursOfFlightSinceLastRepair = hoursOfFlightSinceLastRepair;
    }
    protected abstract int getHoursOfFlightBeforeHasToBeRepaired();
    public boolean getReadyToFly() {
        return readyToFly;
    }
    public void setReadyToFly(boolean readyToFly) {
        this.readyToFly = readyToFly;
    }

    private HashMap<Class<? extends Module>, Module> declarePossibleModules (List<Class<? extends Module>> possibleModules) {
        return new HashMap<Class<? extends Module>, Module>(){
            {
                for (Class<? extends Module> module : possibleModules) {
                    put(module, null);
                }
            }
        };
    }

    public void loadModule (Class<? extends Module> moduleType, Module module) {
        modules.replace(moduleType, module);
    }

    public void unloadModules (Class<? extends Module> moduleType) {
        modules.replace(moduleType, null);
    }

    public Module getModule (Class<? extends Module> moduleType){
        if (!modules.containsKey(moduleType))
            return null;
        return modules.get(moduleType);
    }

    public void flyTo(Coordinates destination) {
        Printer.print("Flying to: " + destination.getLongitude() + ", " + destination.getLatitude());
    }

    public void land() {
        Printer.print("Landing");
    }

    protected void repair() {
        setReadyToFly(true);
        setHoursOfFlightSinceLastRepair(0);
    }

    public void check() {
        if (getHoursOfFlightSinceLastRepair() > getHoursOfFlightBeforeHasToBeRepaired())
            setReadyToFly(false);
            repair();
    }
}
