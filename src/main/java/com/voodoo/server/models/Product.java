package com.voodoo.server.models;

public class Product {

    private String title;
    private String price;
    private String url;
    private String originalPrice;
    private String discount;
    private String vendor;
    private String productId;
    private boolean outOfStock;
    private double similarityIndex;


    private Long rate;
    private String redirectURL;
    private String toolTip;
    
    
    public Product(String title, String price, String url, String originalPrice, String discount, String vendor,String productId,double similarityIndex) {
        this.title = title;
        this.price = price;
        this.url = url;
        this.originalPrice = originalPrice;
        this.discount = discount;
        this.vendor = vendor;
        this.productId = productId;
        this.outOfStock = false;
        this.similarityIndex = similarityIndex;
    }

    public boolean isOutOfStock() {
        return outOfStock;
    }

    public void setOutOfStock(boolean outOfStock) {
        this.outOfStock = outOfStock;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public double getSimilarityIndex() {
        return similarityIndex;
    }

    public void setSimilarityIndex(double similarityIndex) {
        this.similarityIndex = similarityIndex;
    }

	public Long getRate() {
		return rate;
	}

	public void setRate(Long rate) {
		this.rate = rate;
	}

	public String getRedirectURL() {
		return redirectURL;
	}

	public void setRedirectURL(String redirectURL) {
		this.redirectURL = redirectURL;
	}

	public String getToolTip() {
		return toolTip;
	}

	public void setToolTip(String toolTip) {
		this.toolTip = toolTip;
	}
}
