package com.example.sharedpreference;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvData;
    private EditText etEmail, etPass;
    private UserPreference userPreference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvData = findViewById(R.id.textViewData);
        etEmail = findViewById(R.id.editTextEmail);
        etPass = findViewById(R.id.editTextPassword);
        userPreference = new UserPreference(this);
    }


    public void login(View v){

        String email = etEmail.getText().toString();
        String pass =  etPass.getText().toString();
        userPreference.saveUser(email, pass);

    }

    public void showData(View v){
       tvData.setText(userPreference.showEmail() + "\n" + userPreference.showPass() + "\n\n" +
                userPreference.getEmployee().getEmployeeName() + "\n" +
                userPreference.getEmployee().getEmployeeDesignation() + "\n" +
                userPreference.getEmployee().getEmployeePhoone() + "\n"

               );
    }

    public void reset(View v){
        userPreference.resetUser();
    }
}
