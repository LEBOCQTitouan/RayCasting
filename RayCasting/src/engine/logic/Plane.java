package engine.logic;

import engine.logic.Vertex.Vertex3D;

public class Plane {
    private final Vertex3D v1, v2;

    public Plane(Vertex3D v1, Vertex3D v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public Vertex3D getV1() {
        return v1;
    }

    public Vertex3D getV2() {
        return v2;
    }
}
