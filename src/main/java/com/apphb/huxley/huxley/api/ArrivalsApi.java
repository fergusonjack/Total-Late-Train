package com.apphb.huxley.huxley.api;

import com.apphb.huxley.client.ApiException;
import com.apphb.huxley.client.ApiInvoker;

import com.apphb.huxley.huxley.model.ArrivalsBoard;
import com.sun.jersey.multipart.FormDataMultiPart;

import javax.ws.rs.core.MediaType;

import java.math.BigDecimal;
import java.io.File;
import java.util.*;

public class ArrivalsApi {
	
	//switched from azure a bit slower but this isnt really an issue as its now free!!
	String basePath = "https://jack9283.apphb.com";
	ApiInvoker apiInvoker = ApiInvoker.getInstance();

	public ApiInvoker getInvoker() {
		return apiInvoker;
	}

	public void setBasePath(String basePath) {
		this.basePath = basePath;
	}

	public String getBasePath() {
		return basePath;
	}

	/**
   *   Get Arrivals Board
   * @param accessToken API key or token for authorization
   * @param id CRS
   * @return ArrivalsBoard 
   */
  public ArrivalsBoard getArrivalsBoard (String accessToken, String id) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(accessToken == null || id == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/arrivals/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(accessToken)))
      queryParams.put("accessToken", String.valueOf(accessToken));
    String[] contentTypes = {
      "application/x-www-form-urlencoded"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
    	System.out.println(response);
        return (ArrivalsBoard) ApiInvoker.deserialize(response, "", ArrivalsBoard.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
}
