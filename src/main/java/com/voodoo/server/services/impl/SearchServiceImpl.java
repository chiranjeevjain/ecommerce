package com.voodoo.server.services.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.voodoo.server.algos.TitleSimilarity;
import com.voodoo.server.models.Product;
import com.voodoo.server.services.RemoteService;
import com.voodoo.server.services.SearchService;


public class SearchServiceImpl implements SearchService {

	RemoteService remoteService;

	public SearchServiceImpl() {
		remoteService = new RemoteServiceImpl();
	}

	@Override
	public ArrayList<Product> queryMerchantWebsites(String searchString,
			String merchant) {
		try {
			switch (merchant.toLowerCase()) {
			case "flipkart":
				return searchFlipkartWebSite(searchString);
			case "snapdeal":
				return searchSnapdeal(searchString);
			case "amazon":
				return searchAmazon(searchString);
			default:
				return null;
			}
		} catch (UnirestException e) {
			e.printStackTrace();
		}
		return null;
	}

	public ArrayList<Product> searchSnapdeal(String searchString)
			throws UnirestException {
		ArrayList<Product> productsModel = new ArrayList<>();
		Document document = Jsoup.parse(remoteService.snapdealSearch(
				searchString, 20));
		Elements products = document
				.select("div.product_grid_row > div.product_grid_cont");
		// products.forEach(product -> {
		for (Element product : products) {
			String title = product.select("div.product-title").text();
			String price = product.select("#price").text();
			String url = product.select("div.product-title > a").attr("href");
			String originalPrice = product.select("#disc > strike").text();
			String discount = product.select("#disc > s").text();
			String vendor = "snapdeal";
			String productId = url.substring(url.lastIndexOf("/") + 1);
			productsModel.add(new Product(title, price, url, originalPrice,
					discount, vendor, productId, TitleSimilarity
							.similarityIndex(title.toLowerCase(),
									searchString.toLowerCase())));
		}
		;
		return sortProducts(productsModel);
	}

	public JsonNode searchFlipkart(String searchString) throws UnirestException {
		return remoteService.flipkartApiSearch(searchString, 5);
	}

	public ArrayList<Product> searchFlipkartWebSite(String searchString)
			throws UnirestException {
		ArrayList<Product> productsModel = new ArrayList<>();
		Document document = Jsoup.parse(remoteService
				.flipkartSearch(searchString));
		Elements products = document
				.select("#products > div.old-grid > div.gd-row > div.gd-col");
		// products.forEach(product -> {
		for (Element product : products) {
			String title = product.select("div.pu-title > a").attr("title");
			String price = product.select("div.pu-final > span").text();
			String url = "http://www.flipkart.com"
					+ product.select("div.pu-title > a").attr("href");
			String originalPrice = product.select(
					"div.pu-discount > span.pu-old").text();
			String discount = product.select(
					"div.pu-discount > span.pu-off-per").text();
			String productId = product.select("div.product-unit").attr(
					"data-pid");
			String vendor = "flipkart";
			String outOfStock = product.select("a.pu-status").text()
					.replaceAll(" ", "");
			Product prod = new Product(title, price, url, originalPrice,
					discount, vendor, productId,
					TitleSimilarity.similarityIndex(title.toLowerCase(),
							searchString.toLowerCase()));
			if (outOfStock != null && outOfStock.length() > 0)
				prod.setOutOfStock(true);
			productsModel.add(prod);
		}
		;
		return sortProducts(productsModel);
	}

	public ArrayList<Product> searchAmazon(String searchString)
			throws UnirestException {
		ArrayList<Product> productsModel = new ArrayList<>();
		Document document = Jsoup.parse(remoteService
				.amazonSearch(searchString));
		Elements products = document.select("#s-results-list-atf > li");
		// products.forEach(product -> {
		for (Element product : products) {
			String title = product.select("a.a-link-normal").attr("title");
			String url = product.select("a.a-link-normal").attr("href");
			String price = product.select("a.a-link-normal > span.a-size-base")
					.text().replaceAll("\\u00a0", "");
			String originalPrice = product.select("span.a-text-strike").text()
					.replaceAll("\\u00a0", "");
			String discount = product.select("div.a-row > span.a-color-price")
					.text().replaceAll("\\u00a0", "");
			String vendor = "amazon";
			String productId = url.substring(url.indexOf("dp/") + 3,
					url.indexOf("/", url.indexOf("dp/") + 3));
			productsModel.add(new Product(title, price, url, originalPrice,
					discount, vendor, productId, TitleSimilarity
							.similarityIndex(title.toLowerCase(),
									searchString.toLowerCase())));
		}
		;
		return sortProducts(productsModel);
	}

	private ArrayList<Product> sortProducts(ArrayList<Product> products) {
		Collections.sort(products, new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				return (int) ((o2.getSimilarityIndex() - o1
						.getSimilarityIndex()) * 10);
			}
		});
		return products;
	}
}
