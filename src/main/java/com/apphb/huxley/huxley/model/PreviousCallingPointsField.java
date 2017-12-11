package com.apphb.huxley.huxley.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;
public class PreviousCallingPointsField {
  /* Associscancelledfield */
  private Boolean assocIsCancelledField = null;
  /* Associscancelledfieldspecified */
  private Boolean assocIsCancelledFieldSpecified = null;
  /* Callingpointfield */
  private List<CallingPointField> callingPointField = new ArrayList<CallingPointField>();
  /* Propertychanged */
  private String _PropertyChanged = null;
  /* Servicechangerequiredfield */
  private Boolean serviceChangeRequiredField = null;
  /* Servicechangerequiredfieldspecified */
  private Boolean serviceChangeRequiredFieldSpecified = null;
  /* Servicetypefield */
  private Integer serviceTypeField = null;
  /* Servicetypefieldspecified */
  private Boolean serviceTypeFieldSpecified = null;
  @JsonProperty("assocIsCancelledField")
  public Boolean getAssocIsCancelledField() {
    return assocIsCancelledField;
  }
  public void setAssocIsCancelledField(Boolean assocIsCancelledField) {
    this.assocIsCancelledField = assocIsCancelledField;
  }

  @JsonProperty("assocIsCancelledFieldSpecified")
  public Boolean getAssocIsCancelledFieldSpecified() {
    return assocIsCancelledFieldSpecified;
  }
  public void setAssocIsCancelledFieldSpecified(Boolean assocIsCancelledFieldSpecified) {
    this.assocIsCancelledFieldSpecified = assocIsCancelledFieldSpecified;
  }

  @JsonProperty("callingPointField")
  public List<CallingPointField> getCallingPointField() {
    return callingPointField;
  }
  public void setCallingPointField(List<CallingPointField> callingPointField) {
    this.callingPointField = callingPointField;
  }

  @JsonProperty("_PropertyChanged")
  public String getPropertyChanged() {
    return _PropertyChanged;
  }
  public void setPropertyChanged(String _PropertyChanged) {
    this._PropertyChanged = _PropertyChanged;
  }

  @JsonProperty("serviceChangeRequiredField")
  public Boolean getServiceChangeRequiredField() {
    return serviceChangeRequiredField;
  }
  public void setServiceChangeRequiredField(Boolean serviceChangeRequiredField) {
    this.serviceChangeRequiredField = serviceChangeRequiredField;
  }

  @JsonProperty("serviceChangeRequiredFieldSpecified")
  public Boolean getServiceChangeRequiredFieldSpecified() {
    return serviceChangeRequiredFieldSpecified;
  }
  public void setServiceChangeRequiredFieldSpecified(Boolean serviceChangeRequiredFieldSpecified) {
    this.serviceChangeRequiredFieldSpecified = serviceChangeRequiredFieldSpecified;
  }

  @JsonProperty("serviceTypeField")
  public Integer getServiceTypeField() {
    return serviceTypeField;
  }
  public void setServiceTypeField(Integer serviceTypeField) {
    this.serviceTypeField = serviceTypeField;
  }

  @JsonProperty("serviceTypeFieldSpecified")
  public Boolean getServiceTypeFieldSpecified() {
    return serviceTypeFieldSpecified;
  }
  public void setServiceTypeFieldSpecified(Boolean serviceTypeFieldSpecified) {
    this.serviceTypeFieldSpecified = serviceTypeFieldSpecified;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreviousCallingPointsField {\n");
    sb.append("  assocIsCancelledField: ").append(assocIsCancelledField).append("\n");
    sb.append("  assocIsCancelledFieldSpecified: ").append(assocIsCancelledFieldSpecified).append("\n");
    sb.append("  callingPointField: ").append(callingPointField).append("\n");
    sb.append("  _PropertyChanged: ").append(_PropertyChanged).append("\n");
    sb.append("  serviceChangeRequiredField: ").append(serviceChangeRequiredField).append("\n");
    sb.append("  serviceChangeRequiredFieldSpecified: ").append(serviceChangeRequiredFieldSpecified).append("\n");
    sb.append("  serviceTypeField: ").append(serviceTypeField).append("\n");
    sb.append("  serviceTypeFieldSpecified: ").append(serviceTypeFieldSpecified).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

