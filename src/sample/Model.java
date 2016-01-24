package sample;

import java.awt.*;
import java.util.Arrays;
import java.util.Random;


public class Model {

    private Random random;
    private Polygon polygon;

    private double width;
    private double height;

    private int arrayLength;

    private int minX;
    private int maxX;
    private int minY;
    private int maxY;

    public double randomXCoordinates;
    public double randomYCoordinates;

//////////////////////////////////////////////////////////////

    public Model(int[] x, int[] y) {

        this.minX = Arrays.stream(x).min().getAsInt();
        this.maxX = Arrays.stream(x).max().getAsInt();
        this.minY = Arrays.stream(y).min().getAsInt();
        this.maxY = Arrays.stream(y).max().getAsInt();

        this.arrayLength = Math.min(x.length, y.length);

        this.polygon = new Polygon(x, x, arrayLength);

        this.width = polygon.getBounds().width;
        this.height = polygon.getBounds().height;

        this.random = new Random();

        this.randomXCoordinates = random.nextGaussian() * maxX;
        this.randomYCoordinates = random.nextGaussian() * maxY;
    }

//////////////////////////////////////////////////////////////

    public double rectangleArea() {
        return width * height;
    }

    public double pointsInShape() {

        int numberOfPoints = 1000000;
        double pointsInside = 30;

        for (int i = 0; i < numberOfPoints; i++) {

 /*           Random random = new Random();

            double randomXCoordinates = random.nextGaussian() * maxX;
            double randomYCoordinates = random.nextGaussian() * maxY;
*/
            if (polygon.contains(randomXCoordinates, randomYCoordinates)) {
                pointsInside++;
            }
        }

        return pointsInside;
    }



}
