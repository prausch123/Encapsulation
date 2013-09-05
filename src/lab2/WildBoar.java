/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Peter
 */
public class WildBoar implements Monster{
    
    private String name;
    int health;
    int maxHealth;
    
    public WildBoar(String name) {
        this.name = name;
    }

    @Override
    public void setMonsterMaxHealth(int health) {
        if(maxHealth > 0) {
            this.maxHealth = health;
        }
    }

    @Override
    public int getMonsterMaxHealth() {
        return this.maxHealth;
    }
    
}
