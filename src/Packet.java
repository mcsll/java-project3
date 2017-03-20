/**
 * CS152 Section 01, Project #3
 * Packet class describes individual packet object
 * @author (Matthew Sullivan)
 * @version (Mar 20, 2017)
 */

public class Packet
{
    private int idNumber;
    private double weight;
    private String destination;

    public Packet(int idNumber, double weight, String destination)
    {
        this.idNumber = idNumber;
        this.weight = weight;
        this.destination = destination;
    }


    //-------------------------------------------------------------------------
    // Returns a boolean, indicating whether the Packet is "heavy" or not.
    //-------------------------------------------------------------------------
    public boolean isHeavy()
    {
        return (weight > 10);
    }


    //-------------------------------------------------------------------------
    // Returns a String object that is a tab-separated combination of the
    // four parameters of the Packet, with a line break at the end.
    //-------------------------------------------------------------------------
    public String toString()
    {
        return idNumber + "\t" + weight + "\t" + destination + "\n";
    }


    //-------------------------------------------------------------------------
    // Returns the Packet's weight as a double
    //-------------------------------------------------------------------------
    public double getWeight()
    {
        return weight;
    }


    //-------------------------------------------------------------------------
    // Returns the Packet's destination as a String
    //-------------------------------------------------------------------------
    public String getDestination()
    {
        return destination;
    }
}