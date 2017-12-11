package com.apphb.huxley.huxley.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CallingPointField {
  /* Adhocalertsfield */
  private String adhocAlertsField = null;
  /* Atfield */
  private String atField = null;
  /* Crsfield */
  private String crsField = null;
  /* Etfield */
  private String etField = null;
  /* Locationnamefield */
  private String locationNameField = null;
  /* Propertychanged */
  private String _PropertyChanged = null;
  /* Stfield */
  private String stField = null;
  @JsonProperty("adhocAlertsField")
  public String getAdhocAlertsField() {
    return adhocAlertsField;
  }
  public void setAdhocAlertsField(String adhocAlertsField) {
    this.adhocAlertsField = adhocAlertsField;
  }

  @JsonProperty("atField")
  public String getAtField() {
    return atField;
  }
  public void setAtField(String atField) {
    this.atField = atField;
  }

  @JsonProperty("crsField")
  public String getCrsField() {
    return crsField;
  }
  public void setCrsField(String crsField) {
    this.crsField = crsField;
  }

  @JsonProperty("etField")
  public String getEtField() {
    return etField;
  }
  public void setEtField(String etField) {
    this.etField = etField;
  }

  @JsonProperty("locationNameField")
  public String getLocationNameField() {
    return locationNameField;
  }
  public void setLocationNameField(String locationNameField) {
    this.locationNameField = locationNameField;
  }

  @JsonProperty("_PropertyChanged")
  public String getPropertyChanged() {
    return _PropertyChanged;
  }
  public void setPropertyChanged(String _PropertyChanged) {
    this._PropertyChanged = _PropertyChanged;
  }

  @JsonProperty("stField")
  public String getStField() {
    return stField;
  }
  public void setStField(String stField) {
    this.stField = stField;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallingPointField {\n");
    sb.append("  adhocAlertsField: ").append(adhocAlertsField).append("\n");
    sb.append("  atField: ").append(atField).append("\n");
    sb.append("  crsField: ").append(crsField).append("\n");
    sb.append("  etField: ").append(etField).append("\n");
    sb.append("  locationNameField: ").append(locationNameField).append("\n");
    sb.append("  _PropertyChanged: ").append(_PropertyChanged).append("\n");
    sb.append("  stField: ").append(stField).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

