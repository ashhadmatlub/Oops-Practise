package Practice;

public class Line {
    private float length;
    private Point startPoint;
    private Point endPoint;
    private int Line_num;

    // NULL CONS
    public Line() {
        this.length = 0.0f;
        this.startPoint = new Point(0, 0);
        this.endPoint = new Point(0, 0);
        this.Line_num = 0;
    }

    // PARA CONS
    public Line(float length, Point startPoint, Point endPoint, int line_num) {
        this.length = length;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.Line_num = line_num;
    }

    // COPY CONS
    public Line(Line line_3) {
        this.length = line_3.length;
        this.startPoint = new Point(line_3.startPoint);
        this.endPoint = new Point(line_3.endPoint);
        this.Line_num = line_3.Line_num;
    }

    // GETTERS AND SETTERS
    public void set_Line_Info(float length, Point startPoint, Point endPoint, int line_num) {
        this.length = length;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.Line_num = line_num;
    }

    public float getLength() {
        return length;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public int getLine_num() {
        return Line_num;
    }

    @Override
    public String toString() {
        return " The lenght of line " + Line_num + " is : " + length + ". Start point is " + startPoint
                + " and the End is " + endPoint;
    }
}
