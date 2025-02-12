package com.example.ExpenseTracker;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class Exception_Class extends RuntimeException{
	
	public Exception_Class(String msg){
		super(msg);
	}

}

