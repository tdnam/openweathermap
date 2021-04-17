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
- Import the repo into Eclipse. Make sure you right click to the project in Eclipse, Refresh and Update the Project activate Maven packages installation/import in your local
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

- Method 1: Open main Java file is in openweatherimplementation/OpenWeatherImplementation.java and click Run
- Method 2: In Terminal at root, execute</br>
  ```
  mvn exec:java -Dexec.mainClass="openweathermapimplementation.OpenWeatherMapImplementation"
  ```

Results should look as below

```
Maximum Temperature on Sat Apr 17 11:00:00 AEST 2021 is 17.89
Maximum Temperature on Sun Apr 18 11:00:00 AEST 2021 is 18.48
Maximum Temperature on Mon Apr 19 11:00:00 AEST 2021 is 21.14
Maximum Temperature on Tue Apr 20 11:00:00 AEST 2021 is 22.95
Maximum Temperature on Wed Apr 21 11:00:00 AEST 2021 is 17.95
Maximum Temperature on Thu Apr 22 11:00:00 AEST 2021 is 20.2
Maximum Temperature on Fri Apr 23 11:00:00 AEST 2021 is 18.23
Maximum Temperature on Sat Apr 24 11:00:00 AEST 2021 is 18.05

The weather on Sat Apr 17 11:00:00 AEST 2021 is light rain
The weather on Sun Apr 18 11:00:00 AEST 2021 is light rain
The weather on Mon Apr 19 11:00:00 AEST 2021 is clear sky
The weather on Tue Apr 20 11:00:00 AEST 2021 is clear sky
The weather on Wed Apr 21 11:00:00 AEST 2021 is light rain
The weather on Thu Apr 22 11:00:00 AEST 2021 is clear sky
The weather on Fri Apr 23 11:00:00 AEST 2021 is clear sky
The weather on Sat Apr 24 11:00:00 AEST 2021 is light rain

--- FINAL RESULTS ---
The Number of Days Predicted To Be Above 20 degree: 3
The Number of Days Predicted to be Sunny/Clear Sky: 4
```

Notes: If you have any issues with running or setup the project. Please send me an email to tdnam39@gmail.com
