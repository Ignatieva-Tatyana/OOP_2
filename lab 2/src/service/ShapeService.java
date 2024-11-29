package service;

import color.Color;
import shapes.Shape;

import java.util.List;
import java.util.Set;
public interface ShapeService {
    double getSquares(List<Shape> shapeList);
    double getMaxPerimeters(List<Shape> shapeList);
    Set<Color> getColors(List<Shape> shapeList);
}