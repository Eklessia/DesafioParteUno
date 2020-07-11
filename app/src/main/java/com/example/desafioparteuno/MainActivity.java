package com.example.desafioparteuno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView ivLogo;
    private EditText etUserName;
    private EditText etPass;
    private Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ivLogo = findViewById(R.id.ivLogo);
        etUserName = findViewById(R.id.etUserName);
        etPass = findViewById(R.id.etPass);
        btnEntrar = findViewById(R.id.btnEntrar);



        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                "Usuario Ingresado con éxito", Toast.LENGTH_SHORT);

                toast1.show();
            }
        });

        Picasso.get().load("https://blog.desafiolatam.com/wp-content/uploads/2019/02/logo.png").into(ivLogo);



    }
}