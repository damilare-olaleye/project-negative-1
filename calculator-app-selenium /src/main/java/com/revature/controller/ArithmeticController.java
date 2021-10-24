package com.revature.controller;

import com.revature.service.ArithmeticService;

import io.javalin.Javalin;
import io.javalin.http.Handler;

public class ArithmeticController {

	public ArithmeticService arithmeticService;

	// Our constructor
	public ArithmeticController() {
		this.arithmeticService = new ArithmeticService();
	}

	public Handler add = (athc) -> {
		String firstNumberString = athc.formParam("firstNumber");
		String secondNumberString = athc.formParam("secondNumber");

		athc.result(arithmeticService.doAddition(firstNumberString, secondNumberString));
	};

	public Handler subtract = (athc) -> {
		String firstNumberString = athc.formParam("firstNumber");
		String secondNumberString = athc.formParam("secondNumber");

		athc.result(arithmeticService.doSubtract(firstNumberString, secondNumberString));
	};

	public Handler divide = (athc) -> {
		String firstNumberString = athc.formParam("firstNumber");
		String secondNumberString = athc.formParam("secondNumber");

		athc.result(arithmeticService.doDivide(firstNumberString, secondNumberString));
	};

	public Handler multiply = (athc) -> {
		String firstNumberString = athc.formParam("firstNumber");
		String secondNumberString = athc.formParam("secondNumber");

		athc.result(arithmeticService.doMultiply(firstNumberString, secondNumberString));
	};

	public Handler mod = (athc) -> {
		String firstNumberString = athc.formParam("firstNumber");
		String secondNumberString = athc.formParam("secondNumber");

		athc.result(arithmeticService.doMod(firstNumberString, secondNumberString));
	};

	public void registerEndPoint(Javalin app) {
		app.post("/add", add);
		app.post("/subtract", subtract);
		app.post("/divide", divide);
		app.post("/multiply", multiply);
		app.post("/mod", mod);
	}
}
