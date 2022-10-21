package com.example.aplikasimenumakanan;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class KulinerAdapter extends RecyclerView.Adapter<KulinerAdapter.ViewHolder> {

    ViewHolder holder;

    public KulinerAdapter(ArrayList<Kuliner> listKuliner) {
        this.listKuliner = listKuliner;
    }

    private ArrayList<Kuliner> listKuliner;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewHolder holder =  new ViewHolder(inflater.inflate(R.layout.item_kuliner, parent, false));

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Kuliner kuliner = listKuliner.get(position);
        holder.txtNama.setText(kuliner.getNama());
        holder.txtHarga.setText(kuliner.getHarga());
        holder.imgGambar.setImageResource(kuliner.getImgGambar());



        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (listKuliner.get(position).getNama().equals("Pecel Lele")) {
                    Intent intent = new Intent(holder.itemView.getContext(), MenuDetail.class);
                    intent.putExtra("GAMBAR_DEFAULT", R.drawable.pecel_lele);
                    intent.putExtra("NAMA_DEFAULT", "Pecel Lele");
                    intent.putExtra("DESKRIPSI_DEFAULT", "Lele Goreng + Sambel ??? Nikmat Dunia");
                    intent.putExtra("HARGA_DEFAULT", "16.000");
                    holder.itemView.getContext().startActivity(intent);
                }
                if (listKuliner.get(position).getNama().equals("Ayam Geprek Keju")) {
                    Intent intent = new Intent(holder.itemView.getContext(), MenuDetail.class);
                    intent.putExtra("GAMBAR_DEFAULT", R.drawable.ayam_geprek_keju);
                    intent.putExtra("NAMA_DEFAULT", "Ayam Geprek Keju");
                    intent.putExtra("DESKRIPSI_DEFAULT", "Ayam Digeprek Dikasih Keju");
                    intent.putExtra("HARGA_DEFAULT", "20.000");
                    holder.itemView.getContext().startActivity(intent);
                }
                if (listKuliner.get(position).getNama().equals("Kari Ayam")) {
                    Intent intent = new Intent(holder.itemView.getContext(), MenuDetail.class);
                    intent.putExtra("GAMBAR_DEFAULT", R.drawable.kari_ayam);
                    intent.putExtra("NAMA_DEFAULT", "Kari Ayam");
                    intent.putExtra("DESKRIPSI_DEFAULT", "Ayam Dengan Bumbu Kari Khas India");
                    intent.putExtra("HARGA_DEFAULT", "17.500");
                    holder.itemView.getContext().startActivity(intent);
                }
                if (listKuliner.get(position).getNama().equals("Nasi Goreng Mercon")) {
                    Intent intent = new Intent(holder.itemView.getContext(), MenuDetail.class);
                    intent.putExtra("GAMBAR_DEFAULT", R.drawable.nasi_goreng_mercon);
                    intent.putExtra("NAMA_DEFAULT", "Nasi Goreng Mercon");
                    intent.putExtra("DESKRIPSI_DEFAULT", "Nasi Goreng Mercon Hot Jeletot");
                    intent.putExtra("HARGA_DEFAULT", "14.500");
                    holder.itemView.getContext().startActivity(intent);
                }
                if (listKuliner.get(position).getNama().equals("Salad Buah")) {
                    Intent intent = new Intent(holder.itemView.getContext(), MenuDetail.class);
                    intent.putExtra("GAMBAR_DEFAULT", R.drawable.salad_buah);
                    intent.putExtra("NAMA_DEFAULT", "Salad Buah");
                    intent.putExtra("DESKRIPSI_DEFAULT", "Dengan Campuran Dari Berbagai Buah, Dijamin Ingin Nambah");
                    intent.putExtra("HARGA_DEFAULT", "12.000");
                    holder.itemView.getContext().startActivity(intent);
                }
                if (listKuliner.get(position).getNama().equals("Tahu Bulat")) {
                    Intent intent = new Intent(holder.itemView.getContext(), MenuDetail.class);
                    intent.putExtra("GAMBAR_DEFAULT", R.drawable.tahu_bulat);
                    intent.putExtra("NAMA_DEFAULT", "Tahu Bulat");
                    intent.putExtra("DESKRIPSI_DEFAULT", "Sebenernya Tahu Biasa, Tapi Bentuknya Bulat");
                    intent.putExtra("HARGA_DEFAULT", "500");
                    holder.itemView.getContext().startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return listKuliner.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txtNama, txtHarga;
        public ImageView imgGambar;
        public ConstraintLayout itemView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNama = (TextView) itemView.findViewById(R.id.txtNama2);
            txtHarga = (TextView) itemView.findViewById(R.id.txtHarga2);
            imgGambar = (ImageView) itemView.findViewById(R.id.imgGambar);
            this.itemView = (ConstraintLayout) itemView.findViewById(R.id.mainLayout);
        }
    }
}
