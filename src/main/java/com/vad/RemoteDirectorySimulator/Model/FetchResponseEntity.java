package com.vad.RemoteDirectorySimulator.Model;

import javax.persistence.*;

@Entity
public class FetchResponseEntity {
    
    @Id
    @GeneratedValue
    private Long Id;
    private String value;
    private String valueType;
    private String alias;
    private String aliasType;
    private String timeSelectedAsPreferred;
    private String firstName;
    private String lastName;
    private String contactEmail;
    private String firstNameLocal;
    private String lastNameLocal;
    private String address1;
    private String address2;
    private String city;
    private String postalCode;
    private String region;
    private String country;
    private String networkName;
    private String networkType;
    public FetchResponseEntity() {
        super();
        // TODO Auto-generated constructor stub
    }
    public FetchResponseEntity(String value, String valueType, String alias, String aliasType,
            String timeSelectedAsPreferred, String firstName, String lastName, String contactEmail,
            String firstNameLocal, String lastNameLocal, String address1, String address2, String city,
            String postalCode, String region, String country, String networkName, String networkType) {
        
        this.value = value;
        this.valueType = valueType;
        this.alias = alias;
        this.aliasType = aliasType;
        this.timeSelectedAsPreferred = timeSelectedAsPreferred;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactEmail = contactEmail;
        this.firstNameLocal = firstNameLocal;
        this.lastNameLocal = lastNameLocal;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.postalCode = postalCode;
        this.region = region;
        this.country = country;
        this.networkName = networkName;
        this.networkType = networkType;
    }
    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public String getValueType() {
        return valueType;
    }
    public void setValueType(String valueType) {
        this.valueType = valueType;
    }
    public String getAlias() {
        return alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }
    public String getAliasType() {
        return aliasType;
    }
    public void setAliasType(String aliasType) {
        this.aliasType = aliasType;
    }
    public String getTimeSelectedAsPreferred() {
        return timeSelectedAsPreferred;
    }
    public void setTimeSelectedAsPreferred(String timeSelectedAsPreferred) {
        this.timeSelectedAsPreferred = timeSelectedAsPreferred;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getContactEmail() {
        return contactEmail;
    }
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
    public String getFirstNameLocal() {
        return firstNameLocal;
    }
    public void setFirstNameLocal(String firstNameLocal) {
        this.firstNameLocal = firstNameLocal;
    }
    public String getLastNameLocal() {
        return lastNameLocal;
    }
    public void setLastNameLocal(String lastNameLocal) {
        this.lastNameLocal = lastNameLocal;
    }
    public String getAddress1() {
        return address1;
    }
    public void setAddress1(String address1) {
        this.address1 = address1;
    }
    public String getAddress2() {
        return address2;
    }
    public void setAddress2(String address2) {
        this.address2 = address2;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
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
    public String getNetworkName() {
        return networkName;
    }
    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }
    public String getNetworkType() {
        return networkType;
    }
    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }
    @Override
    public String toString() {
        return "FetchResponseEntity [Id=" + Id + ", value=" + value + ", valueType=" + valueType + ", alias=" + alias
                + ", aliasType=" + aliasType + ", timeSelectedAsPreferred=" + timeSelectedAsPreferred + ", firstName="
                + firstName + ", lastName=" + lastName + ", contactEmail=" + contactEmail + ", firstNameLocal="
                + firstNameLocal + ", lastNameLocal=" + lastNameLocal + ", address1=" + address1 + ", address2="
                + address2 + ", city=" + city + ", postalCode=" + postalCode + ", region=" + region + ", country="
                + country + ", networkName=" + networkName + ", networkType=" + networkType + "]";
    }
    
    

}
