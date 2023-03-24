package com.ahmfarisi.aplikasiagenda;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterAgenda extends RecyclerView.Adapter<AdapterAgenda.VHAgenda> {
    private Context ctx;
    private ArrayList arrId, arrTanggal, arrJam, arrKegiatan;

    public AdapterAgenda(Context ctx,ArrayList arrId, ArrayList arrTanggal, ArrayList arrJam, ArrayList arrKegiatan) {
        this.ctx = ctx;
        this.arrId = arrId;
        this.arrTanggal = arrTanggal;
        this.arrJam = arrJam;
        this.arrKegiatan = arrKegiatan;
    }

    @NonNull
    @Override
    public VHAgenda onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View varView = LayoutInflater.from(ctx).inflate(R.layout.list_item_agenda, parent, false);
        return new VHAgenda(varView);
    }

    @Override
    public void onBindViewHolder(@NonNull VHAgenda holder, int position) {
        holder.tvId.setText(arrId.get(position).toString());
        holder.tvTanggal.setText(arrTanggal.get(position).toString());
        holder.tvJam.setText(arrJam.get(position).toString());
        holder.tvKegiatan.setText(arrKegiatan.get(position).toString());
    }

    @Override
    public int getItemCount() {
        return arrKegiatan.size();
    }

    public class VHAgenda extends RecyclerView.ViewHolder {
        TextView tvId,tvTanggal, tvJam, tvKegiatan;

        public VHAgenda(@NonNull View itemView) {
            super(itemView);
            tvId = itemView.findViewById(R.id.tv_id);
            tvTanggal = itemView.findViewById(R.id.tv_tanggal);
            tvJam = itemView.findViewById(R.id.tv_jam);
            tvKegiatan = itemView.findViewById(R.id.tv_kegiatan);

            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    AlertDialog.Builder pesan = new AlertDialog.Builder(ctx);
                    pesan.setTitle("Perhatian ");
                    pesan.setMessage("anda memilih agenda degngan ID "+ tvId.getText().toString()+ "perintah apa yang anda inginkan?");
                    pesan.setCancelable(true);

                    pesan.setNegativeButton("Hapus", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });

                    pesan.setPositiveButton("Ubah", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });

                    pesan.show();
                    return false;

                }
            });
        }
    }

}
