package edu.iastate.cs2280.hw1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Random;
import java.util.Scanner;

/**
 * NeighborhoodGrid refers to the households' layout for each simulation.
 * It is a square grid [size X size].
 *
 * @author
 */
public class NeighborhoodGrid {
    /**
     * Represents the size of the neighborhood grid.
     */
    private final int size;
    /**
     * A 2D grid representing a neighborhood where each cell is occupied by a household.
     * Each the rows and columns define the position of a household within the neighborhood.
     */
    public Household[][] grid;

    /**
     * Constructs a NeighborhoodGrid by reading household data from an input file.
     * Each square in the grid corresponds to a household defined by a specific letter
     * and (if applicable) a passion level.
     *
     * @param inputFileName the name of the file that contains the household data
     *                      used to populate the grid
     * @throws FileNotFoundException if the specified file does not exist or cannot be opened
     * @throws ParseException        if the data in the file is not in the expected format or
     *                               contains invalid household specifications
     */
    public NeighborhoodGrid(String inputFileName) throws FileNotFoundException, ParseException {
    }

    /**
     * Constructs a NeighborhoodGrid of a specified size.
     * If the provided size is greater than zero, it initializes an empty grid of the
     * specified dimensions. Otherwise, it throws an IllegalArgumentException.
     *
     * @param size the size of the grid (number of rows and columns). Must be greater than 0.
     * @throws IllegalArgumentException if the size is not greater than 0.
     */
    public NeighborhoodGrid(int size) {
        this.size = size;
        if (size > 0) {
            grid = new Household[size][size];
        } else {
            throw new IllegalArgumentException("Width must be > 0");
        }
    }

    /**
     * Retrieves the size of the neighborhood grid.
     *
     * @return the size of the grid, representing the number of rows and columns.
     */
    public int getSize() {
        return size;
    }


    /**
     * Randomly initializes the grid of the NeighborhoodGrid instance with various household types.
     * Each cell in the grid is assigned one of the household types (Basketball, Football, Baseball,
     * Soccer, Everything, Nothing, or Rugby) based on a random selection.
     */
    public void randomInit() {
    }

    /**
     * Output the Neighborhood grid.
     * For each square, output the letter associated with the household occupying the square.
     * If the household is interested in a sport, output the interest level in that sport followed
     * by a blank space. Otherwise, output two blank spaces after the letter. One of the blank space
     * is part of toString() implementation of the households
     *
     * @return String
     */
    public String toString() {
    }

    /**
     * Write the Neighborhood grid to a file.
     *
     * @param outputFileName
     * @throws FileNotFoundException
     */
    public void write(String outputFileName) throws FileNotFoundException {
    }
}
