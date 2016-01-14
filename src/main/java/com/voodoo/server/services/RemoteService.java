package com.voodoo.server.services;

import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.exceptions.UnirestException;

public interface RemoteService {

    public String snapdealSearch(String searchString, int nrOfResults) throws UnirestException;

    public JsonNode flipkartApiSearch(String searchString, int nrOfResults) throws UnirestException;

    public String flipkartSearch(String searchString) throws UnirestException;

    public String amazonSearch(String searchString) throws UnirestException;
}
