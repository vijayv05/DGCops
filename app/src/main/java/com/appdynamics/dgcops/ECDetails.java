package com.appdynamics.dgcops;

import java.io.Serializable;

public class ECDetails implements Serializable {

    String ecname;
    String host;
    Integer port;
    String username;
    String password;
    Boolean isSSLEnabled;

    public ECDetails () {

    }

    public ECDetails(String ecname, String host, Integer port, String username, String password, Boolean isSSLEnabled) {
        this.ecname = ecname;
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
        this.isSSLEnabled = isSSLEnabled;
    }





    public String getEcname() {
        return ecname;
    }

    public void setEcname(String ecname) {
        this.ecname = ecname;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getSSLEnabled() {
        return isSSLEnabled;
    }

    public void setSSLEnabled(Boolean SSLEnabled) {
        isSSLEnabled = SSLEnabled;
    }
}
