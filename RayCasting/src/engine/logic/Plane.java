package engine.logic;

import engine.logic.Points.Point3D;
import engine.logic.Vector.Vector3D;

public class Plane {
    private final Vector3D v1, v2;

    public Plane(Vector3D v1, Vector3D v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public Vector3D getV1() {
        return v1;
    }

    public Vector3D getV2() {
        return v2;
    }

    public Point3D intersect(Vector3D v) throws Exception {
        return null;
    }
}
