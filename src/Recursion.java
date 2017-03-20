/**
 * CS152 Section 01, Project #3
 * Recursion class acts recursively on array of Packet objects
 * @author (Matthew Sullivan)
 * @version (Mar 20, 2017)
 */

public class Recursion
{
    //-------------------------------------------------------------------------
    // Returns a String object that shows all Packets in the shipment
    //-------------------------------------------------------------------------
    public static String toString(Packet[] list, int n)
    {
        if ( n == 0 ){
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
            if ( list[n-1].isHeavy() ){
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
        if ( n == 1 ){
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
        if ( n == 1 ){
            return list[n-1].getWeight();
        } else {
            if ( maxWeightPacket(list, n-1).getWeight() > list[n-1].getWeight() ){
                return list[n-2].getWeight();
            } else {
                return list[n-1].getWeight();
            }
        }
    }

}