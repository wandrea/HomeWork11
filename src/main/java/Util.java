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
            Youtube y = om.readValue(new File(pathName),Youtube.class );
            System.out.println(y.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
