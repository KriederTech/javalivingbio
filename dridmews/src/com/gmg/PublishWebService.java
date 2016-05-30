/**
 * 
 */
package com.gmg;

import javax.xml.ws.Endpoint;

/**
 * @author Lasana
 *
 */
public class PublishWebService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Endpoint endpoint = Endpoint.publish("http://localhost:8080/dridmews/", new DridmePortTypeEndpoint1Impl());
		System.out.println("published URL: " + endpoint.isPublished());
		

	}

}
