package com.learning.java;

import java.io.Serializable;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

public class Person {
//    private static final ObjectMapper objectMapper = new ObjectMapper();
//
//
//    String json = "{\n" +
//                      "  \"url\": \"http://fkvms.synlabs.io/integration/vms/addScan\",\n" +
//                      "  \"accessKey\": \"vms_integration_key\",\n" +
//                      "  \"httpMethod\": \"POST\",\n" +
//                      "  \"actionType\": \"UPLOAD_IMAGE\",\n" +
//                      "  \"credentials\": {\n" +
//                      "    \"A\": \"XYZ\"\n" +
//                      "  },\n" +
//                      "  \"requestBody\": {\n" +
//                      "    \"timeStamp\": 1720603026,\n" +
//                      "    \"awb\": \"AWB12345@1\",\n" +
//                      "    \"scanType\": \"FORWARD\",\n" +
//                      "    \"videoLength\": 8,\n" +
//                      "    \"fileExtension\": \"mp4\",\n" +
//                      "    \"platform\": \"Flipkart\"\n" +
//                      "  }\n" +
//                      "}";
//
//    @Getter
//    @Setter
//    static class IntegrationRequest {
//        private Map<String, Object> payload;
//    }
//
//    public static void main(String[] args) {
//        ObjectMapper objectMapper = new ObjectMapper();
//        IntegrationRequest request = objectMapper.readValue(json, IntegrationRequest.class);
//
//        // Accessing values dynamically
//        Map<String, Object> payload = request.getPayload();
//        System.out.println("URL: " + payload.get("url"));
//        System.out.println("Access Key: " + payload.get("accessKey"));
//        System.out.println("Request Body: " + payload.get("requestBody"));
//
//        // Manipulating payload
//        payload.put("newKey", "newValue");
//        System.out.println("Updated Payload: " + payload);
//    }
    
}