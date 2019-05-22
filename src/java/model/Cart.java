/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Sanu Vithanage
 */
public class Cart {

    private String itemName;
    private double itemPrice;
    private int quntity;

    public Cart() {
    }

    public Cart(String itemname, double itemPrice, int quntity) {
        this.itemName = itemname;
        this.itemPrice = itemPrice;
        this.quntity = quntity;
    }

    /**
     * @return the itemname
     */
    public String getItemname() {
        return itemName;
    }

    /**
     * @param itemname the itemname to set
     */
    public void setItemname(String itemname) {
        this.itemName = itemname;
    }

    /**
     * @return the itemPrice
     */
    public double getItemPrice() {
        return itemPrice;
    }

    /**
     * @param itemPrice the itemPrice to set
     */
    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    /**
     * @return the quntity
     */
    public int getQuntity() {
        return quntity;
    }

    /**
     * @param quntity the quntity to set
     */
    public void setQuntity(int quntity) {
        this.quntity = quntity;
    }

}
