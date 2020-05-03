package com.apparelshop.dataretriever.service;

import com.apparelshop.dataretriever.controller.feign.ZuulProxy;
import com.apparelshop.dataretriever.dto.RequestData;
import com.apparelshop.dataretriever.exception.ListNullException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ExtractorService implements IExtractorService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ZuulProxy zuulProxy;

    @Autowired
    private ResponseService responseService;

//    @Value("#{${mapping.source-parser}}")
//    private Map<String, String> mapSourceToParser;

    public void sendData() throws ListNullException {

        List<String> storedLinks = responseService.getStoredLinks();

            for(String x : storedLinks)
            {
                if(x.contains("www.adidas.ca"))
                {
                    RequestData requestData = new RequestData();
                    requestData.setLink(x);
                    requestData.setRequestId(x.hashCode());
                    zuulProxy.processData(requestData);
                    logger.info("RequestId: [" + x.hashCode()  + "], link: [" + x + "]");
                }
            }
    }

}
