package com.weather.app.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class WeatherResp {

   public Current current;
	
   @Data
	public class Current {
		
		public int temperature;
		@JsonProperty("weather_descriptions")
		private List<String> weatherDescriptions;
		public int feelslike;
	}

}
