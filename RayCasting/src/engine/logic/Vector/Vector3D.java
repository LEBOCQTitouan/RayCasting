package engine.logic.Vector;

import engine.logic.Points.Point3D;

public class Vector3D extends Vector2D {
    private Point3D start, end;

    public Vector3D(Point3D start, Point3D end) {
        super(start, end);
    }

    public Point3D getStart() {
        return start;
    }

    public void setStart(Point3D start) {
        this.start = start;
    }

    public Point3D getEnd() {
        return end;
    }

    public void setEnd(Point3D end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Vector3D [end=" + end + ", start=" + start + "]";
    }
    
    public Double[][] toArray() {
        return new Double[][] {new Double[] {start.getX(), start.getY(), start.getZ()}, new Double[] {end.getX(), end.getY(), end.getZ()}};
    }
}