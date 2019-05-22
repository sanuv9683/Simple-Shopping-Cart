/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Collections;
import model.Cart;

/**
 *
 * @author Sanu Vithanage
 */
public class CartController {

    private ArrayList<Cart> cart;

    public CartController(ArrayList<Cart> cart) {
        this.cart = cart;
    }

    public boolean checkIf(String cartItem) {
        for (Cart cart1 : cart) {
            if (cart1.getItemname().equals(cartItem)) {
                return true;
            }

        }
        return false;
    }

    public boolean addToCart(String itemName, double itemPrice, int itemQun, boolean update, boolean delete) {
        if (checkIf(itemName)) {
            if (delete) {
                removeItemFromCart(itemName, itemQun);
            }
            if (update) {
                int con = getCartItem(itemName).getQuntity();
                con++;
                getCartItem(itemName).setQuntity(con);

            } else {
                getCartItem(itemName).setQuntity(itemQun);
            }

        } else {
            Cart aa = new Cart(itemName, itemPrice, itemQun);
            cart.add(aa);
        }
        return true;
    }

    public boolean removeItemFromCart(String itemName, int itemQuntity) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).getItemname().equals(itemName)) {
                cart.remove(i);
            }
        }
        return true;
    }

    public boolean reduseByOne(String itemName, int itemQuntity) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).getItemname().equals(itemName)) {
                cart.get(i).setQuntity(itemQuntity);
                return true;
            }

        }
        return false;
    }

    public Cart getCartItem(String itemName) {
        for (Cart cart1 : cart) {
            if (cart1.getItemname().equals(itemName)) {
                return cart1;
            }
        }

        return null;
    }
}
