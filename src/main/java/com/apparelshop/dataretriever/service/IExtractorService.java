package com.apparelshop.dataretriever.service;

import com.apparelshop.dataretriever.exception.ListNullException;

public interface IExtractorService {

    void sendData() throws ListNullException;

}
