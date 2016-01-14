package com.voodoo.server.handler;

import com.google.gson.Gson;
import com.voodoo.server.services.RemoteService;
import com.voodoo.server.services.SearchService;
import com.voodoo.server.services.impl.RemoteServiceImpl;
import com.voodoo.server.services.impl.SearchServiceImpl;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.Headers;

import java.util.Deque;
import java.util.Map;

public class JsonHandler implements HttpHandler {

    RemoteService remoteService;
    SearchService searchService;
    Gson gson;

    public JsonHandler(){
        remoteService = new RemoteServiceImpl();
        searchService = new SearchServiceImpl();
        gson = new Gson();
    }

    @Override
    public void handleRequest(HttpServerExchange exchange) throws Exception {
        if(exchange.isInIoThread()){
            exchange.dispatch(this);
            return;
        }

        exchange.getResponseHeaders().put(Headers.CONTENT_TYPE,"application/json");

        Map<String, Deque<String>> queryParams = exchange.getQueryParameters();

        if(!queryParams.containsKey("title") && !queryParams.containsKey("merchant")){
            exchange.getResponseSender().send("{\"status\":\"400\",\"error\":\"Requires title and merchant query parameters\"}");
        }
        String title = queryParams.get("title").getFirst();
        String merchant = queryParams.get("merchant").getFirst();

        exchange.getResponseSender().send(gson.toJson(searchService.queryMerchantWebsites(title,merchant)));
    }
}
