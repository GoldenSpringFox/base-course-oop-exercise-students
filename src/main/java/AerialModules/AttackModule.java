package AerialModules;

import AerialModules.Module;
import Entities.MissileType;
import Missions.Mission;

import java.util.HashMap;

public class AttackModule extends Module {
    private int numberOfMissiles;
    private MissileType missile;

    public AttackModule(int numberOfMissiles, MissileType missile) {
        this.numberOfMissiles = numberOfMissiles;
        this.missile = missile;
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
