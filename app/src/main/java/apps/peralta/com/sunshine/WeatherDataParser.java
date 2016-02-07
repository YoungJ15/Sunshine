package apps.peralta.com.sunshine;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Josermando on 2/7/2016.
 */
public class WeatherDataParser {
    //Retrieve the maximum temperature for the day indicated by dayIndex

    public static double getMaxTemperatureForDay(String weatherJSONString,int dayIndex) throws JSONException{
        //Turn JSON String into JSON Object
        JSONObject weather = new JSONObject(weatherJSONString);
        //Look for the list Array
        JSONArray days = weather.getJSONArray("list");
        //Within the array we look for the day we care about
        JSONObject dayInfo = days.getJSONObject(dayIndex);
        //We look for the temperature
        JSONObject temperatureInfo = dayInfo.getJSONObject("temp");
        //Return the max temperature
        return temperatureInfo.getDouble("max");

    }
}
