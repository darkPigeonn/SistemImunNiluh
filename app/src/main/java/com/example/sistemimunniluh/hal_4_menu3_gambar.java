package com.example.sistemimunniluh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sistemimunniluh.GridFoto.DataForo;
import com.example.sistemimunniluh.GridFoto.Foto;
import com.example.sistemimunniluh.GridFoto.GridFotoAdapater;

import java.util.ArrayList;

public class hal_4_menu3_gambar extends AppCompatActivity {
    Button home_imun, back;
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
    }

    private void showRecyclerList() {

//        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
//        GridFotoAdapater listHeroAdapter = new GridFotoAdapater(list);
//        rvHeroes.setAdapter(listHeroAdapter);

        rvHeroes.setLayoutManager(new GridLayoutManager(this, 2));
        GridFotoAdapater gridHeroAdapter = new GridFotoAdapater(list);
        rvHeroes.setAdapter(gridHeroAdapter);
    }
}