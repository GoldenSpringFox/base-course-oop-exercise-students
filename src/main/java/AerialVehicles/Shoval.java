package AerialVehicles;

import AerialModules.AttackModule;
import AerialModules.BdaModule;
import AerialModules.IntelligenceModule;
import AerialModules.Module;
import Missions.BdaMission;
import Missions.Mission;
import Missions.MissionTypeException;

import java.util.Arrays;
import java.util.HashMap;

public class Shoval extends Haron {
    public Shoval() {
        super(Arrays.asList(AttackModule.class, BdaModule.class, IntelligenceModule.class));
    }
}

