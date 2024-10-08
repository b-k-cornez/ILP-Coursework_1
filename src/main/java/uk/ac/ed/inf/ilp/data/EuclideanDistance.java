package uk.ac.ed.inf.ilp.data;

public class EuclideanDistance {

    public static double calcDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
