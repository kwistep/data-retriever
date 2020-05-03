package com.apparelshop.dataretriever.dto;

public class RequestData {

    private int requestId;

    private String link;

    public RequestData() {
    }

    public RequestData(int requestId, String link) {
        this.requestId = requestId;
        this.link = link;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

}
