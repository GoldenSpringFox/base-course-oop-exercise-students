package AerialVehicles;

import AerialModules.AttackModule;
import AerialModules.BdaModule;
import AerialModules.IntelligenceModule;
import AerialModules.Module;
import Missions.BdaMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

import java.util.Arrays;
import java.util.HashMap;

public class Zik extends Hermes {
    public Zik() {
        super(Arrays.asList(BdaModule.class, IntelligenceModule.class));
    }
}