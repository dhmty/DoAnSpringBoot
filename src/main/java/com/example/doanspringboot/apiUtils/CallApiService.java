package com.example.doanspringboot.apiUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class CallApiService {

  public static String callAPI(String func, String requestBody) throws Exception {
    String body = null;
    try {
      ObjectMapper objectMapper = new ObjectMapper();
      HttpClient httpClient = HttpClientBuilder.create().build();

      HttpPost request = new HttpPost(Const.URL_API + func);
      request.setHeader("Authorization", "Bearer " + Const.accessToken);
      request.setHeader("Content-Type", "application/json");

      StringEntity entity = new StringEntity(requestBody);

      request.setEntity(entity);

      HttpResponse response = httpClient.execute(request);
      int statusCode = response.getStatusLine().getStatusCode();
      if (statusCode == 200) {
        HttpEntity responseBody = response.getEntity();
        if (responseBody != null) {
          body = EntityUtils.toString(responseBody);
        }
        JsonNode node = objectMapper.readTree(body);
        if (node.get("responseCode").intValue() == 0) {
          System.out.println(node.get("responseCode").get("msg"));
        }
      } else {
        System.out.println(response.getStatusLine());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return body;
  }
}
