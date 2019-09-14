package com.world.weather.thirdpartservice;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.InputSource;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import data.WeatherData;
import java.io.IOException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class WeatherDataHandler {
	WeatherData weatherData = new WeatherData();
	OpenWeatherMap openWeatherMap = new OpenWeatherMap();
	 public static String getCharacterDataFromElement(Element e) {
		    Node child = e.getFirstChild();
		    if (child instanceof CharacterData) {
		      CharacterData cd = (CharacterData) child;
		      return cd.getData();
		    }
		    return "";
		  }
	public String getForcast() {
		String strData;
		System.out.println("Gettting forcast");
		try {
			strData = openWeatherMap.getForcast();
			strData.replace("<?xml version=\"1.0\" encoding=\"UTF-8\"?>", "");
		    try {
				DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			    InputSource is = new InputSource();
			    is.setCharacterStream(new StringReader(strData));
			    Document doc = db.parse(is);
			    NodeList nodes = doc.getElementsByTagName("weatherdata");
			    System.out.println("AMOD "+nodes.toString());
			    for (int i = 0; i < nodes.getLength(); i++) {
			      Element element = (Element) nodes.item(i);

			      NodeList name = element.getElementsByTagName("location");
			      Element line = (Element) name.item(0);
			      System.out.println("location: " + getCharacterDataFromElement(line));

			      NodeList title = element.getElementsByTagName("forecast");
			      line = (Element) title.item(0);
			      System.out.println("Meta: " + getCharacterDataFromElement(line));
			    }
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Nice weather today. Enjoy a day";		
	}
	
	public void parseWeatherData(String data) {
		
	}
	
}
