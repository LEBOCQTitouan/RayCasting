package engine;

import engine.logic.Points.Point3D;
import engine.logic.Vertex.Vertex3D;
import linkEngineToGraphic.UpdateChecker;

public class Engine{

    private UpdateChecker upChecker;
    /** logic element */
    private Vertex3D POVDirection;

    public Engine() {
        this(new Vertex3D(new Point3D(0, 1, 0), new Point3D(1, 1, 0)));
    }

    public Engine(Vertex3D pOVDirection) {
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

    public Vertex3D getPOVDirection() {
        return POVDirection;
    }

    public void setPOVDirection(Vertex3D pOVDirection) {
        POVDirection = pOVDirection;
    }

}
