package engine.logic.Vertex;

import engine.logic.Points.Point2D;

public class Vertex2D extends Vertex {
    private Point2D start, end;

    public Vertex2D(Point2D start, Point2D end) {
        this.start = start;
        this.end = end;
    }

    public Point2D getStart() {
        return start;
    }

    public void setStart(Point2D start) {
        this.start = start;
    }

    public Point2D getEnd() {
        return end;
    }

    public void setEnd(Point2D end) {
        this.end = end;
    }
}
