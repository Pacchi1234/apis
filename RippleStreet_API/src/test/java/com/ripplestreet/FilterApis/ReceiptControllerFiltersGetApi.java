package com.ripplestreet.FilterApis;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class ReceiptControllerFiltersGetApi extends genricUtilities {
	@Test(groups="common-serivce")
	public void getReceiptList() throws NumberFormatException, IOException {
		Testcase = 293;
		List<String> receiptstatus = Arrays.asList("INITIATED", "APPROVED", "PENDING", "REJECTED");
		for (String actions : receiptstatus) {
			response = RestAssured.get("/common-service/v1/receipt/list?action=" + actions + "&eventId=" + eventId);
			genricUtilities.StatusCode();
			Testcase++;
		}

	}

}
