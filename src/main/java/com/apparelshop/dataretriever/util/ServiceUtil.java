package com.apparelshop.dataretriever.util;

import com.apparelshop.dataretriever.exception.UnsupportedParserException;

import java.util.Map;

public class ServiceUtil {


    public static String getService(String parserName, Map<String,String> mapping) throws UnsupportedParserException {
        for ( Map.Entry<String, String> parserSettings : mapping.entrySet())
        {
            if( parserSettings.getKey().equals(parserName) )
                return parserSettings.getValue();
        }

        throw new UnsupportedParserException(parserName);
    }

}
