package com.workwave.jsonparser.JsonParser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;
public class JacksonObjectMapper {

	public static void main(String[] args) throws IOException {
		
		//read json file data to String
				byte[] jsonData = Files.readAllBytes(Paths.get("customer.txt"));
				
				//create ObjectMapper instance
				ObjectMapper objectMapper = new ObjectMapper();
				
				//convert json string to object
				Customer[] customer = objectMapper.readValue(jsonData, Customer[].class);
				
				for(Customer cust: customer) {
					System.out.println(cust);
					// if you want specific you could get on that particular variable like getArea
					System.out.println(cust.getArea());
				}
	}
}
