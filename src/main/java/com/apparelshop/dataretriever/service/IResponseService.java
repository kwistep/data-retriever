package com.apparelshop.dataretriever.service;

import com.apparelshop.dataretriever.exception.ListNullException;

import java.util.List;

public interface IResponseService {

    List<String> getResponse(String parser, int quantity);

    List<? super String> getStoredLinks() throws ListNullException;

    boolean removeStoredLinks() throws ListNullException;


}
