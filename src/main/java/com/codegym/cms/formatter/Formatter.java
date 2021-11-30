package com.codegym.cms.formatter;

import java.text.ParseException;
import java.util.Locale;

public interface Formatter<T> {
    T parse(String t, Locale locale) throws ParseException;
    String  print(T t, Locale locale);
}
