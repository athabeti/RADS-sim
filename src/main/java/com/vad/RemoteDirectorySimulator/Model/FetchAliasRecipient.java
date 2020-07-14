package com.vad.RemoteDirectorySimulator.Model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class FetchAliasRecipient {

    
    private String firstName;
    private String LastName;
    private String firstLocalName;
    private String lastLocalName;
    private String contactEmail;
    private FetchAliasLocation location;
    
    
    
    
    public FetchAliasRecipient() {
        super();
        // TODO Auto-generated constructor stub
    }
    public FetchAliasRecipient(String firstName, String lastName, String firstLocalName, String lastLocalName,
            String contactEmail, FetchAliasLocation location) {
        super();
        this.firstName = firstName;
        LastName = lastName;
        this.firstLocalName = firstLocalName;
        this.lastLocalName = lastLocalName;
        this.contactEmail = contactEmail;
        this.location = location;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return LastName;
    }
    public void setLastName(String lastName) {
        LastName = lastName;
    }
    public String getFirstLocalName() {
        return firstLocalName;
    }
    public void setFirstLocalName(String firstLocalName) {
        this.firstLocalName = firstLocalName;
    }
    public String getLastLocalName() {
        return lastLocalName;
    }
    public void setLastLocalName(String lastLocalName) {
        this.lastLocalName = lastLocalName;
    }
    public String getContactEmail() {
        return contactEmail;
    }
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
    public FetchAliasLocation getLocation() {
        return location;
    }
    public void setLocation(FetchAliasLocation location) {
        this.location = location;
    }
    @Override
    public String toString() {
        return "FetchAliasRecipient [firstName=" + firstName + ", LastName=" + LastName + ", firstLocalName="
                + firstLocalName + ", lastLocalName=" + lastLocalName + ", contactEmail=" + contactEmail + ", location="
                + location + "]";
    }
    
    
    
}
