/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.Truck;

import FoodBankSystem.Staff.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author Cuishaowen
 */
public class TruckList {
    private ArrayList<Truck> trucks;
    
    public TruckList(){
        trucks = new ArrayList<Truck>();
    }

    public ArrayList<Truck> getTrucks() {
        return trucks;
    }
    
    public Truck addTruck(Employee e){
        Truck t = new Truck(e);
        trucks.add(t);
        return t;
    }
    
    public void removeTruck(Truck t){
        trucks.remove(t);
    }
}
