package com.voodoo.server.services.impl;

import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.voodoo.server.services.RemoteService;

import java.util.HashMap;
import java.util.Map;

public class RemoteServiceImpl implements RemoteService {

    private static final Map<String,String> flipkartHeaders= new HashMap<String,String>(){{
        put("Fk-Affiliate-Id","krishnate7");
        put("Fk-Affiliate-Token","f31320b91aeb4d01b60be8d87d5d738a");
    }};

    @Override
    public String snapdealSearch(String searchString, int nrOfResults) throws UnirestException {
        return Unirest.get("http://www.snapdeal.com/search").queryString("keyword",searchString)
                .queryString("noOfResults",nrOfResults).asString().getBody();
    }

    @Override
    public JsonNode flipkartApiSearch(String searchString, int nrOfResults) throws UnirestException {
        return Unirest.get("https://affiliate-api.flipkart.net/affiliate/search/json").queryString("query",searchString)
                .queryString("resultCount",nrOfResults).headers(flipkartHeaders).asJson().getBody();
    }

    @Override
    public String flipkartSearch(String searchString) throws UnirestException {
        return Unirest.get("http://www.flipkart.com/search").queryString("q",searchString).asString().getBody();
    }

    @Override
    public String amazonSearch(String searchString) throws UnirestException {
        return Unirest.get("http://www.amazon.in/s").queryString("field-keywords",searchString).asString().getBody();
    }
}
