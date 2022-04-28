public class Distance {
    public static void main(String[] args) {
        Point P = new Point(0, 5, 4, 5);

        System.out.println("Расстояние между двумя точками p1 и p2 равно " + distance(P));

    }
    public static double distance(Point P) {
        return Math.sqrt((P.x2 - P.x1) * (P.x2 - P.x1) + (P.y2 - P.y1) * (P.y2 - P.y1));
    }
}
