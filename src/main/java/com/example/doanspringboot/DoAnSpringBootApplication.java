package com.example.doanspringboot;

import com.example.doanspringboot.apiUtils.CallApiService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.UnsupportedEncodingException;

@SpringBootApplication
public class DoAnSpringBootApplication {
  public static final Gson gson = new GsonBuilder().disableHtmlEscaping().serializeNulls().setPrettyPrinting().create();
  public static void main(String[] args) {
    SpringApplication.run(DoAnSpringBootApplication.class, args);
//    try {
//      ObjectMapper objectMapper = new ObjectMapper();
////      List<NameValuePair> params = new ArrayList<>();
//////        params.add(new BasicNameValuePair("apiSecretKey", "be572f63ca97a18deffc624585b1533dd8eb7216"));
//////        params.add(new BasicNameValuePair("rtspUrl", rtspUrl));
//////        params.add(new BasicNameValuePair("urlEncode", "BASE64"));
////        params.add(null);
//////      HttpClient httpClient = HttpClientBuilder.create().build();
////      HttpClient httpClient = HttpClients.createDefault();
////      String url = "http://localhost:8081/HDVAPI/api/v1/GetAllRole";
////      HttpPost request = new HttpPost(url);
////      request.setHeader("Content-Type", "application/json");
////      request.setHeader("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJEb2FuQ3VvbmdEYWkiLCJuYW1lIjoiSERWIEdyb3VwIiwiaWF0IjoyNTAxMjAyMjA5MTE3MTE5MDB9.2VaeS_V11otO0TX6P1w9eIPQQKtlNHbGfUoS55AzkGg");
//////      request.setEntity(new UrlEncodedFormEntity(params, StandardCharsets.UTF_8));
//      JsonObject jsonObject = new JsonObject();
//      jsonObject.addProperty("userID", 26);
////      jsonObject.addProperty("ObjectName", "BHXInstockDate");
//      String requestBody = gson.toJson(jsonObject);
//      String body = CallApiService.callAPI("GetCartbyID",requestBody);
//      if (body!= null){
//        // get giá trị api gọi về
//        JsonNode node = objectMapper.readTree(body);
//        if (node.get("responseCode").intValue() == 0) {
//  //            imageBase64 = node.get("base64Data").textValue();
//          System.out.println(node.get("responseData").get("message"));
//        }
//      }



//      StringEntity entity = new StringEntity(requestBody);

//      request.setEntity(entity);
//      HttpResponse response = httpClient.execute(request);
//      int statusCode = response.getStatusLine().getStatusCode();
//      if (statusCode == 200) {
//        String body = null;
//        HttpEntity responseBody = response.getEntity();
//        if (responseBody != null) {
//          body = EntityUtils.toString(responseBody);
//        }
//        JsonNode node = objectMapper.readTree(body);
//        if (node.get("responseCode").intValue() == 0) {
////            imageBase64 = node.get("base64Data").textValue();
//          System.out.println(node.get("responseData").get("message"));
//        }
//      } else {
//        // Notify
////          MsgUtils.saveDebugInfo(I18n.get("ErrorCaptureImageF6"));
//        System.out.println(response.getStatusLine());
//      }
//    } catch (Exception e) {
//      // Notify
////        MsgUtils.saveDebugInfo(I18n.get("ErrorCaptureImageF6") + e.getMessage());
//    } catch (UnsupportedEncodingException e) {
//      e.printStackTrace();
//    } catch (Exception e) {
//      e.printStackTrace();
//    }
  }
}
