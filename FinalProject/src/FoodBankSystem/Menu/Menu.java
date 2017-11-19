/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBankSystem.Menu;

/**
 *
 * @author Cuishaowen
 */
public class Menu {
    private int id;
    private static int menuID;
    private MenuItemList menuItemList;
    private String type;
    private String healthCondition;
    private String gender;
    private String state;
    private String season;
    private String ageGroup;
    private String avgIncome;
    
    public enum AgeGroup
    {
        Youth1("0-3"), Youth2("3-7"), Youth3("7-12"), Youth4("12-18"),
        Adult1("18-25"), Adult2("25-35"), Adult3("35-45"),
        Old1("45-60"),Old2("60-70"),Old3("70-90");
        
        
        private String value;
        
        private AgeGroup(String value) 
        {
            this.value = value;
        }
        public String getValue() 
        {
            return value;
        }    
    }
    
    
    public enum AvgIncome
    {
        Poverty1("<5000"), Poverty2("5000-8000"), Poverty3("8000-10000"), Poverty4("10000-13000");        
        
        private String value;
        
        private AvgIncome(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }            
    }

    public Menu() {
        id = menuID;
        menuID++;
        menuItemList = new MenuItemList();
    }

    public int getId() {
        return id;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHealthCondition() {
        return healthCondition;
    }

    public void setHealthCondition(String healthCondition) {
        this.healthCondition = healthCondition;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public String getAvgIncome() {
        return avgIncome;
    }

    public void setAvgIncome(String avgIncome) {
        this.avgIncome = avgIncome;
    }

    public MenuItemList getMenuItemList() {
        return menuItemList;
    }

    public void setMenuItemList(MenuItemList menuItemList) {
        this.menuItemList = menuItemList;
    }
    
    @Override
    public String toString()
    {
        return String.valueOf(id);
    }
}
