/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Peter
 */
public class GameCharacter {
    private String charName;
    private String charClass;
    private char charGender;
    private int charLevel;
    
    public GameCharacter() {
        this.charLevel = 1;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getCharClass() {
        return charClass;
    }

    public void setCharClass(String charClass) {
        this.charClass = charClass;
    }

    public char getCharGender() {
        return charGender;
    }

    public void setCharGender(char charGender) {
        this.charGender = charGender;
    }

    public int getCharLevel() {
        return charLevel;
    }

    public void setCharLevel(int charLevel) {
        this.charLevel = charLevel;
    }
    
    public void charLevelUp() {
        this.charLevel++;
    }
}
