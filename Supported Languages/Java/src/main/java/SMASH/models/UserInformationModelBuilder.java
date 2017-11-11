/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class UserInformationModelBuilder {
    //the instance to build
    private UserInformationModel userInformationModel;

    /**
     * Default constructor to initialize the instance
     */
    public UserInformationModelBuilder() {
        userInformationModel = new UserInformationModel();
    }

    public UserInformationModelBuilder realname(String realname) {
        userInformationModel.setRealname(realname);
        return this;
    }

    public UserInformationModelBuilder displayname(String displayname) {
        userInformationModel.setDisplayname(displayname);
        return this;
    }

    public UserInformationModelBuilder avatar(String avatar) {
        userInformationModel.setAvatar(avatar);
        return this;
    }

    public UserInformationModelBuilder email(String email) {
        userInformationModel.setEmail(email);
        return this;
    }

    public UserInformationModelBuilder address(String address) {
        userInformationModel.setAddress(address);
        return this;
    }

    public UserInformationModelBuilder address1(String address1) {
        userInformationModel.setAddress1(address1);
        return this;
    }

    public UserInformationModelBuilder address2(String address2) {
        userInformationModel.setAddress2(address2);
        return this;
    }

    public UserInformationModelBuilder city(String city) {
        userInformationModel.setCity(city);
        return this;
    }

    public UserInformationModelBuilder state(String state) {
        userInformationModel.setState(state);
        return this;
    }

    public UserInformationModelBuilder zipcode(String zipcode) {
        userInformationModel.setZipcode(zipcode);
        return this;
    }

    public UserInformationModelBuilder phone(String phone) {
        userInformationModel.setPhone(phone);
        return this;
    }

    public UserInformationModelBuilder lastlogin(String lastlogin) {
        userInformationModel.setLastlogin(lastlogin);
        return this;
    }

    public UserInformationModelBuilder ip(String ip) {
        userInformationModel.setIp(ip);
        return this;
    }

    public UserInformationModelBuilder m2fa(String m2fa) {
        userInformationModel.setM2fa(m2fa);
        return this;
    }

    public UserInformationModelBuilder iplock(String iplock) {
        userInformationModel.setIplock(iplock);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UserInformationModel build() {
        return userInformationModel;
    }
}