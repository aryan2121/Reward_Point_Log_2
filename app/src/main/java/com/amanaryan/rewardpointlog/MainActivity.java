package com.amanaryan.rewardpointlog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    RecyclerView recycl;
    String s1[],s2[],s3[],s4[],s5[],s6[],s7[],s8[],s9[],s10[],s11[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycl=findViewById(R.id.recyclevw);
        s1=new String[20];
        s2=new String[20];
        s3=new String[20];
        s4=new String[20];
        s5=new String[20];
        s6=new String[20];
        s8=new String[20];
        s9=new String[20];
        s10=new String[20];
        s11=new String[20];
        for(int i=0;i<20;i++){
            s1[i]="1";
            s2[i]=i+2+"";
            s3[i]=i+4+"";
            s6[i]="28";
            s8[i]="11";
            s9[i]="18";
            s4[i]="8";
            s5[i]="8";
            s10[i]=i+2+"";s11[i]="in";
        }


        s7=getResources().getStringArray(R.array.name);
        Myadapter myadapter= new Myadapter(this,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11);
        recycl.setAdapter(myadapter);
        recycl.setLayoutManager(new LinearLayoutManager(this));



    }



}