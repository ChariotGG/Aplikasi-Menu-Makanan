package com.example.aplikasimenumakanan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MenuDetail extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_detail);

        ImageView img_gambar2 = findViewById(R.id.imgGambar);
        TextView txt_nama2 = findViewById(R.id.txtNama2);
        TextView txt_deskripsi2 = findViewById(R.id.txtDeskripsi2);
        TextView txt_harga2 = findViewById(R.id.txtHarga2);

        Intent intent = getIntent();

        int gambarMakanan = intent.getIntExtra("GAMBAR_DEFAULT", 0);
        String namaMakanan = intent.getStringExtra("NAMA_DEFAULT");
        String deskripsiMakanan = intent.getStringExtra("DESKRIPSI_DEFAULT");
        String hargaMakanan = intent.getStringExtra("HARGA_DEFAULT");

        img_gambar2.setImageResource(gambarMakanan);
        txt_nama2.setText(namaMakanan);
        txt_deskripsi2.setText(deskripsiMakanan);
        txt_harga2.setText(hargaMakanan);
    }
}