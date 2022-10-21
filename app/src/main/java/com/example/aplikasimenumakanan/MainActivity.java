package com.example.aplikasimenumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recKuliner;
    private ArrayList<Kuliner> listKuliner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recKuliner = findViewById(R.id.rec_kuliner);
        initData();

        recKuliner.setAdapter(new KulinerAdapter(listKuliner));
        recKuliner.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData(){
        this.listKuliner = new ArrayList<>();
        listKuliner.add(new Kuliner("Pecel Lele", "15.000", R.drawable.pecel_lele));
        listKuliner.add(new Kuliner("Nasi Goreng Mercon", "14.500", R.drawable.nasi_goreng_mercon));
        listKuliner.add(new Kuliner("Ayam Geprek Keju", "20.000", R.drawable.ayam_geprek_keju));
        listKuliner.add(new Kuliner("Kari Ayam", "17.500", R.drawable.kari_ayam));
        listKuliner.add(new Kuliner("Tahu Bulat", "500", R.drawable.tahu_bulat));
        listKuliner.add(new Kuliner("Salad Buah", "12.000", R.drawable.salad_buah));
    }
}