package com.serverless;

import java.util.Map;
import java.util.Random;

import org.apache.log4j.Logger;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Handler implements RequestHandler<Map<String, Object>, String> {

	private static final Logger LOG = Logger.getLogger(Handler.class);
	private Random rand = new Random();

	@Override
	public String handleRequest(Map<String, Object> input, Context context) {
		long value = rand.nextLong();
		LOG.info("received: " + input);
		LOG.info("Random generated value is : " + value);
		return "This is random number generated for testing : " + value;
	}
}
