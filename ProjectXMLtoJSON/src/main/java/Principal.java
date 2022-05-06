
import java.io.File;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maria
 */
import org.json.JSONObject;
import org.json.XML;
import org.json.JSONException;
import org.apache.commons.io.FileUtils;

 
public class Principal {
    
    public static void main(String[] args) throws Exception{
        File xml = new File("C:/Users/maria/OneDrive/Documentos/NetBeansProjects/ProjectXMLtoJSON/XMLINICIAL.xml");
        
        String strXML = FileUtils.readFileToString(xml,"UTF-8");
        
        JSONObject json = XML.toJSONObject(strXML);
        System.out.println(json.toString());
    }
    
    
    
    
}
