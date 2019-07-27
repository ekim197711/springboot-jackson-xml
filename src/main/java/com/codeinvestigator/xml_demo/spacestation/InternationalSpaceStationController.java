package com.codeinvestigator.xml_demo.spacestation;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.IOException;
import java.io.InputStream;

@RestController
@Slf4j
public class InternationalSpaceStationController {

    @GetMapping(value="/spacestation", produces={"application/json"})
    SpaceStation spaceStation() throws XMLStreamException, IOException {
        InputStream xmlRessource = InternationalSpaceStationController.class.getClassLoader().getResourceAsStream("spacestation.xml");
        XMLInputFactory xmlInputFactory = XMLInputFactory.newFactory();
        XMLStreamReader xmlStreamReader = xmlInputFactory.createXMLStreamReader(xmlRessource);

        XmlMapper mapper = new XmlMapper();
        SpaceStation spaceStation = mapper.readValue(xmlStreamReader, SpaceStation.class);

        for (SpaceShip spaceship : spaceStation.getSpaceships()) {
            spaceship.setName(spaceship.getName() + " Now For sale!!!");
            spaceship.getPrice().setValueOfShip(20.0d);
        }


        SpaceShip spaceShip = spaceStation.getSpaceships().get(0);
        String xmlString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(spaceShip);
        log.info("Heres the xml: \n" + xmlString);


        return spaceStation;
    }
}
