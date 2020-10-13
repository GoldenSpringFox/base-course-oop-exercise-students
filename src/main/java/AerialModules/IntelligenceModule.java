package AerialModules;

import Entities.CameraType;

public class IntelligenceModule extends Module {
    private CameraType camera;

    public IntelligenceModule(CameraType camera) {
        this.camera = camera;
    }

    public CameraType getCamera() {
        return camera;
    }

    public void setCamera(CameraType camera) {
        this.camera = camera;
    }
}
