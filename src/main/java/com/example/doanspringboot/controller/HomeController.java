package com.example.doanspringboot.controller;



import com.example.doanspringboot.apiUtils.CallApiService;
import com.example.doanspringboot.model.Order;
import com.example.doanspringboot.model.Transaction;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;


@Controller
public class HomeController {
	public static final Gson gson = new GsonBuilder().disableHtmlEscaping().serializeNulls().setPrettyPrinting().create();
	ObjectMapper objectMapper = new ObjectMapper();

	@RequestMapping("/")
	public String index(Model model) {
		List<Transaction> listTrans = new ArrayList<>();
		try {
			JsonObject jsonObject = new JsonObject();
			String requestBody = gson.toJson(jsonObject);
			String body = CallApiService.callAPI("GetAllTransaction",requestBody);

			if (body != null){
				JsonNode node = objectMapper.readTree(body);
				if (node.get("responseCode").intValue() == 0) {
					listTrans = (objectMapper.convertValue(node.get("responseData").get("data"),new TypeReference<List<Transaction>>(){}));
				}
			}

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("listDH", listTrans);
		return "QLDonHang/listDH";
	}

	@RequestMapping("/viewDH")
	public String index1(Model model, @RequestParam("id") String id) {
		List<Order> listOrders = new ArrayList<>();
		try {
			JsonObject jsonObject = new JsonObject();
      jsonObject.addProperty("transID", id);
			String requestBody = gson.toJson(jsonObject);
			String body = CallApiService.callAPI("GetOrderByTransId",requestBody);

			if (body != null){
				JsonNode node = objectMapper.readTree(body);
				if (node.get("responseCode").intValue() == 0) {
					listOrders = (objectMapper.convertValue(node.get("responseData").get("data"),new TypeReference<List<Order>>(){}));
				}
			}

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("listOrders", listOrders);
		return "QLDonHang/viewDH";
	}

	@RequestMapping("/update")
	public String index2(Model model, @RequestParam("id") String id) {
		int kq = -1;
		try {
			JsonObject jsonObject = new JsonObject();
			jsonObject.addProperty("idOrder", id);
			String requestBody = gson.toJson(jsonObject);
			String body = CallApiService.callAPI("UpdateOrder",requestBody);

			if (body != null){
				JsonNode node = objectMapper.readTree(body);
				if (node.get("responseCode").intValue() == 0) {
					 kq = 0;
				}
			}

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/";
	}

}
