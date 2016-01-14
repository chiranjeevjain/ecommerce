/**
 * 
 */
package com.smart.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.smart.service.SearchProductService;
import com.smart.utils.CollectionComparator;
import com.voodoo.server.models.Product;
import com.voodoo.server.services.impl.SearchServiceImpl;

/**
 * @author IB1946
 * 
 */
@Component(value = "searchBean")
@Scope("session")
public class SearchProductServiceImpl implements SearchProductService {

	private String searchKey;

	private List<Product> tableResults;

	@SuppressWarnings("unchecked")
	@Override
	public String searchProducts() {
		if (StringUtils.isBlank(searchKey)) {
			// throw an error message
			showMessage();
		}
		SearchServiceImpl searchImpl = new SearchServiceImpl();

		// Get Flipkart Results
		ArrayList<Product> flipkartProducts = searchImpl.queryMerchantWebsites(
				searchKey, "flipkart");

		// Get Amazon Results
		ArrayList<Product> amazonProducts = searchImpl.queryMerchantWebsites(
				searchKey, "amazon");

		if (CollectionUtils.isEmpty(flipkartProducts)
				&& CollectionUtils.isEmpty(amazonProducts)) {
			// throw an error message
			showMessage();
		}

		for (Product prod : flipkartProducts) {
			prod.setPrice(prod.getPrice().replace("Rs.", ""));
		}

		for (Product prod : amazonProducts) {
			prod.setPrice(prod.getPrice().replace(".00", ""));
		}

		tableResults = new ArrayList<Product>();
		tableResults.addAll(flipkartProducts);
		tableResults.addAll(amazonProducts);

		for (Product prod : tableResults) {
			prod.setRate(new Long((prod.getPrice().replace(",", "")).trim()));
			prod.setRedirectURL("<a href=\"" + prod.getUrl() +  "\" target=\"_blank\"> Goto Store </a>");
			if(StringUtils.isNotBlank(prod.getTitle())) {
				prod.setToolTip(prod.getTitle());
				if(prod.getTitle().length() > 50) {
					prod.setTitle(prod.getTitle().substring(0, 50) + "....");
				} 
			}
		}
		
		Collections.sort(tableResults, new CollectionComparator("rate",
				CollectionComparator.ASC));
		return "";
	}

	public void showMessage() {

		FacesContext.getCurrentInstance().addMessage(
				null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info",
						"Your search '" + searchKey
								+ "' did not match any products."));
	}

	public String getSearchKey() {
		return searchKey;
	}

	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}

	public List<Product> getTableResults() {
		return tableResults;
	}

	public void setTableResults(List<Product> tableResults) {
		this.tableResults = tableResults;
	}
}
