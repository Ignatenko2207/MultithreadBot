package org.itstep.service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


public class SearchStep extends Thread{

	private static final String BASE_URL = "https://www.zootovary.com";
	
	private static final String SEARCH_URL = "/advanced_search_result.php?inc_subcat=1&keywords=";
	
	private final String keyword;
	
	public SearchStep(String keyword) {
		this.keyword = keyword;
	}
	
	@Override
	public void run() {
		
		String encodedKeyWord = "";
		try {
			encodedKeyWord = URLEncoder.encode(keyword, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		Document content = null;
		if( !encodedKeyWord.isEmpty() ) {
			try {
				content = Jsoup.connect( getUrl(SEARCH_URL+encodedKeyWord, BASE_URL)).get();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		if (content != null) {
			
		}
	}

	private String getUrl(String url, String baseHost) {
		
		if( !(url.startsWith(baseHost) || url.startsWith("//"))) {
			return baseHost+url;
		}
		return url;
	}
	
}
