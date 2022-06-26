package warmup;

import java.util.Set;
import java.util.HashSet;

public class Quadratic {

    /**
     * Find the integer roots of a quadratic equation, ax^2 + bx + c = 0.
     * @param a coefficient of x^2
     * @param b coefficient of x
     * @param c constant term.  Requires that a, b, and c are not ALL zero.
     * @return all integers x such that ax^2 + bx + c = 0.
     */
    public static Set<Integer> roots(int a, int b, int c) {
        Set<Integer> rootSet = new HashSet<>();
        long discriminant = (long) b * b - 4L * a * c;
        if (a == 0) {
            // checks for linear equation separately
            if (-c/b == (double)-c/b) rootSet.add(-c/b);
        } else if (discriminant >= 0) {
            double solution1 = (-b + Math.sqrt(discriminant))/(2 * a);
            double solution2 = (-b - Math.sqrt(discriminant))/(2 * a);
            if (solution1 == (int)solution1) rootSet.add((int)solution1);
            // checks for second solution if there is one
            if (discriminant > 0 && solution2 == (int)solution2) rootSet.add((int)solution2);
        }
        return rootSet;
    }

    
    /**
     * Main function of program.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        System.out.println("For the equation x^2 - 4x + 3 = 0, the possible solutions are:");
        Set<Integer> result = roots(1, -4, 3);
        System.out.println(result);
    }
    /* Copyright (c) 2016 MIT 6.005 course staff, all rights reserved.
     * Redistribution of original or derived work requires explicit permission.
     * Don't post any of this code on the web or to a public Github repository.
     */
}
