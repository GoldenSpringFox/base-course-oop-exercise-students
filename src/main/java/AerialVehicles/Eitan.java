package AerialVehicles;

import AerialModules.AttackModule;
import AerialModules.BdaModule;
import AerialModules.IntelligenceModule;
import AerialModules.Module;
import Missions.AttackMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

import java.util.Arrays;
import java.util.HashMap;

public class Eitan extends Haron {
    public Eitan() {
        super(Arrays.asList(AttackModule.class, IntelligenceModule.class));
    }
}
