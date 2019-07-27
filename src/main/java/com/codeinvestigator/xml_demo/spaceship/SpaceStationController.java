package com.codeinvestigator.xml_demo.spaceship;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@RestController
public class SpaceStationController {

//    @GetMapping(value = "/spaceships", produces = {"application/json"})
//    public List<SpaceShip> spaceShips() throws XMLStreamException, IOException {
//
//        InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream("spacestation.xml");
//        XMLInputFactory inputFactory = XMLInputFactory.newFactory();
//        XMLStreamReader xmlStreamReader = inputFactory.createXMLStreamReader(resourceAsStream);
//
//        XmlMapper mapper = new XmlMapper();
//        SpaceStation spaceStation = mapper.readValue(xmlStreamReader, SpaceStation.class);
//        List<SpaceShip> spaceships = spaceStation.getSpaceships();
//
//        for (SpaceShip spaceship : spaceships) {
//            spaceship.getPrice().setValue(10.0d);
//        }
//
//        return spaceships;
//    }
}
