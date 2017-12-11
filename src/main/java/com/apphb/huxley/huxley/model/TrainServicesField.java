package com.apphb.huxley.huxley.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;
public class TrainServicesField {
  /* Adhocalertsfield */
  private String adhocAlertsField = null;
  /* Currentdestinationsfield */
  private String currentDestinationsField = null;
  /* Currentoriginsfield */
  private String currentOriginsField = null;
  /* Destinationfield */
  private List<DestinationField> destinationField = new ArrayList<DestinationField>();
  /* Etafield */
  private String etaField = null;
  /* Etdfield */
  private String etdField = null;
  /* Iscircularroutefield */
  private Boolean isCircularRouteField = null;
  /* Operatorcodefield */
  private String operatorCodeField = null;
  /* Operatorfield */
  private String operatorField = null;
  /* Originfield */
  private List<OriginField> originField = new ArrayList<OriginField>();
  /* Platformfield */
  private String platformField = null;
  /* Propertychanged */
  private String _PropertyChanged = null;
  /* Serviceidfield */
  private String serviceIDField = null;
  /* Stafield */
  private String staField = null;
  /* Stdfield */
  private String stdField = null;
  
  private String rsidField = null;
  
  private String delayReasonField = null;
  
  @JsonProperty("adhocAlertsField")
  public String getAdhocAlertsField() {
    return adhocAlertsField;
  }
  public void setAdhocAlertsField(String adhocAlertsField) {
    this.adhocAlertsField = adhocAlertsField;
  }

  @JsonProperty("currentDestinations")
  public String getCurrentDestinationsField() {
    return currentDestinationsField;
  }
  public void setCurrentDestinationsField(String currentDestinationsField) {
    this.currentDestinationsField = currentDestinationsField;
  }

  @JsonProperty("currentOrigins")
  public String getCurrentOriginsField() {
    return currentOriginsField;
  }
  public void setCurrentOriginsField(String currentOriginsField) {
    this.currentOriginsField = currentOriginsField;
  }

  @JsonProperty("destination")
  public List<DestinationField> getDestinationField() {
    return destinationField;
  }
  public void setDestinationField(List<DestinationField> destinationField) {
    this.destinationField = destinationField;
  }

  @JsonProperty("eta")
  public String getEtaField() {
    return etaField;
  }
  public void setEtaField(String etaField) {
    this.etaField = etaField;
  }

  @JsonProperty("etd")
  public String getEtdField() {
    return etdField;
  }
  public void setEtdField(String etdField) {
    this.etdField = etdField;
  }

  @JsonProperty("isCircularRoute")
  public Boolean getIsCircularRouteField() {
    return isCircularRouteField;
  }
  public void setIsCircularRouteField(Boolean isCircularRouteField) {
    this.isCircularRouteField = isCircularRouteField;
  }

  @JsonProperty("operatorCode")
  public String getOperatorCodeField() {
    return operatorCodeField;
  }
  public void setOperatorCodeField(String operatorCodeField) {
    this.operatorCodeField = operatorCodeField;
  }

  @JsonProperty("operator")
  public String getOperatorField() {
    return operatorField;
  }
  public void setOperatorField(String operatorField) {
    this.operatorField = operatorField;
  }

  @JsonProperty("origin")
  public List<OriginField> getOriginField() {
    return originField;
  }
  public void setOriginField(List<OriginField> originField) {
    this.originField = originField;
  }

  @JsonProperty("platform")
  public String getPlatformField() {
    return platformField;
  }
  public void setPlatformField(String platformField) {
    this.platformField = platformField;
  }

  @JsonProperty("_PropertyChanged")
  public String getPropertyChanged() {
    return _PropertyChanged;
  }
  public void setPropertyChanged(String _PropertyChanged) {
    this._PropertyChanged = _PropertyChanged;
  }

  @JsonProperty("rsid")
  public String getrsidField() {
    return rsidField;
  }
  public void setrsidField(String rsidField) {
    this.rsidField = rsidField;
  }
  
  @JsonProperty("sta")
  public String getStaField() {
    return staField;
  }
  public void setStaField(String staField) {
    this.staField = staField;
  }

  @JsonProperty("std")
  public String getStdField() {
    return stdField;
  }
  public void setStdField(String stdField) {
    this.stdField = stdField;
  }
  
  @JsonProperty("delayReason")
  public String getDelayRField() {
    return delayReasonField;
  }
  public void setdelayRField(String delayField) {
    this.delayReasonField = delayField;
  }


  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrainServicesField {\n");
    sb.append("  currentDestinationsField: ").append(currentDestinationsField).append("\n");
    sb.append("  currentOriginsField: ").append(currentOriginsField).append("\n");
    sb.append("  destinationField: ").append(destinationField).append("\n");
    sb.append("  operator: ").append(operatorField).append("\n");
    sb.append("  id: ").append(rsidField).append("\n");
    sb.append("  delayR: ").append(delayReasonField).append("\n");
    sb.append("  etaField: ").append(etaField).append("\n");
    sb.append("  etdField: ").append(etdField).append("\n");
    sb.append("  staField: ").append(staField).append("\n");
    sb.append("  stdField: ").append(stdField).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

