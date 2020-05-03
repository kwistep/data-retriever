package com.apparelshop.dataretriever.service;

import com.apparelshop.dataretriever.exception.UnsupportedOfferNumberException;
import com.apparelshop.dataretriever.exception.UnsupportedParserException;
import com.appareldiving.dataretriever.util.ParserUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ValidateService implements IValidationService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    /**
     *
     * @param parser name of parser requested
     * @param quantity number of links requested
     * @return true if validation passed
     * @throws UnsupportedParserException - parser does not exist
     * @throws UnsupportedOfferNumberException - quantity is out of the range (0...1000)
     */
    @Override
    public boolean validate(String parser, int quantity) throws UnsupportedParserException, UnsupportedOfferNumberException {

        if( !ParserUtil.containsParser(parser) )
        {
            logger.warn("Parser [" + parser + "] is not supported.");
            throw new UnsupportedParserException(String.valueOf(parser));
        }
        else if( quantity <= 0 || quantity > 1000 )
        {
            logger.warn("Quantity [" + quantity + "] is unsupported. Range should be 0-1000.");
            throw new UnsupportedOfferNumberException(String.valueOf(quantity));
        }

        return Boolean.TRUE;
    }
}
