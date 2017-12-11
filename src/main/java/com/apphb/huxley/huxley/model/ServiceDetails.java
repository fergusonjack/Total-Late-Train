package com.apphb.huxley.huxley.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;
import java.util.Date;
public class ServiceDetails {
  /* Adhocalertsfield */
  private String adhocAlertsField = null;
  /* Atafield */
  private String ataField = null;
  /* Atdfield */
  private String atdField = null;
  /* Crsfield */
  private String crsField = null;
  /* Disruptionreasonfield */
  private String disruptionReasonField = null;
  /* Etafield */
  private String etaField = null;
  /* Etdfield */
  private String etdField = null;
  /* Generatedatfield */
  private Date generatedAtField = null;
  /* Iscancelledfield */
  private Boolean isCancelledField = null;
  /* Locationnamefield */
  private String locationNameField = null;
  /* Operatorcodefield */
  private String operatorCodeField = null;
  /* Operatorfield */
  private String operatorField = null;
  /* Overduemessagefield */
  private String overdueMessageField = null;
  /* Platformfield */
  private String platformField = null;
  /* Previouscallingpointsfield */
  private List<PreviousCallingPointsField> previousCallingPointsField = new ArrayList<PreviousCallingPointsField>();
  /* Propertychanged */
  private String _PropertyChanged = null;
  /* Servicetypefield */
  private Integer serviceTypeField = null;
  /* Stafield */
  private String staField = null;
  /* Stdfield */
  private String stdField = null;
  /* Subsequentcallingpointsfield */
  private List<SubsequentCallingPointsField> subsequentCallingPointsField = new ArrayList<SubsequentCallingPointsField>();
  @JsonProperty("adhocAlertsField")
  public String getAdhocAlertsField() {
    return adhocAlertsField;
  }
  public void setAdhocAlertsField(String adhocAlertsField) {
    this.adhocAlertsField = adhocAlertsField;
  }

  @JsonProperty("ataField")
  public String getAtaField() {
    return ataField;
  }
  public void setAtaField(String ataField) {
    this.ataField = ataField;
  }

  @JsonProperty("atdField")
  public String getAtdField() {
    return atdField;
  }
  public void setAtdField(String atdField) {
    this.atdField = atdField;
  }

  @JsonProperty("crsField")
  public String getCrsField() {
    return crsField;
  }
  public void setCrsField(String crsField) {
    this.crsField = crsField;
  }

  @JsonProperty("disruptionReasonField")
  public String getDisruptionReasonField() {
    return disruptionReasonField;
  }
  public void setDisruptionReasonField(String disruptionReasonField) {
    this.disruptionReasonField = disruptionReasonField;
  }

  @JsonProperty("etaField")
  public String getEtaField() {
    return etaField;
  }
  public void setEtaField(String etaField) {
    this.etaField = etaField;
  }

  @JsonProperty("etdField")
  public String getEtdField() {
    return etdField;
  }
  public void setEtdField(String etdField) {
    this.etdField = etdField;
  }

  @JsonProperty("generatedAtField")
  public Date getGeneratedAtField() {
    return generatedAtField;
  }
  public void setGeneratedAtField(Date generatedAtField) {
    this.generatedAtField = generatedAtField;
  }

  @JsonProperty("isCancelledField")
  public Boolean getIsCancelledField() {
    return isCancelledField;
  }
  public void setIsCancelledField(Boolean isCancelledField) {
    this.isCancelledField = isCancelledField;
  }

  @JsonProperty("locationNameField")
  public String getLocationNameField() {
    return locationNameField;
  }
  public void setLocationNameField(String locationNameField) {
    this.locationNameField = locationNameField;
  }

  @JsonProperty("operatorCodeField")
  public String getOperatorCodeField() {
    return operatorCodeField;
  }
  public void setOperatorCodeField(String operatorCodeField) {
    this.operatorCodeField = operatorCodeField;
  }

  @JsonProperty("operatorField")
  public String getOperatorField() {
    return operatorField;
  }
  public void setOperatorField(String operatorField) {
    this.operatorField = operatorField;
  }

  @JsonProperty("overdueMessageField")
  public String getOverdueMessageField() {
    return overdueMessageField;
  }
  public void setOverdueMessageField(String overdueMessageField) {
    this.overdueMessageField = overdueMessageField;
  }

  @JsonProperty("platformField")
  public String getPlatformField() {
    return platformField;
  }
  public void setPlatformField(String platformField) {
    this.platformField = platformField;
  }

  @JsonProperty("previousCallingPointsField")
  public List<PreviousCallingPointsField> getPreviousCallingPointsField() {
    return previousCallingPointsField;
  }
  public void setPreviousCallingPointsField(List<PreviousCallingPointsField> previousCallingPointsField) {
    this.previousCallingPointsField = previousCallingPointsField;
  }

  @JsonProperty("_PropertyChanged")
  public String getPropertyChanged() {
    return _PropertyChanged;
  }
  public void setPropertyChanged(String _PropertyChanged) {
    this._PropertyChanged = _PropertyChanged;
  }

  @JsonProperty("serviceTypeField")
  public Integer getServiceTypeField() {
    return serviceTypeField;
  }
  public void setServiceTypeField(Integer serviceTypeField) {
    this.serviceTypeField = serviceTypeField;
  }

  @JsonProperty("staField")
  public String getStaField() {
    return staField;
  }
  public void setStaField(String staField) {
    this.staField = staField;
  }

  @JsonProperty("stdField")
  public String getStdField() {
    return stdField;
  }
  public void setStdField(String stdField) {
    this.stdField = stdField;
  }

  @JsonProperty("subsequentCallingPointsField")
  public List<SubsequentCallingPointsField> getSubsequentCallingPointsField() {
    return subsequentCallingPointsField;
  }
  public void setSubsequentCallingPointsField(List<SubsequentCallingPointsField> subsequentCallingPointsField) {
    this.subsequentCallingPointsField = subsequentCallingPointsField;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDetails {\n");
    sb.append("  adhocAlertsField: ").append(adhocAlertsField).append("\n");
    sb.append("  ataField: ").append(ataField).append("\n");
    sb.append("  atdField: ").append(atdField).append("\n");
    sb.append("  crsField: ").append(crsField).append("\n");
    sb.append("  disruptionReasonField: ").append(disruptionReasonField).append("\n");
    sb.append("  etaField: ").append(etaField).append("\n");
    sb.append("  etdField: ").append(etdField).append("\n");
    sb.append("  generatedAtField: ").append(generatedAtField).append("\n");
    sb.append("  isCancelledField: ").append(isCancelledField).append("\n");
    sb.append("  locationNameField: ").append(locationNameField).append("\n");
    sb.append("  operatorCodeField: ").append(operatorCodeField).append("\n");
    sb.append("  operatorField: ").append(operatorField).append("\n");
    sb.append("  overdueMessageField: ").append(overdueMessageField).append("\n");
    sb.append("  platformField: ").append(platformField).append("\n");
    sb.append("  previousCallingPointsField: ").append(previousCallingPointsField).append("\n");
    sb.append("  _PropertyChanged: ").append(_PropertyChanged).append("\n");
    sb.append("  serviceTypeField: ").append(serviceTypeField).append("\n");
    sb.append("  staField: ").append(staField).append("\n");
    sb.append("  stdField: ").append(stdField).append("\n");
    sb.append("  subsequentCallingPointsField: ").append(subsequentCallingPointsField).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

