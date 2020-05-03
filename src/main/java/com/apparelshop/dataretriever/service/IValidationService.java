package com.apparelshop.dataretriever.service;

import com.apparelshop.dataretriever.exception.UnsupportedOfferNumberException;
import com.apparelshop.dataretriever.exception.UnsupportedParserException;

public interface IValidationService {

    boolean validate(String parser, int quantity) throws UnsupportedParserException, UnsupportedOfferNumberException;

}
