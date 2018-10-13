package com.miboy.model;

/**
 * Created by bowen on 2018/10/13.
 */
public class Country {
  private Long id;
  private String countryName;
  private String countryCode;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public String getCounrtyCode() {
    return countryCode;
  }

  public void setCounrtyCode(String counrtyCode) {
    this.countryCode = counrtyCode;
  }
}
