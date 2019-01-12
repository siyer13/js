package practice.json;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;


public class JSONReader {

    public static final String jsonFile = "Employee.txt";

    public static void main(String[] args) throws IOException {
        InputStream fin = new FileInputStream(jsonFile);

        JsonReader jsonReader = Json.createReader(fin);

        JsonObject jsonObject = jsonRead.readObject();
        jsonRead.close();
        fin.close();

        Employee employee = new Employee();
        employee.setIdentity(jsonObject.getInt("identity"));
        System.out.println(employee.getIdentity());
    }
}

