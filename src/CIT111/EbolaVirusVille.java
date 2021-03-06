/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT111;

/**
 *
 * @author micro
 */
public class EbolaVirusVille {
    public static void main(String[] args) {
        // create a new instance of a Virus object with the keyword: new
        Virus Ebola = new Virus();
        // set member variables on the instance of Virus stored in Herpes
        Ebola.Baltimore = "V";
        Ebola.Order = "Mononegavirales";
        Ebola.Family = "Filoviridae";
        Ebola.Genus = "Ebolavirus";
        Ebola.Tropism = "Anything it can liquefy";
        Ebola.HumanOnly = false;
        Ebola.Envelope = false;
        Ebola.GenomeSize = 19;
        
         // send our Car instance to a helper method to print its member variables
    displayVirusStats(Ebola);
    // test its methods
    Ebola.startReplication();
    Ebola.notReplicating();
    Ebola.getCurrentSpeed();
    
} // close main

    
    public static void displayVirusStats(Virus anyVirusObject) {
        System.out.println("***** STATS *****");
        System.out.println("Baltimore Class: " + anyVirusObject.Baltimore);
        System.out.println("Order: " + anyVirusObject.Order);
        System.out.println("Family: " + anyVirusObject.Family);
        System.out.println("Genus: " + anyVirusObject.Genus);
        System.out.println("Tropism: " + anyVirusObject.Tropism);
        System.out.println("Infects Humans Only? " + anyVirusObject.HumanOnly);
        System.out.println("Enveloped: " + anyVirusObject.Envelope);
        System.out.println("The viral genome size in kilobases is: " 
                + anyVirusObject.GenomeSize);
        
        
        System.out.println("Replication status: " + anyVirusObject.checkViralReplicationStatus());
        System.out.println("Rate of replication is: " + anyVirusObject.getCurrentSpeed());
        System.out.println("**********************");
    } // close displayVirusStats
  
    
} // close class EbolaVirusVille
