package com.intercom.backend;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.intercom.entity.Customer;

/**
 * @author vstevam
 * Equation Great Circle distance by Wikipedia Article 
 * d = 60 * acos (sin(L1)*sin(L2) + cos(L1)*cos(L2)*cos(G1 - G2))
 */
public class GreatCircleDistance {
	/**
	 * The GPS coordinates for our Dublin office are latitude 53.339428,
	 * longitude -6.257664.
	 */
	public static double latitudeOffice = 53.339428;
	public static double longitudeOffice = -6.257664;

	/**
	 * Equatorial earth radius in Kilometers (KM).
	 */
	private static final int EARTH_RADIUS = 6371;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Customer[] customers = ParseJson.parseJsonCustomers();
		customersToInvite(customers);

	}

	/**
	 * Method to print the list of customers to invite
	 *
	 * @param customers
	 *            list of customers
	 */
	public static void customersToInvite(Customer[] customers) {
		double resultKm = 0.0;
		List<Customer> unsortCustList = new ArrayList<Customer>();

		for (Customer customer : customers) {
			resultKm = distanceInKm(latitudeOffice, longitudeOffice, Double.parseDouble(customer.getLatitude()),
					Double.parseDouble(customer.getLongitude()));

			if (resultKm <= 100) {
				unsortCustList.add(customer);
			}
		}

		//order the customers by asc
		unsortCustList.sort(Comparator.comparing(Customer::getUser_id));

		for (Customer cust : unsortCustList) {
			System.out.println("ID: " + cust.getUser_id() + " Name: " + cust.getName());
		}

	}

	/**
	 * Method to calculate the great-circle distance
	 * between tow points by the latitude and longitude coordinates.
	 *
	 * @param initLati
	 *            Initial latitude
	 * @param initLong
	 *            Initial longitude
	 * @param endLati
	 *            Final latitude
	 * @param endLong
	 *            Final longitude
	 * @return The distance in Kilometers (Km)
	 */
	public static double distanceInKm(double initLati, double initLong, double endLati, double endLong) {

		double diffLati = Math.toRadians(endLati - initLati);
		double diffLong = Math.toRadians(endLong - initLong);

		double radiusStartLati = Math.toRadians(initLati);
		double radiusEndLati = Math.toRadians(endLati);

		// A and C are the 'sides' from the spherical triangle.
		double a = Math.pow(Math.sin(diffLati / 2), 2)
				+ Math.pow(Math.sin(diffLong / 2), 2) * Math.cos(radiusStartLati) * Math.cos(radiusEndLati);
		double c = 2 * Math.asin(Math.sqrt(a));

		return EARTH_RADIUS * c;
	}

}
