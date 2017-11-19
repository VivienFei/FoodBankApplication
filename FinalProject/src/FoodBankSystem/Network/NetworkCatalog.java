/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.Network;

import java.util.ArrayList;

/**
 *
 * @author Cuishaowen
 */
public class NetworkCatalog {
    private ArrayList<Network> networks;

    public NetworkCatalog() {
        networks = new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworks() {
        return networks;
    }
    
    public Network addNetwork(String name){
        Network n = new Network(name);
        networks.add(n);
        return n;
    }
    
    public void removeNetwork(Network n){
        networks.remove(n);
    }
}
