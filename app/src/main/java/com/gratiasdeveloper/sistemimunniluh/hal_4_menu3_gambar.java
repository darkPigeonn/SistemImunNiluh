package com.gratiasdeveloper.sistemimunniluh;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.gratiasdeveloper.sistemimunniluh.GridFoto.DataForo;
import com.gratiasdeveloper.sistemimunniluh.GridFoto.Foto;
import com.gratiasdeveloper.sistemimunniluh.GridFoto.GridFotoAdapater;
import com.gratiasdeveloper.sistemimunniluh.GridFoto.ViewGambar;

import java.util.ArrayList;

public class hal_4_menu3_gambar extends AppCompatActivity {
    ImageButton home_imun, back;

    private RecyclerView rvHeroes;
    private ArrayList<Foto> list = new ArrayList<>();
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_4_menu3_gambar);

        rvHeroes = findViewById(R.id.rv_heroes);
        rvHeroes.setHasFixedSize(true);

        list.addAll(DataForo.getListData());
        showRecyclerList();
//        home_imun.findViewById(R.id.btnhome);
//        back.findViewById(R.id.btnbck);
//
//        home_imun.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(hal_4_menu3_gambar.this, hal_3_menu2.class);
//                startActivity(intent);
//                finish();
//            }
//        });
//
//        back.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(hal_4_menu3_gambar.this, hal_4_menu3.class);
//                startActivity(intent);
//                finish();
//            }
//        });
    }

    private void showRecyclerList() {
        rvHeroes.setLayoutManager(new GridLayoutManager(this,2));
        GridFotoAdapater listHeroAdapter = new GridFotoAdapater(list);
        rvHeroes.setAdapter(listHeroAdapter);

        listHeroAdapter.setOnItemClickCallback(new GridFotoAdapater.OnItemClickCallback() {
            @Override
            public void onItemClicked(int position) {
               showSelectedHero(position);
               Intent i = new Intent(hal_4_menu3_gambar.this, ViewGambar.class);
               i.putExtra("position",position);
               startActivity(i);
            }
        });
    }
    private void showSelectedHero(int foto) {

    }
}