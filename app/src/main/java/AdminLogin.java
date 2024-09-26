package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AdminLoginActivity extends AppCompatActivity {

    private EditText emailInput, passwordInput;
    private Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        // Initialize input fields
        emailInput = findViewById(R.id.adminEmailLoginInput);
        passwordInput = findViewById(R.id.adminPasswordLoginInput);

        // Initialize login button
        loginBtn = findViewById(R.id.adminLoginBtn);

        // Set up onClickListener for the login button
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginAdmin();
            }
        });
    }

    private void loginAdmin() {
        String email = emailInput.getText().toString();
        String password = passwordInput.getText().toString();

        // Basic validation
        if (TextUtils.isEmpty(email)) {
            emailInput.setError("Email is required");
            return;
        }

        if (TextUtils.isEmpty(password)) {
            passwordInput.setError("Password is required");
            return;
        }

        // You can add logic to authenticate the admin
        if (email.equals("admin@example.com") && password.equals("admin123")) {
            // Admin is authenticated, proceed to the Admin dashboard
            Toast.makeText(AdminLoginActivity.this, "Login successful", Toast.LENGTH_SHORT).show();

            // Redirect to Admin Dashboard (replace `AdminDashboardActivity.class` with your dashboard activity)
            Intent intent = new Intent(AdminLoginActivity.this, AdminDashboardActivity.class);
            startActivity(intent);
            finish();
        } else {
            // If login fails, show a toast message
            Toast.makeText(AdminLoginActivity.this, "Invalid email or password", Toast.LENGTH_SHORT).show();
        }
    }
}
