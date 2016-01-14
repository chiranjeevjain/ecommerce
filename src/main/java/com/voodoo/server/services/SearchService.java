package com.voodoo.server.services;

import com.mashape.unirest.http.exceptions.UnirestException;
import com.voodoo.server.models.Product;

import java.util.ArrayList;

public interface SearchService {

    public ArrayList<Product> queryMerchantWebsites(String searchString, String merchant);

    public ArrayList<Product> searchSnapdeal(String searchString) throws UnirestException;

    public ArrayList<Product> searchFlipkartWebSite(String searchString) throws UnirestException;

    public ArrayList<Product> searchAmazon(String searchString) throws UnirestException;
}
