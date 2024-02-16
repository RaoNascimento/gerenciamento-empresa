package br.com.strella.srv.empresa.adapter.dto;

public class RequestContext {

    String token;
    String traceId;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

