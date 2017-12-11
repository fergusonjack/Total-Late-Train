package com.apphb.huxley.huxley.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DestinationField {
  /* Associscancelledfield */
  private Boolean assocIsCancelledField = null;
  /* Crsfield */
  private String crsField = null;
  /* Futurechangetofield */
  private String futureChangeToField = null;
  /* Locationnamefield */
  private String locationNameField = null;
  /* Propertychanged */
  private String _PropertyChanged = null;
  /* Viafield */
  private String viaField = null;
  @JsonProperty("assocIsCancelledField")
  public Boolean getAssocIsCancelledField() {
    return assocIsCancelledField;
  }
  public void setAssocIsCancelledField(Boolean assocIsCancelledField) {
    this.assocIsCancelledField = assocIsCancelledField;
  }

  @JsonProperty("crsField")
  public String getCrsField() {
    return crsField;
  }
  public void setCrsField(String crsField) {
    this.crsField = crsField;
  }

  @JsonProperty("futureChangeToField")
  public String getFutureChangeToField() {
    return futureChangeToField;
  }
  public void setFutureChangeToField(String futureChangeToField) {
    this.futureChangeToField = futureChangeToField;
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

  @JsonProperty("viaField")
  public String getViaField() {
    return viaField;
  }
  public void setViaField(String viaField) {
    this.viaField = viaField;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinationField {\n");
    sb.append("  assocIsCancelledField: ").append(assocIsCancelledField).append("\n");
    sb.append("  crsField: ").append(crsField).append("\n");
    sb.append("  futureChangeToField: ").append(futureChangeToField).append("\n");
    sb.append("  locationNameField: ").append(locationNameField).append("\n");
    sb.append("  _PropertyChanged: ").append(_PropertyChanged).append("\n");
    sb.append("  viaField: ").append(viaField).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

