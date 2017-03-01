/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class HumanInfantryFactory {

    public InfantryUnit crerateUnit(int techLevel) {
        InfantryUnit unit;
        switch (techLevel) {

            case 1:
                unit = new RockHauler();
                unit.setName("rock hauler");

                break;

            case 2:
                unit = new SpearThrower();
                unit.setName("Spear Thrower");

                break;
                
            case 3:
                unit = new Archer();
                unit.setName("Archer");

            case 4: 
                unit = new CrossbowMan();
                unit.setName("Crossbow");
                
            case 5:
                unit = new Musketeer();
                unit.setName("Musketeer");
            default:
                unit = new RockHauler();
                break;

        }

        return unit;
    }

}
