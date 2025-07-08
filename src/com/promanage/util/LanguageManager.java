package com.promanage.util;

import java.util.*;

public class LanguageManager {
    private static Locale currentLocale = new Locale("en", "US");
    private static ResourceBundle resourceBundle;

    static {
        loadBundle();
    }

    public static void setLocale(Locale locale) {
        currentLocale = locale;
        loadBundle();
    }

    public static ResourceBundle getBundle() {
        return resourceBundle;
    }

    public static Locale getCurrentLocale() {
        return currentLocale;
    }

    private static void loadBundle() {
        try {
            resourceBundle = ResourceBundle.getBundle("com.promanage.i18n.Bundle", currentLocale, new CustomControl());
        } catch (MissingResourceException e) {
            System.err.println("❌ ResourceBundle tidak ditemukan: " + e.getMessage());
        }
    }

    // 🔄 Kelas kontrol untuk memetakan ke Bundle_in_ID.properties
    private static class CustomControl extends ResourceBundle.Control {
        @Override
        public List<Locale> getCandidateLocales(String baseName, Locale locale) {
            if ("id".equals(locale.getLanguage()) && "ID".equals(locale.getCountry())) {
                // Prioritaskan nama file yang kamu mau
                return Arrays.asList(
                    new Locale("in", "ID"), // sesuai nama file kamu: Bundle_in_ID.properties
                    Locale.ROOT
                );
            }
            return super.getCandidateLocales(baseName, locale);
        }

        @Override
        public String toBundleName(String baseName, Locale locale) {
            if ("in".equals(locale.getLanguage()) && "ID".equals(locale.getCountry())) {
                return baseName + "_in_ID";
            }
            return super.toBundleName(baseName, locale);
        }
    }
}
