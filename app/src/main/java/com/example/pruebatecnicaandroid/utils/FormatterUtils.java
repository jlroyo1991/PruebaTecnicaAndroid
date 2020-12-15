package com.example.pruebatecnicaandroid.utils;

import android.text.format.DateFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public final class FormatterUtils {

    /**
     * Format string to concatenate data to create the flckr url
     *
     * @return Formatted string
     */
    public static String formatUrl(Long farm, String server, String id, String secret) {
        return "https://farm" + farm + ".staticflickr.com/" + server + '/' + id + '_' + secret + ".jpg\n";
    }

    public static String getDate(long time) {
        Calendar cal = Calendar.getInstance(Locale.FRANCE);
        cal.setTimeInMillis(time * 1000);
        String date = DateFormat.format("dd-MM-yyyy", cal).toString();
        return date;
    }
}