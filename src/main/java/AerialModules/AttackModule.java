package AerialModules;

import Missions.Mission;

import java.util.HashMap;

public class AttackModule extends Module {
    private int numberOfMissiles;
    public enum MissileType {LIGHT_HAIL, HEAVY_HAIL}
    private MissileType missile;
    private final String moduleName;

    public AttackModule() {
        this.numberOfMissiles = 0;
        moduleName = "attack";
    }

    @Override
    public String getModuleType() {
        return moduleName;
    }

    public int getNumberOfMissiles() {
        return numberOfMissiles;
    }

    public void setNumberOfMissiles(int numberOfMissiles) {
        this.numberOfMissiles = numberOfMissiles;
    }

    public MissileType getMissileType() {
        return missile;
    }

    public void setMissileType(MissileType missile) {
        this.missile = missile;
    }
}
