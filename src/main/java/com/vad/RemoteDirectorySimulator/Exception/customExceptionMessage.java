package com.vad.RemoteDirectorySimulator.Exception;

import java.util.Date;

public class customExceptionMessage {
    private Date currentTimeStamp;
    private String message;
    private String detail;
    public customExceptionMessage() {
        // TODO Auto-generated constructor stub
    }
    public customExceptionMessage(Date currentTimeStamp, String message, String detail) {
        super();
        this.currentTimeStamp = currentTimeStamp;
        this.message = message;
        this.detail = detail;
    }
    public Date getCurrentTimeStamp() {
        return currentTimeStamp;
    }
    public void setCurrentTimeStamp(Date currentTimeStamp) {
        this.currentTimeStamp = currentTimeStamp;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getDescription() {
        return detail;
    }
    public void setDescription(String detail) {
        this.detail = detail;
    }

}
