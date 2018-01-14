import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;

/**
 * Created by Andrea on 2018.01.13..
 */
public class Util {
    public static void printYoutubeJson (String pathName){
        //létrehoztam egy objectMapper-t, amely readValue metódusának segítségével, a megadott
        //fileból és Pojo alapján beolvastam egy objektumba az adatait majd kiirattam a konzolra.
        ObjectMapper om = new ObjectMapper();
        try{
            Youtube y = om.readValue(new File(pathName), Youtube.class);
            System.out.println(y.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void convertYoutubeJSONToXML (String pathNameJSON, String pathNameXML){
        //a megadott JSON fileból beolvasom a Youtube y objektumba, utána létrehozok egy xmlMapper objektumot
        //beállítom neki a kinézetét "pretty print",
        // majd a youtube objektumból xml készítek az xmlMapper megfelelő metódusával
        //és végül kiírom egy xml fileba
        //https://stackify.com/java-xml-jackson/
        ObjectMapper om = new ObjectMapper();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathNameXML))){
            Youtube y = om.readValue(new File(pathNameJSON),Youtube.class );
            ObjectMapper xmlMapper = new XmlMapper();
            xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);
            String xml = xmlMapper.writeValueAsString(y);
            bw.write(xml);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
