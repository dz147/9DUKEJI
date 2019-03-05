package com.nfit.jiudukeji.myConverter;

import org.springframework.format.Formatter;

import javax.swing.text.DateFormatter;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class MyDateFormatter implements Formatter<Date> {
    @Override
    public Date parse(String s, Locale locale) throws ParseException {
        return null;
    }

    @Override
    public String print(Date date, Locale locale) {
        return null;
    }
}
