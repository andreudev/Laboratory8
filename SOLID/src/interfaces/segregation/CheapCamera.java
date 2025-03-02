package interfaces.segregation;

import java.nio.file.NotLinkException;

public class CheapCamera implements ICamera {

    @Override
    public void zoomIn() {
        System.out.println("Zoom in");
    }

    @Override
    public void takePhoto() {
        System.out.println("Take a photo");
    }

    @Override
    public void recorVideo() {
        System.out.println("Record video");
    }
}
