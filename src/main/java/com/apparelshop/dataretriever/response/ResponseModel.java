package com.apparelshop.dataretriever.response;

import java.util.List;

public class ResponseModel {

    private int requiredQuantity;

    private int resultQuantity;

    private List<String> links;

    public ResponseModel(int requiredQuantity, int resultQuantity, List<String> links) {
        this.requiredQuantity = requiredQuantity;
        this.resultQuantity = resultQuantity;
        this.links = links;
    }

    public ResponseModel() {
    }

    public int getRequiredQuantity() {
        return requiredQuantity;
    }

    public void setRequiredQuantity(int requiredQuantity) {
        this.requiredQuantity = requiredQuantity;
    }

    public int getResultQuantity() {
        return resultQuantity;
    }

    public void setResultQuantity(int resultQuantity) {
        this.resultQuantity = resultQuantity;
    }

    public List<String> getLinks() {
        return links;
    }

    public void setLinks(List<String> links) {
        this.links = links;
    }
}
