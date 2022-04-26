public class Point {
    double x1 = 3.0, y1 = 5.0;
    double x2 = 7.0, y2 = 12.0;
    public double p1 = x2 - x1;
    public double p2 = y2 - y1;

    public double distance() {
        return Math.sqrt((this.p1 * this.p1) + (this.p2 * this.p2));
    }
}