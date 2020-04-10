package com.nordea.tdmchatbotapi.model;

import java.util.ArrayList;
import java.util.List;

public class QueryResult {

	private String response;
	private List<String> subQuestions = new ArrayList<>();
	private boolean intermediateQuery;

	public String getResponse() {
		return response;
	}

	public List<String> getSubQuestions() {
		return subQuestions;
	}

	public void setSubQuestions(List<String> subQuestions) {
		this.subQuestions = subQuestions;
	}

	public boolean isIntermediateQuery() {
		return intermediateQuery;
	}

	public void setIntermediateQuery(boolean intermediateQuery) {
		this.intermediateQuery = intermediateQuery;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	
}
