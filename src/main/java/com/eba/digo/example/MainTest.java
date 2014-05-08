package com.eba.digo.example;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.eba.digo.api.Droplets;
import com.eba.digo.api.OceanUtil;
import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;

/**
 * 
 * Test bed for a Java wrapper around DigitalOceans API<br/>
 * <br/>
 * 
 * https://developers.digitalocean.com/droplets/
 * 
 * @author Mike Ehrenberg
 * 
 */

public class MainTest {

	private static final String ENDPOINT = "https://api.digitalocean.com/COMMAND/?client_id=CLIENT_ID&api_key=API_KEY";

	private static final String CLIENT_ID = "YOUR_CLIENT_ID";
	private static final String API_KEY = "YOUR_API_KEY";

	private static final Gson GSON = new Gson();

	private static final OkHttpClient client = new OkHttpClient();

	public static void main(String[] args) throws Exception {

		// test getting all Droplets

		String url = ENDPOINT.replace("COMMAND", "droplets");
		url = url.replace("CLIENT_ID", CLIENT_ID);
		url = url.replace("API_KEY", API_KEY);

		final String jsonResponse = fetchString(url);

		// parse JSON response

		final Droplets droplets = GSON.fromJson(jsonResponse, Droplets.class);

		System.out.println("Droplets: query status = " + droplets.getStatus());
		System.out.println("Droplets: raw response = " + jsonResponse);

	}

	private static String fetchString(final String url) throws Exception {

		final HttpURLConnection connection = client.open(new URL(url));

		InputStream is = null;

		try {
			is = connection.getInputStream();
		} catch (Exception e) {
			// try error input stream
			is = connection.getErrorStream();
		}

		return OceanUtil.slurp(is, 1024);

	}

}
