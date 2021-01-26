package engine.logic.Vertex;

import engine.logic.Points.Point3D;

public class Vertex3D extends Vertex2D {
    private Point3D start, end;

    public Vertex3D(Point3D start, Point3D end) {
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
        return "Vertex3D [end=" + end + ", start=" + start + "]";
    }
}