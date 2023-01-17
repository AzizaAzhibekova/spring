package peaksoft.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import peaksoft.config.AppConfig;

@Component
public class Ocean1 {


    @Autowired
  Island2 island;

    @Override
    public String toString() {
        return "на океане остров " + island.toString();
    }
}
