package com.vad.RemoteDirectorySimulator.Model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class FetchAliasLocation {

    private String city;
    private String region;
    private String country;
    private String postalCode;
    public FetchAliasLocation() {
        super();
        // TODO Auto-generated constructor stub
    }
    public FetchAliasLocation(String city, String region, String country, String postalCode) {

        this.city = city;
        this.region = region;
        this.country = country;
        this.postalCode = postalCode;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    @Override
    public String toString() {
        return "FetchAliasLocation [city=" + city + ", region=" + region + ", country=" + country + ", postalCode="
                + postalCode + "]";
    }

    
}
