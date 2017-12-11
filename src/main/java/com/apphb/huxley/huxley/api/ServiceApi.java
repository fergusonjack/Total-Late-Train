package com.apphb.huxley.huxley.api;

import com.apphb.huxley.client.ApiException;
import com.apphb.huxley.client.ApiInvoker;

import com.apphb.huxley.huxley.model.ServiceDetails;
import com.sun.jersey.multipart.FormDataMultiPart;

import javax.ws.rs.core.MediaType;

import java.math.BigDecimal;
import java.io.File;
import java.util.*;

public class ServiceApi {
  String basePath = "https://huxley.apphb.com";
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
   *   Get Service Details
   * @param accessToken API key or token for authorization
   * @param id Id
   * @return ServiceDetails 
   */
  public ServiceDetails getServiceDetails (String accessToken, String id) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(accessToken == null || id == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/service/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (ServiceDetails) ApiInvoker.deserialize(response, "", ServiceDetails.class);
      }
      else {
    	  System.out.println("null");
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

