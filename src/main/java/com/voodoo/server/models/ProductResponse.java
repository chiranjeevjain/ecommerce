package com.voodoo.server.models;

import java.util.ArrayList;

public class ProductResponse {

    ArrayList<Product> snapdeal;
    ArrayList<Product> amazon;
    ArrayList<Product> flipkart;

    public ProductResponse() {
        snapdeal = new ArrayList<>();
        amazon = new ArrayList<>();
        flipkart = new ArrayList<>();
    }

    public ArrayList<Product> getSnapdeal() {
        return snapdeal;
    }

    public void setSnapdeal(ArrayList<Product> snapdeal) {
        this.snapdeal = snapdeal;
    }

    public ArrayList<Product> getAmazon() {
        return amazon;
    }

    public void setAmazon(ArrayList<Product> amazon) {
        this.amazon = amazon;
    }

    public ArrayList<Product> getFlipkart() {
        return flipkart;
    }

    public void setFlipkart(ArrayList<Product> flipkart) {
        this.flipkart = flipkart;
    }
}
