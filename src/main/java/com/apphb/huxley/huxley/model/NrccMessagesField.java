package com.apphb.huxley.huxley.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NrccMessagesField {
  /* Propertychanged */
  private String _PropertyChanged = null;
  /* Valuefield */
  private String valueField = null;
  @JsonProperty("_PropertyChanged")
  public String getPropertyChanged() {
    return _PropertyChanged;
  }
  public void setPropertyChanged(String _PropertyChanged) {
    this._PropertyChanged = _PropertyChanged;
  }

  @JsonProperty("valueField")
  public String getValueField() {
    return valueField;
  }
  public void setValueField(String valueField) {
    this.valueField = valueField;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NrccMessagesField {\n");
    sb.append("  _PropertyChanged: ").append(_PropertyChanged).append("\n");
    sb.append("  valueField: ").append(valueField).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

