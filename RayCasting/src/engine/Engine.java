package engine;

import java.util.Random;

import engine.logic.Points.Point3D;
import engine.logic.Vector.Vector3D;
import linkEngineToGraphic.UpdateChecker;

public class Engine{

    private UpdateChecker upChecker;
    /** logic element */
    private Vector3D POVDirection;

    public Engine() {
        this(new Vector3D(new Point3D(0, 1, 0), new Point3D(1, 1, 0)));
    }

    public Engine(Vector3D pOVDirection) {
        POVDirection = pOVDirection;
    }

    @Override
    public String toString() {
        return "Engine [POVDirection=" + POVDirection + "]";
    }

    public UpdateChecker getUpChecker() {
        return upChecker;
    }

    public void setUpChecker(UpdateChecker upChecker) {
        this.upChecker = upChecker;
    }

    public Vector3D getPOVDirection() {
        return POVDirection;
    }

    public void setPOVDirection(Vector3D pOVDirection) {
        POVDirection = pOVDirection;
    }

}
