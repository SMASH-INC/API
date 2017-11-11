/*
 * SMASH
 *
 * This file was automatically generated for the SMASH API by SMASH, INC ( https://smashlabs.io ).
 */
package SMASH.models;

import java.util.*;

public class InfoModelBuilder {
    //the instance to build
    private InfoModel infoModel;

    /**
     * Default constructor to initialize the instance
     */
    public InfoModelBuilder() {
        infoModel = new InfoModel();
    }

    public InfoModelBuilder uid(String uid) {
        infoModel.setUid(uid);
        return this;
    }

    public InfoModelBuilder apiuid(String apiuid) {
        infoModel.setApiuid(apiuid);
        return this;
    }

    public InfoModelBuilder realname(String realname) {
        infoModel.setRealname(realname);
        return this;
    }

    public InfoModelBuilder displayname(String displayname) {
        infoModel.setDisplayname(displayname);
        return this;
    }

    public InfoModelBuilder avatar(String avatar) {
        infoModel.setAvatar(avatar);
        return this;
    }

    public InfoModelBuilder email(String email) {
        infoModel.setEmail(email);
        return this;
    }

    public InfoModelBuilder address(String address) {
        infoModel.setAddress(address);
        return this;
    }

    public InfoModelBuilder phone(String phone) {
        infoModel.setPhone(phone);
        return this;
    }

    public InfoModelBuilder lastlogin(String lastlogin) {
        infoModel.setLastlogin(lastlogin);
        return this;
    }

    public InfoModelBuilder ip(String ip) {
        infoModel.setIp(ip);
        return this;
    }

    public InfoModelBuilder m2fa(String m2fa) {
        infoModel.setM2fa(m2fa);
        return this;
    }

    public InfoModelBuilder iplock(String iplock) {
        infoModel.setIplock(iplock);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public InfoModel build() {
        return infoModel;
    }
}