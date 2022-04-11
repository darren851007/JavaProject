package test;

import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) throws JSONException, IOException {
        String data = new String(Files.readAllBytes(Paths.get("src/demo.json")));
        Map map = new HashMap();
        //read as json array
        JSONArray jsonArray = new JSONArray(data);
        for(int i = 0; i < jsonArray.length(); i++){
            // parse in json object
//            JSONObject object = jsonArray.getJSONObject(i);
//            or
            String str = jsonArray.get(i).toString();
            JSONObject object = new JSONObject(str);

            map.put("INFM_CNTN",object.getString("INFM_CNTN"));
            System.out.println("INFM_CNTN: " + map.get("INFM_CNTN"));

            String INFM_IDS="";
            JSONArray arr = object.getJSONArray("INFM_IDS");
//            for(int j=0; j<arr.length();j++){
//                map.put("INFM_IDS",arr.get(j).toString());
//            }
            map.put("INFM_IDS", arr);

            System.out.println("INFM_IDS: " + map.get("INFM_IDS"));

        }
    }
}
