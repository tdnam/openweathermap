# OpenWeatherMapImplementation

This repository contains the implementation of OpenWeatherMap in Java

Currently, it utilises this One Call API endpoint https://openweathermap.org/api/one-call-api

1. Count the number of day with predicted temperature > 20 (7 days)
2. Count the number of day with predicted weather (i.e: clear sky, raining, etc) (7 days)

## Requirement

1.  Java 11
2.  Maven
3.  Eclipse

## Setup

- Clone the repo: git clone https://github.com/tdnam/openweathermap.git
- Import the repo into Eclipse
- Create a config.properties file at root with below structure

       apibase=https://api.openweathermap.org/data/2.5/onecall?
       apikey=<API_KEY>

       # Sydney lat long
       lat=-33.8688
       lon=151.2093

       exclude=minutely,hourly
       units=metric

       # Weather condition code https://openweathermap.org/weather-conditions.
       clear.sky=800
       light.rain=500

- Open main Java file is in org/openweathermap/OpenWeatherImplementation/OpenWeatherImplementation.java and click Run

Notes: If you have any issues with running or setup the project. Please send me an email to tdnam39@gmail.com
