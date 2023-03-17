package com.ahmfarisi.aplikasiagenda;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterAgenda {

    public class VHAgenda extends RecyclerView.ViewHolder{
        TextView tvTanggal, tvJam, tvKegiatan;

        public VHAgenda(@NonNull View itemView) {
            super(itemView);
            tvTanggal = itemView.findViewById(R.id.tv_tanggal);
            tvJam = itemView.findViewById(R.id.tv_jam);
            tvKegiatan = itemView.findViewById(R.id.tv_kegiatan);

        }
    }

}
