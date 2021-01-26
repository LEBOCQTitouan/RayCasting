package engine.logic.Points;

public class Point3D extends Point2D {
    protected final double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "Point3D [x=" + x + ", y=" + y + ", z=" + z + "]";
    }
}
