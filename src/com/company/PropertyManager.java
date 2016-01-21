package com.company;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * Created by Ira on 15.01.2016.
 */
public class PropertyManager {
    private ResourceBundle bundle;

    public PropertyManager() {
    }

    public boolean init(String bundleName){
        try{
            bundle = ResourceBundle.getBundle(bundleName);
            return true;
        }catch(MissingResourceException e){
            System.out.println(e.getMessage());

        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }

        return false;
    }



    public String getValue(String key) {
        try{
            String strKey = bundle.getString(key);
            return strKey;
        }catch (MissingResourceException e){
            System.out.println("Key does not found");
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
