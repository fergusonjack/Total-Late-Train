package com.apphb.huxley.huxley.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;
import java.util.Date;
public class GetDepartureBoard {
  /* Areservicesavailablefield */
  private Boolean areServicesAvailableField = null;
  /* Busservicesfield */
  private String busServicesField = null;
  /* Crsfield */
  private String crsField = null;
  /* Ferryservicesfield */
  private String ferryServicesField = null;
  /* Filtercrsfield */
  private String filtercrsField = null;
  /* Filterlocationnamefield */
  private String filterLocationNameField = null;
  /* Filtertypefield */
  private Integer filterTypeField = null;
  /* Generatedatfield */
  private Date generatedAtField = null;
  /* Locationnamefield */
  private String locationNameField = null;
  /* Nrccmessagesfield */
  private List<NrccMessagesField> nrccMessagesField = new ArrayList<NrccMessagesField>();
  /* Platformavailablefield */
  private Boolean platformAvailableField = null;
  /* Propertychanged */
  private String _PropertyChanged = null;
  /* Trainservicesfield */
  private List<TrainServicesField> trainServicesField = new ArrayList<TrainServicesField>();
  @JsonProperty("areServicesAvailableField")
  public Boolean getAreServicesAvailableField() {
    return areServicesAvailableField;
  }
  public void setAreServicesAvailableField(Boolean areServicesAvailableField) {
    this.areServicesAvailableField = areServicesAvailableField;
  }

  @JsonProperty("busServicesField")
  public String getBusServicesField() {
    return busServicesField;
  }
  public void setBusServicesField(String busServicesField) {
    this.busServicesField = busServicesField;
  }

  @JsonProperty("crsField")
  public String getCrsField() {
    return crsField;
  }
  public void setCrsField(String crsField) {
    this.crsField = crsField;
  }

  @JsonProperty("ferryServicesField")
  public String getFerryServicesField() {
    return ferryServicesField;
  }
  public void setFerryServicesField(String ferryServicesField) {
    this.ferryServicesField = ferryServicesField;
  }

  @JsonProperty("filtercrsField")
  public String getFiltercrsField() {
    return filtercrsField;
  }
  public void setFiltercrsField(String filtercrsField) {
    this.filtercrsField = filtercrsField;
  }

  @JsonProperty("filterLocationNameField")
  public String getFilterLocationNameField() {
    return filterLocationNameField;
  }
  public void setFilterLocationNameField(String filterLocationNameField) {
    this.filterLocationNameField = filterLocationNameField;
  }

  @JsonProperty("filterTypeField")
  public Integer getFilterTypeField() {
    return filterTypeField;
  }
  public void setFilterTypeField(Integer filterTypeField) {
    this.filterTypeField = filterTypeField;
  }

  @JsonProperty("generatedAtField")
  public Date getGeneratedAtField() {
    return generatedAtField;
  }
  public void setGeneratedAtField(Date generatedAtField) {
    this.generatedAtField = generatedAtField;
  }

  @JsonProperty("locationNameField")
  public String getLocationNameField() {
    return locationNameField;
  }
  public void setLocationNameField(String locationNameField) {
    this.locationNameField = locationNameField;
  }

  @JsonProperty("nrccMessagesField")
  public List<NrccMessagesField> getNrccMessagesField() {
    return nrccMessagesField;
  }
  public void setNrccMessagesField(List<NrccMessagesField> nrccMessagesField) {
    this.nrccMessagesField = nrccMessagesField;
  }

  @JsonProperty("platformAvailableField")
  public Boolean getPlatformAvailableField() {
    return platformAvailableField;
  }
  public void setPlatformAvailableField(Boolean platformAvailableField) {
    this.platformAvailableField = platformAvailableField;
  }

  @JsonProperty("_PropertyChanged")
  public String getPropertyChanged() {
    return _PropertyChanged;
  }
  public void setPropertyChanged(String _PropertyChanged) {
    this._PropertyChanged = _PropertyChanged;
  }

  @JsonProperty("trainServicesField")
  public List<TrainServicesField> getTrainServicesField() {
    return trainServicesField;
  }
  public void setTrainServicesField(List<TrainServicesField> trainServicesField) {
    this.trainServicesField = trainServicesField;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDepartureBoard {\n");
    sb.append("  areServicesAvailableField: ").append(areServicesAvailableField).append("\n");
    sb.append("  busServicesField: ").append(busServicesField).append("\n");
    sb.append("  crsField: ").append(crsField).append("\n");
    sb.append("  ferryServicesField: ").append(ferryServicesField).append("\n");
    sb.append("  filtercrsField: ").append(filtercrsField).append("\n");
    sb.append("  filterLocationNameField: ").append(filterLocationNameField).append("\n");
    sb.append("  filterTypeField: ").append(filterTypeField).append("\n");
    sb.append("  generatedAtField: ").append(generatedAtField).append("\n");
    sb.append("  locationNameField: ").append(locationNameField).append("\n");
    sb.append("  nrccMessagesField: ").append(nrccMessagesField).append("\n");
    sb.append("  platformAvailableField: ").append(platformAvailableField).append("\n");
    sb.append("  _PropertyChanged: ").append(_PropertyChanged).append("\n");
    sb.append("  trainServicesField: ").append(trainServicesField).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

