package org.posandpgfintech;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

@Service
public class SingletonService {
    @Autowired
   private ObjectFactory<PrototypeService> prototypeServiceObjectFactory;
    public String getMethod()
    {

        //return prototypeService().getMethod();
        return prototypeServiceObjectFactory.getObject().getMethod();
    }
    @Lookup
    public PrototypeService prototypeService()
    {
        return null;
    }



}
