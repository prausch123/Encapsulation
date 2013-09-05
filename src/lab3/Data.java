/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Peter
 */
public class Data {
    private String[] partNums = new String[10];
    private String[] partDescs = new String[10];
    private double[] partPrices = new double[10];
    private int emptyRow = 0;
    
    public Data() {
        
    }
    
    public void addData(String num, String desc, double price) {
        partNums[emptyRow] = num;
        partDescs[emptyRow] = desc;
        partPrices[emptyRow] = price;
        emptyRow++;
    }
    
    public int numRows() {
        return emptyRow;
    }
    
    public String getPartNumber(int index) {
        return partNums[index];
    }
    
    public String getPartDescs(int index) {
        return partDescs[index];
    }
    
    public double getPartPrice(int index) {
        return partPrices[index];
    }

    public String[] getPartNums() {
        return partNums;
    }


    public String[] getPartDescs() {
        return partDescs;
    }

    public double[] getPartPrices() {
        return partPrices;
    }
   
    public void updatePartNum(int index, String num) {
        partNums[index] = num;
    }
    
    public void updatePartDescs(int index, String desc) {
        partDescs[index] = desc;
    }
    
    public void updatePartPrice(int index, double price) {
        partPrices[index] = price;
    }
}
