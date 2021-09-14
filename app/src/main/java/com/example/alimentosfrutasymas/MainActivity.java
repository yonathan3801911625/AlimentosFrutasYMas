package com.example.alimentosfrutasymas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageButton btnAdmin;
    private ImageButton btnProduc;
    private ImageButton btnVent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAdmin=findViewById(R.id.imgBAdministrativo);
        btnProduc=findViewById(R.id.imgBProducto);
        btnVent=findViewById(R.id.imgBVenta);
        btnAdmin.setOnClickListener(this);
        btnProduc.setOnClickListener(this);
        btnVent.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId())
        {
            case R.id.imgBAdministrativo:
                Toast.makeText(this, "Loading Administrativo",Toast.LENGTH_SHORT).show();
                intent = new Intent(this, Administrativo.class);
                startActivity(intent);
                break;
            case R.id.imgBProducto:
                Toast.makeText(this,"Loading Producto", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, Producto.class);
                startActivity(intent);
                break;
            case R.id.imgBVenta:
                Toast.makeText(this,"Loading Venta", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, Venta.class);
                startActivity(intent);
                break;
        }
    }
}