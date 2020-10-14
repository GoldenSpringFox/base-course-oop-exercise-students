package AerialModules;

        import Entities.CameraType;

public class BdaModule extends Module {
    private CameraType camera;

    public BdaModule(CameraType camera) {
        this.camera = camera;
    }

    public CameraType getCamera() {
        return camera;
    }

    public void setCamera(CameraType camera) {
        this.camera = camera;
    }
}

