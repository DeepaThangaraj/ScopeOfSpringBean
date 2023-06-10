package org.posandpgfintech;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeService {

    private String dateString= LocalDateTime.now().toString();

    public String getMethod()
    {
        return dateString;
    }

}
