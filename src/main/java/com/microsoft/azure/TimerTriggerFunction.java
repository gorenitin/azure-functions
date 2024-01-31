package com.microsoft.azure;

import java.time.*;

import com.microsoft.azure.functions.*;
import com.microsoft.azure.functions.annotation.*;

/**
 * Azure Functions with TimerTrigger trigger.
 */
public class TimerTriggerFunction {

	/** 
	 * This function will be invoked periodically according to the specified schedule.
	 */
	@FunctionName("TimerTrigger-Java")
	public void run(@TimerTrigger(name = "timerInfo", schedule = "0 * * * * *") String timerInfo,
			final ExecutionContext context) {
		context.getLogger().info("Java Timer trigger function executed at: " + LocalDateTime.now());
	}

}
