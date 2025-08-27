

package com.mycompany.assignmentsupport;


public class Hero extends Character {
  private int powerLevel;
  private String ability;

    public Hero(String id, String name, int powerLevel, String ability) {
        super(id, name); 
        this.powerLevel = powerLevel;
        this.ability = ability;
    }

    public int getPowerLevel() 
    { return powerLevel; }
   
    public void setPowerLevel(int powerLevel) 
    { this.powerLevel = powerLevel; }

    public String getAbility() 
    { return ability; }
    
    public void setAbility(String ability) 
    { this.ability = ability; }

    @Override
    public String toString() {
        return "Hero ID: " + getId() +
               "\nName: " + getName() +
               "\nPower Level: " + powerLevel +
               "\nSpecial Ability: " + ability;
    }  
}
