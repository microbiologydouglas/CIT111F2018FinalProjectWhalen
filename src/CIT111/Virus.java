/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT111;

/**
 * model of a virus inspired by my deep personal love from doing research with
 * and being an unwilling host for many viruses!
 * all source material from: https://viralzone.expasy.org/
 * attempted to store project at:
 * https://github.com/microbiologydouglas/CIT111F2018FinalProjectWhalen.git
 * @author micro
 */
public class Virus {
    
    public String Baltimore;
    public String Order;
    public String Family;
    public String Genus;
    public String Tropism;
    public boolean HumanOnly;
    public boolean Envelope;
    public int GenomeSize;
    
    
    // private member variables because we want to control
    // their values: outside classes access these through methods
    private boolean isVirusReplicating;
    private double speed;
    
    /*
    simulates starting this virus instance's replication cycle
    */
    public void startReplication() {
        isVirusReplicating = true;
        System.out.println("...swell...swell...boom!");
    }
    
    /*
    simulates this virus instance's replication cycle on hold
    */
    public void notReplicating() {
        isVirusReplicating = false;
        System.out.println("E-N-T-E-R-I-N-G L-A-T-E-N-T P-H-A-S-E");
    }
    
    /*
    Allows access to our private replication status boolean
    member variable called isVirusReplicating
    @return the status of the viral replication cycle: true means on,
    false means off
    */
    public boolean checkViralReplicationStatus() {
        return isVirusReplicating;
    }
    
    /*
    Allows access to our private speed variable and this 
    virus object's current speed of replication
    */
    public double getCurrentSpeed() {
        return speed;
    }
          
}
