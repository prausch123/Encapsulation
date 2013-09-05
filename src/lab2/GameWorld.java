/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Peter
 */
public class GameWorld {
    
    public GameWorld() {
        createMonsters();
    }
    
    private void createMonsters() {
        createBoars();
    }
    
    private void createBoars() {
        Monster boar1 = new WildBoar("Boar 1");
        boar1.setMonsterMaxHealth(100);
    }
}
