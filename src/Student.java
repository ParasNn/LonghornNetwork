import java.util.*;

/**
 * Abstract base class representing a generic student.
 * Contains common attributes and the abstract logic for calculating connection
 * weights.
 */
public abstract class Student {
    protected String name;
    protected int age;
    protected String gender;
    protected int year;
    protected String major;
    protected double gpa;
    protected List<String> roommatePreferences;
    protected List<String> previousInternships;

    /**
     * Calculates the weight of the connection between this student and another.
     * Based on shared attributes such as major, internships, and roommate status.
     *
     * @param other The other student to compare against.
     * @return An integer representing the connection strength (weight).
     */
    public abstract int calculateConnectionStrength(Student other);
}