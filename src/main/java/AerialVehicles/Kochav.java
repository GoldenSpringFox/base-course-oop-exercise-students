package AerialVehicles;

import AerialModules.AttackModule;
import AerialModules.BdaModule;
import AerialModules.IntelligenceModule;
import AerialModules.Module;
import Missions.AttackMission;
import Missions.Mission;
import Missions.MissionTypeException;

import java.util.Arrays;
import java.util.HashMap;

public class Kochav extends Hermes {
    public Kochav() {
        super(Arrays.asList(AttackModule.class, BdaModule.class, IntelligenceModule.class));
    }
}
