/**
 * CS152 Section 01, Project #3
 * TestPackages contains main routine
 * @author (Matthew Sullivan)
 * @version (Mar 20, 2017)
 */

import java.io.*;
import java.util.Scanner;

public class TestPackages
{
    public static void main(String[] args) throws IOException
    {
        Packet[] packetList = new Packet[100];

        Scanner fileScan;
        int i;
        double w;
        String d;
        int counter = 0;

        fileScan = new Scanner (new File("packetData.txt"));
        while (fileScan.hasNext()){
            i = fileScan.nextInt();
            w = fileScan.nextDouble();
            d = fileScan.next();
            packetList[counter] = new Packet(i, w, d);
            counter++;
        }
        fileScan.close();

        System.out.println("ALL PACKETS");
        System.out.println(Recursion.toString(packetList, counter));

        System.out.println("ALL HEAVY PACKETS");
        Recursion.displayHeavyPackets(packetList, counter);
        System.out.println("");

        System.out.println("ALL PACKETS with destination CT");
        Recursion.displayPacketsToDest(packetList, counter, "CT");
        System.out.println("");

        System.out.println("The number of packets with destination CT is "
                + Recursion.countPacketsToDest(packetList, counter, "CT")
                + ".\n");

        System.out.println("The packet object with max weight is: "
                + Recursion.maxWeightPacket(packetList, counter).toString());

        System.out.println("The max weight of all packets is "
                + Recursion.maxWeight(packetList, counter)
                + ".\n");
    }
}