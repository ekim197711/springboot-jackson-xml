package com.codeinvestigator.xml_demo.spacestation;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.Data;

@Data
public class Price {
    @JacksonXmlProperty(isAttribute = true, localName = "currency")
    private String currencyToPayWith;

    @JacksonXmlText
    private Double valueOfShip;
}
