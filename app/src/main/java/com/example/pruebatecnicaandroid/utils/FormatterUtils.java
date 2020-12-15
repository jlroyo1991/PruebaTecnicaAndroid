package com.example.pruebatecnicaandroid.utils;

public final class FormatterUtils {

    /**
     * Format string to concatenate data to create the flckr url
     *
     * @return Formatted string
     */
    public static String formatUrl(Long farm, String server, String id, String secret) {
        return "https://farm" + farm + ".staticflickr.com/" + server + '/' + id + '_' + secret + ".jpg\n";
    }

}