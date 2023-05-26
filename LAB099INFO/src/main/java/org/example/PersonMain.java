package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class PersonMain {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        // Creación y deserialización de un objeto Person

        // Creación de un objeto Person
        Person person = new Person();
        person.setName("Доцент");
        person.setAddress("Moscow, Red Square, 02");
        person.setBirthday("1952-02-29");
        person.setCrime(true);
        person.setPrisonTerm(15);

        try {
            // Escribir objeto en el archivo person.json
            mapper.writeValue(new File("person.json"), person);

            // Deserialización de datos del archivo y mostrar en pantalla
            Person deserializedPerson = mapper.readValue(new File("person.json"), Person.class);
            System.out.println(deserializedPerson);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
