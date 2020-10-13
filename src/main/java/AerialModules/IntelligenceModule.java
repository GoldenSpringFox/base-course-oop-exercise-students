package AerialModules;

import Entities.CameraType;

public class IntelligenceModule extends Module {
    private CameraType camera;
    private final String moduleName;

    public IntelligenceModule() {
        this.moduleName = "intelligence";
    }

    @Override
    public String getModuleType() {
        return moduleName;
    }

    public CameraType getCamera() {
        return camera;
    }

    public void setCamera(CameraType camera) {
        this.camera = camera;
    }
}
