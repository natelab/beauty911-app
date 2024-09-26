package com.example.app;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterAdminActivity extends AppCompatActivity {

    private EditText firstNameInput, lastNameInput, emailInput, phoneInput, passwordInput;
    private Button registerAdminBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_admin);

        // Initialize input fields
        firstNameInput = findViewById(R.id.adminFirstNameInput);
        lastNameInput = findViewById(R.id.adminLastNameInput);
        emailInput = findViewById(R.id.adminEmailInput);
        phoneInput = findViewById(R.id.adminPhoneInput);
        passwordInput = findViewById(R.id.adminPasswordInput);

        // Initialize register button
        registerAdminBtn = findViewById(R.id.registerAdminBtn);

        // Set up onClickListener for the register button
        registerAdminBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerAdmin();
            }
        });
    }

    private void registerAdmin() {
        String firstName = firstNameInput.getText().toString();
        String lastName = lastNameInput.getText().toString();
        String email = emailInput.getText().toString();
        String phone = phoneInput.getText().toString();
        String password = passwordInput.getText().toString();

        // Basic validation
        if (TextUtils.isEmpty(firstName)) {
            firstNameInput.setError("First name is required");
            return;
        }

        if (TextUtils.isEmpty(lastName)) {
            lastNameInput.setError("Last name is required");
            return;
        }

        if (TextUtils.isEmpty(email)) {
            emailInput.setError("Email is required");
            return;
        }

        if (TextUtils.isEmpty(phone)) {
            phoneInput.setError("Phone number is required");
            return;
        }

        if (TextUtils.isEmpty(password)) {
            passwordInput.setError("Password is required");
            return;
        }

        // Here you can add logic to store the admin in your database
        Toast.makeText(RegisterAdminActivity.this, "Admin registered successfully", Toast.LENGTH_SHORT).show();

        // After registering, you can finish the activity or redirect the admin to another screen
        finish();  // End the activity after registration
    }
}
