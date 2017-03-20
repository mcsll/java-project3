/**
 * CS152 Section 01, Project #3
 * Recursion class acts recursively on array of Packet objects
 * @author (Matthew Sullivan)
 * @version (Mar 20, 2017)
 */

public class Recursion
{
    private Recursion(){

    }

    //-------------------------------------------------------------------------
    // Returns a String object that shows all Packets in the shipment
    //-------------------------------------------------------------------------
    public static String toString(Packet[] list, int n)
    {
        if ( n == 0 ) {
            return "";
        } else {
            return toString(list, n-1) + list[n-1].toString();
        }
    }

    //-------------------------------------------------------------------------
    // Prints all Packets in the shipment that are heavy
    //-------------------------------------------------------------------------
    public static void displayHeavyPackets(Packet[] list, int n)
    {
        if ( n > 0 ){
            displayHeavyPackets(list, n-1);
            if ( list[n-1].isHeavy()){
                System.out.print(list[n-1].toString());
            }
        }
    }

    //-------------------------------------------------------------------------
    // Prints all Packets to a specified destination
    //-------------------------------------------------------------------------
    public static void displayPacketsToDest(Packet[] list, int n, String dest)
    {
        if ( n > 0 ){
            displayPacketsToDest(list, n-1, dest);
            if ( list[n-1].getDestination().equals(dest) ){
                System.out.print(list[n-1].toString());
            }
        }
    }

    //-------------------------------------------------------------------------
    // Returns a count as int of all packages in array with destination
    //-------------------------------------------------------------------------
    public static int countPacketsToDest(Packet[] list, int n, String dest)
    {
        if ( n == 0 ){
            return 0;
        } else {
            if ( list[n-1].getDestination().equals(dest) ){
                return countPacketsToDest(list, n-1, dest) + 1;
            } else {
                return countPacketsToDest(list, n-1, dest);
            }
        }
    }

    //-------------------------------------------------------------------------
    // Returns Packet object with heaviest weight
    //-------------------------------------------------------------------------
    public static Packet maxWeightPacket(Packet[] list, int n)
    {
        if ( n == 1 ) {
            return list[n-1];
        } else {
            if ( maxWeightPacket(list, n-1).getWeight() > list[n-1].getWeight() ){
                return list[n-2];
            } else {
                return list[n-1];
            }
        }
    }

    //-------------------------------------------------------------------------
    // Returns weight of heaviest object in array
    //-------------------------------------------------------------------------
    public static double maxWeight(Packet[] list, int n)
    {
        if ( n == 1 ) {
            return list[n-1].getWeight();
        } else {
            if ( maxWeightPacket(list, n-1).getWeight() > list[n-1].getWeight() ){
                return list[n-2].getWeight();
            } else {
                return list[n-1].getWeight();
            }
        }
    }
/*



    //-------------------------------------------------------------------------
    // Returns the Packet object with the heaviest weight out of all those
    // in the shipment
    //-------------------------------------------------------------------------
    public Packet maxWeightPacket()
    {
        // Initialize variables used to perform comparison of weights
        int maxWeightIndex = -1;
        double currentMaxWeight = 0.0;

        // For loop steps through each Packet object by its index, comparing
        // the current Packet's weight to the largest weight encountered thus far.
        // If the current Pcaket's weight exceeds this, the currentMaxWeight is
        // set to this weight and the index of this Packet is stored in the
        // maxWeightIndex variable.
        for ( int i = 0; i < shipmentList.size(); i++ )
        {
            if ( shipmentList.get(i).getWeight() > currentMaxWeight )
            {
                maxWeightIndex = i;
                currentMaxWeight = shipmentList.get(i).getWeight();
            }
        }

        return shipmentList.get(maxWeightIndex);
    }


    //-------------------------------------------------------------------------
    // Computes and prints the average weight of all Packets in shipment
    //-------------------------------------------------------------------------
    public void displayAverageWeight()
    {
        double averageWeight;

        // Performs calculation of average weight using Packages instance
        // variable totalWeight and the size() method of the ArrayList class
        averageWeight = totalWeight / shipmentList.size();

        // Prints averageWeight variable as formatted String
        System.out.println(String.format("%.2f", averageWeight));
    }


    //-------------------------------------------------------------------------
    // Prints all Packets that are considered local
    //-------------------------------------------------------------------------
    public void displayLocalPackets()
    {
        System.out.println("\nLOCAL PACKETS");

        for ( Packet temp : shipmentList )
        {
            if ( temp.destinationLocation().equals("Local") )
                System.out.print(temp.toString());
        }
    }


    //-------------------------------------------------------------------------
    // Prints all Packets that are considered non-local
    //-------------------------------------------------------------------------
    public void displayNonLocalPackets()
    {
        System.out.println("\nNONLOCAL PACKETS");

        for ( Packet temp : shipmentList )
        {
            if ( temp.destinationLocation().equals("NonLocal") )
                System.out.print(temp.toString());
        }
    }

    */
}