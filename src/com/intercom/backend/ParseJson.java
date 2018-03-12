package com.intercom.backend;

import com.google.gson.Gson;

import com.intercom.entity.Customer;

public class ParseJson {

	public static void main(String[] args) {
	}

	public static Customer[] parseJsonCustomers() {
		String jsonCustomers = "[\r\n" + "		{\r\n" + "			\"latitude\": \"52.986375\",\r\n"
				+ "			\"user_id\": 12,\r\n" + "			\"name\": \"Christina McArdle\",\r\n"
				+ "			\"longitude\": \"-6.043701\"\r\n" + "		},\r\n" + "		{\r\n"
				+ "			\"latitude\": \"51.92893\",\r\n" + "			\"user_id\": 1,\r\n"
				+ "			\"name\": \"Alice Cahill\",\r\n" + "			\"longitude\": \"-10.27699\"\r\n"
				+ "		},\r\n" + "		{\r\n" + "			\"latitude\": \"51.8856167\",\r\n"
				+ "			\"user_id\": 2,\r\n" + "			\"name\": \"Ian McArdle\",\r\n"
				+ "			\"longitude\": \"-10.4240951\"\r\n" + "		},\r\n" + "		{\r\n"
				+ "			\"latitude\": \"52.3191841\",\r\n" + "			\"user_id\": 3,\r\n"
				+ "			\"name\": \"Jack Enright\",\r\n" + "			\"longitude\": \"-8.5072391\"\r\n"
				+ "		},\r\n" + "		{\r\n" + "			\"latitude\": \"53.807778\",\r\n"
				+ "			\"user_id\": 28,\r\n" + "			\"name\": \"Charlie Halligan\",\r\n"
				+ "			\"longitude\": \"-7.714444\"\r\n" + "		},\r\n" + "		{\r\n"
				+ "			\"latitude\": \"53.4692815\",\r\n" + "			\"user_id\": 7,\r\n"
				+ "			\"name\": \"Frank Kehoe\",\r\n" + "			\"longitude\": \"-9.436036\"\r\n"
				+ "		},\r\n" + "		{\r\n" + "			\"latitude\": \"54.0894797\",\r\n"
				+ "			\"user_id\": 8,\r\n" + "			\"name\": \"Eoin Ahearn\",\r\n"
				+ "			\"longitude\": \"-6.18671\"\r\n" + "		},\r\n" + "		{\r\n"
				+ "			\"latitude\": \"53.038056\",\r\n" + "			\"user_id\": 26,\r\n"
				+ "			\"name\": \"Stephen McArdle\",\r\n" + "			\"longitude\": \"-7.653889\"\r\n"
				+ "		},\r\n" + "		{\r\n" + "			\"latitude\": \"54.1225\",\r\n"
				+ "			\"user_id\": 27,\r\n" + "			\"name\": \"Enid Gallagher\",\r\n"
				+ "			\"longitude\": \"-8.143333\"\r\n" + "		},\r\n" + "		{\r\n"
				+ "			\"latitude\": \"53.1229599\",\r\n" + "			\"user_id\": 6,\r\n"
				+ "			\"name\": \"Theresa Enright\",\r\n" + "			\"longitude\": \"-6.2705202\"\r\n"
				+ "		},\r\n" + "		{\r\n" + "			\"latitude\": \"52.2559432\",\r\n"
				+ "			\"user_id\": 9,\r\n" + "			\"name\": \"Jack Dempsey\",\r\n"
				+ "			\"longitude\": \"-7.1048927\"\r\n" + "		},\r\n" + "		{\r\n"
				+ "			\"latitude\": \"52.240382\",\r\n" + "			\"user_id\": 10,\r\n"
				+ "			\"name\": \"Georgina Gallagher\",\r\n" + "			\"longitude\": \"-6.972413\"\r\n"
				+ "		},\r\n" + "		{\r\n" + "			\"latitude\": \"53.2451022\",\r\n"
				+ "			\"user_id\": 4,\r\n" + "			\"name\": \"Ian Kehoe\",\r\n"
				+ "			\"longitude\": \"-6.238335\"\r\n" + "		},\r\n" + "		{\r\n"
				+ "			\"latitude\": \"53.1302756\",\r\n" + "			\"user_id\": 5,\r\n"
				+ "			\"name\": \"Nora Dempsey\",\r\n" + "			\"longitude\": \"-6.2397222\"\r\n"
				+ "		},\r\n" + "		{\r\n" + "			\"latitude\": \"53.008769\",\r\n"
				+ "			\"user_id\": 11,\r\n" + "			\"name\": \"Richard Finnegan\",\r\n"
				+ "			\"longitude\": \"-6.1056711\"\r\n" + "		},\r\n" + "		{\r\n"
				+ "			\"latitude\": \"53.1489345\",\r\n" + "			\"user_id\": 31,\r\n"
				+ "			\"name\": \"Alan Behan\",\r\n" + "			\"longitude\": \"-6.8422408\"\r\n"
				+ "		},\r\n" + "		{\r\n" + "			\"latitude\": \"53\",\r\n"
				+ "			\"user_id\": 13,\r\n" + "			\"name\": \"Olive Ahearn\",\r\n"
				+ "			\"longitude\": \"-7\"\r\n" + "		},\r\n" + "		{\r\n"
				+ "			\"latitude\": \"51.999447\",\r\n" + "			\"user_id\": 14,\r\n"
				+ "			\"name\": \"Helen Cahill\",\r\n" + "			\"longitude\": \"-9.742744\"\r\n"
				+ "		},\r\n" + "		{\r\n" + "			\"latitude\": \"52.966\",\r\n"
				+ "			\"user_id\": 15,\r\n" + "			\"name\": \"Michael Ahearn\",\r\n"
				+ "			\"longitude\": \"-6.463\"\r\n" + "		},\r\n" + "		{\r\n"
				+ "			\"latitude\": \"52.366037\",\r\n" + "			\"user_id\": 16,\r\n"
				+ "			\"name\": \"Ian Larkin\",\r\n" + "			\"longitude\": \"-8.179118\"\r\n"
				+ "		},\r\n" + "		{\r\n" + "			\"latitude\": \"54.180238\",\r\n"
				+ "			\"user_id\": 17,\r\n" + "			\"name\": \"Patricia Cahill\",\r\n"
				+ "			\"longitude\": \"-5.920898\"\r\n" + "		},\r\n" + "		{\r\n"
				+ "			\"latitude\": \"53.0033946\",\r\n" + "			\"user_id\": 39,\r\n"
				+ "			\"name\": \"Lisa Ahearn\",\r\n" + "			\"longitude\": \"-6.3877505\"\r\n"
				+ "		},\r\n" + "		{\r\n" + "			\"latitude\": \"52.228056\",\r\n"
				+ "			\"user_id\": 18,\r\n" + "			\"name\": \"Bob Larkin\",\r\n"
				+ "			\"longitude\": \"-7.915833\"\r\n" + "		},\r\n" + "		{\r\n"
				+ "			\"latitude\": \"54.133333\",\r\n" + "			\"user_id\": 24,\r\n"
				+ "			\"name\": \"Rose Enright\",\r\n" + "			\"longitude\": \"-6.433333\"\r\n"
				+ "		},\r\n" + "		{\r\n" + "			\"latitude\": \"55.033\",\r\n"
				+ "			\"user_id\": 19,\r\n" + "			\"name\": \"Enid Cahill\",\r\n"
				+ "			\"longitude\": \"-8.112\"\r\n" + "		},\r\n" + "		{\r\n"
				+ "			\"latitude\": \"53.521111\",\r\n" + "			\"user_id\": 20,\r\n"
				+ "			\"name\": \"Enid Enright\",\r\n" + "			\"longitude\": \"-9.831111\"\r\n"
				+ "		},\r\n" + "		{\r\n" + "			\"latitude\": \"51.802\",\r\n"
				+ "			\"user_id\": 21,\r\n" + "			\"name\": \"David Ahearn\",\r\n"
				+ "			\"longitude\": \"-9.442\"\r\n" + "		},\r\n" + "		{\r\n"
				+ "			\"latitude\": \"54.374208\",\r\n" + "			\"user_id\": 22,\r\n"
				+ "			\"name\": \"Charlie McArdle\",\r\n" + "			\"longitude\": \"-8.371639\"\r\n"
				+ "		},\r\n" + "		{\r\n" + "			\"latitude\": \"53.74452\",\r\n"
				+ "			\"user_id\": 29,\r\n" + "			\"name\": \"Oliver Ahearn\",\r\n"
				+ "			\"longitude\": \"-7.11167\"\r\n" + "		},\r\n" + "		{\r\n"
				+ "			\"latitude\": \"53.761389\",\r\n" + "			\"user_id\": 30,\r\n"
				+ "			\"name\": \"Nick Enright\",\r\n" + "			\"longitude\": \"-7.2875\"\r\n"
				+ "		},\r\n" + "		{\r\n" + "			\"latitude\": \"54.080556\",\r\n"
				+ "			\"user_id\": 23,\r\n" + "			\"name\": \"Eoin Gallagher\",\r\n"
				+ "			\"longitude\": \"-6.361944\"\r\n" + "		},\r\n" + "		{\r\n"
				+ "			\"latitude\": \"52.833502\",\r\n" + "			\"user_id\": 25,\r\n"
				+ "			\"name\": \"David Behan\",\r\n" + "			\"longitude\": \"-8.522366\"\r\n"
				+ "		}\r\n" + "	]";

		Customer[] customers = new Gson().fromJson(jsonCustomers, Customer[].class);

		return customers;
	}

}
