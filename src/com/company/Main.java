package com.company;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
	     /*  DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("D:employees.xml"));

        NodeList nodeList = document.getDocumentElement().getElementsByTagName("employee");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            NamedNodeMap namedNodeMap = node.getAttributes();
            employees.add(new Employee(namedNodeMap.getNamedItem("name").getNodeValue(), namedNodeMap.getNamedItem("job").getNodeValue()));
        }


        for (Employee employee : employees)
            System.out.println(String.format("Информации о сотруднике: имя - %s, должность - %s.", employee.getName(), employee.getJob()));
*/




        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse("http://www.geoplugin.net/xml.gp?base_currency=USD");
        doc.getDocumentElement().normalize();
        System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
        Node node = doc.getFirstChild();
        NodeList nList = node.getChildNodes();
        System.out.println("----------------------------");

        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node node1 = nList.item(temp);

            if(node1.getNodeType() == Node.ELEMENT_NODE){
                Element oElement = (Element) node1;
                System.out.println(oElement.getNodeName()+":"+oElement.getTextContent());
            }

        }

    }
}
