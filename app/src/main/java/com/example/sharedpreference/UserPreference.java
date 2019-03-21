package com.example.sharedpreference;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;

public class UserPreference {

    private static final String EMPLOYEE = "employee";
    private static final String USER_EMAIL = "email";
    private static final String USER_PASS = "pass";
    private static final String USER_DEFAULT_DATA = "No Data Found";
    private Context context;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    public UserPreference(Context context){

        this.context = context;
        sharedPreferences = context.getSharedPreferences("User",Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }


    public void  saveUser(String email, String pass){

        editor.putString(USER_EMAIL, email);
        editor.putString(USER_PASS, pass);
        editor.commit();
        //To Store Object inside shared Preference
        Employee employee = new Employee("Md Belal", "Manager", 258258258);
        //Create Gson Object to convert object into string. Gson Library must have to added inside build.gradle(Module) file
        Gson gson = new Gson();
        String objToJson = gson.toJson(employee);
        editor.putString(EMPLOYEE, objToJson);
        editor.commit();
    }

    public String showEmail(){
        return sharedPreferences.getString(USER_EMAIL, USER_DEFAULT_DATA);
    }

    public String showPass(){
        return sharedPreferences.getString(USER_PASS, USER_DEFAULT_DATA);
    }

    public void resetUser(){
        editor.clear();
        editor.commit();
    }

    public Employee getEmployee(){
        String jsonData = sharedPreferences.getString(EMPLOYEE, USER_DEFAULT_DATA);
        Gson gson = new Gson();
        Employee jsonToObj = gson.fromJson(jsonData, Employee.class);
        return jsonToObj;
    }

}
