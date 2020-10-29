package models;

import jdk.nashorn.internal.codegen.LocalStateRestorationInfo;

import java.sql.Time;
import java.text.DecimalFormat;
import java.time.LocalTime;

public class UserModel {
    String userInfoEmail;
    String userTypeName;
    String className;
    String clubName;

    public UserModel(String UserInfoEmail, String UserTypeName, String ClassName, String ClubName) {
        userInfoEmail = UserInfoEmail;
        userTypeName = UserTypeName;
        className = ClassName;
        clubName = ClubName;
    }

    public String getUserInfoEmail() {
        return userInfoEmail;
    }

    public void setUserInfoEmail(String userInfoEmail) {
        this.userInfoEmail = userInfoEmail;
    }

    public String getUserTypeName() {
        return userTypeName;
    }

    public void setUserTypeName(String userTypeName) {
        this.userTypeName = userTypeName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }
}