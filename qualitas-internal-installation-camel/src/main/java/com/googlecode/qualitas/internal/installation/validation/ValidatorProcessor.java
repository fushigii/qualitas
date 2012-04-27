package com.googlecode.qualitas.internal.installation.validation;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.springframework.stereotype.Component;

import com.googlecode.qualitas.engines.api.core.Bundle;
import com.googlecode.qualitas.engines.api.validation.Validator;
import com.googlecode.qualitas.internal.installation.core.AbstractProcessor;

/**
 * The Class ValidatorProcessor.
 */
@Component
public class ValidatorProcessor extends AbstractProcessor {

    /*
     * (non-Javadoc)
     * 
     * @see org.apache.camel.Processor#process(org.apache.camel.Exchange)
     */
    @Override
    public void process(Exchange exchange) throws Exception {
        Message in = exchange.getIn();
        
        Bundle bundle = in.getBody(Bundle.class);

        Validator validator = findQualitasComponent(Validator.class, bundle.getProcessType());
        validator.validate(bundle);
        
        Message out = exchange.getOut();
        out.setBody(bundle);
        out.setHeaders(in.getHeaders());
    }

}
