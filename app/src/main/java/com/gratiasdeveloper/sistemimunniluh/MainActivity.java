package com.gratiasdeveloper.sistemimunniluh;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.gratiasdeveloper.sistemimunniluh.Chat.MainActivity_Chat;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
        private  Button add_room;
        private  EditText room_name;
        private ListView listView;
        private String name;
        private String id;
        private DatabaseReference root = FirebaseDatabase.getInstance().getReference().getRoot();

        private ArrayAdapter<String> arrayAdapter;
        private ArrayList<String> list_of_rooms = new ArrayList();
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            add_room = (Button)findViewById(R.id.btnAdd_room);
            room_name = (EditText)findViewById(R.id.etNeme_room);
            listView = (ListView)findViewById(R.id.listView);

            arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list_of_rooms);
            listView.setAdapter(arrayAdapter);

            request_user_name();
            request_user_id();
            add_room.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
//
                    if (TextUtils.isEmpty(room_name.getText())){
                        Toast.makeText(MainActivity.this, "Silahkan tulis terlebih dahulu topik diskusinya!", Toast.LENGTH_SHORT).show();
                    }else{
                        Map<String,Object> map = new HashMap<String,Object>();
                        map.put(room_name.getText().toString(),"");
                        root.updateChildren(map);
                    }


                }
            });
            root.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Set<String> set = new HashSet<String>();
                    Iterator i = dataSnapshot.getChildren().iterator();
                    while ( i.hasNext())
                    {
                        set.add(((DataSnapshot)i.next()).getKey());
                    }
                    list_of_rooms.clear();
                    list_of_rooms.addAll(set);

                    arrayAdapter.notifyDataSetChanged();
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent I = new Intent(getApplicationContext(), MainActivity_Chat.class);
                    I.putExtra("room_name",((TextView)view).getText().toString());
                    I.putExtra("id_user",id);
                    I.putExtra("user_name",name);
                    startActivity(I);
                }
            });

        }

        private void request_user_name() {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Masukan Nama");
            final EditText input_field = new EditText(this);
            builder.setView(input_field);
            builder.setPositiveButton("OK ", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    name = input_field.getText().toString();

                    if(name.isEmpty()){
                        dialogInterface.cancel();
                        request_user_name();
                    }
                }
            });
            builder.setNegativeButton("Batal", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                    request_user_name();
                }
            });
            builder.show();
        }

    private void request_user_id() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Masukan Nomor Siswa");
        EditText input_field = new EditText(this);
        input_field.setInputType(InputType.TYPE_CLASS_NUMBER);
        //input_field.setTransformationMethod(.getInstance());
        builder.setView(input_field);

        builder.setPositiveButton("OK ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                id = input_field.getText().toString();

                if (id.isEmpty()){
                    dialogInterface.cancel();
                    request_user_id();
                }
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
                request_user_id();
            }
        });
        builder.show();
    }


}