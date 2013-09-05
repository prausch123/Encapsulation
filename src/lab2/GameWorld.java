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
        
        GameCharacter p1 = new GameCharacter();
        p1.setCharName("Peter");
        p1.setCharClass("Warrior");
        p1.setCharGender('M');
    }
    
    private void createMonsters() {
        createBoars();
    }
    
    private void createBoars() {
        Monster boar1 = new WildBoar("Boar 1");
        boar1.setMonsterMaxHealth(100);
    }
}
