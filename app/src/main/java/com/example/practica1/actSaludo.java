package com.example.practica1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

public class actSaludo extends AppCompatActivity {
    private TextView txtSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.enableEdgeToEdge(getWindow());
        setContentView(R.layout.act_saludo);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.mainSaludo), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        txtSaludo = findViewById(R.id.txtSaludo);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            txtSaludo.setText("Hola!, Bienvenida \n " + bundle.getString("NOMBRE"));
        }
    }
}