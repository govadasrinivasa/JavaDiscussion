package com.general;

public record Point(int x, int y) {

    // Compact canonical constructor (for validation)
    public Point {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("Coordinates cannot be negative.");
        }
    }

    // Parameterized (non-canonical) constructor
    public Point(String coordinates) {
        this(Integer.parseInt(coordinates.split(",")[0]), Integer.parseInt(coordinates.split(",")[1]));
    }

    // Another parameterized (non-canonical) constructor
    public Point(int value) {
        this(value, value); // Delegates to the canonical constructor
    }
    
 // Another parameterized (non-canonical) constructor
    public Point(String coordinates, int value) {
        this(value, value); // Delegates to the canonical constructor
    }
}
