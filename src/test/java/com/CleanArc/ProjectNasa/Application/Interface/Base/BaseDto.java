package com.CleanArc.ProjectNasa.Application.Interface.Base;


//this class is used to give the base dto
public class BaseDto {
    public Boolean Success;
    public String Message;

    public Boolean getSuccess() {
        return Success;
    }
    public void setSuccess(Boolean success) {
        Success = success;
    }
    public String getMessage() {
        return Message;
    }
    public void setMessage(String message) {
        Message = message;
    }
}
