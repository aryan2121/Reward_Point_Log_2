package com.amanaryan.rewardpointlog;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Myadapter extends RecyclerView.Adapter<Myadapter.MyViewHolder> {
    String data1[],data2[],data3[],data4[],data5[],data6[],data7[],data8[],data9[],data10[],data11[];
    Context context;
    public  Myadapter(Context ct,String s1[],String s2[],String s3[],String s4[],String s5[],String s6[],String s7[],String s8[],String s9[],String s10[],String s11[]){
        context=ct;
        data1=s1;
        data2=s2;
        data3=s3;
        data4=s4;
        data5=s5;
        data6=s6;
        data7=s7;
        data8=s8;
        data9=s9;
        data10=s10;
        data11=s11;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view= inflater.inflate(R.layout.recycletab,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.t1.setText(data7[position]);
        holder.t2.setText(data1[position]);
        holder.t3.setText(data2[position]);

        holder.t4.setText(data3[position]);
        holder.t5.setText(data4[position]);
        holder.t6.setText(data5[position]);
        holder.t7.setText(data6[position]);
        holder.t8.setText(data8[position]);
        holder.t9.setText(data9[position]);
        holder.t10.setText(data10[position]);
        holder.t11.setText(data11[position]);
        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                postData(data7[position],
                        data1[position],
                        data2[position],
                        data3[position],
                        data4[position],
                        data5[position],
                        data6[position],
                        data8[position],
                        data9[position],
                        data10[position],
                        data11[position]);
            }
        });

    }

    @Override
    public int getItemCount() {
        return data1.length;
    }



    public class MyViewHolder extends  RecyclerView.ViewHolder {
        TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
        Button btn;
        LinearLayout Tab;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            btn=itemView.findViewById(R.id.btn);
            t1=itemView.findViewById(R.id.textView1);
            t2=itemView.findViewById(R.id.textView2);
            t3=itemView.findViewById(R.id.textView3);
            t4=itemView.findViewById(R.id.textView4);
            t5=itemView.findViewById(R.id.textView5);
            t6=itemView.findViewById(R.id.textView6);
            t7=itemView.findViewById(R.id.textView7);
            t8=itemView.findViewById(R.id.textView8);
            t9=itemView.findViewById(R.id.textView9);
            t10=itemView.findViewById(R.id.textView10);
            t11=itemView.findViewById(R.id.textView11);

        }

    }

    private void postData(String s1, String s2,
                          String s3,String s4,
                          String s5,String s6,
                          String s7,String s8,
                          String s9,String s10,
                          String s11) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://blockchain.smartcookie.in/cgi-bin/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RetrofitAPI retrofitAPI = retrofit.create(RetrofitAPI.class);
        model model = new model(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11);
        Call<model> call = retrofitAPI.createPost(model);

        call.enqueue(new Callback<model>() { @Override
        public void onResponse(Call<model> call, Response<model> response) {
            // this method is called when we get response from our api.
            Toast.makeText(context, "Data added to API   ", Toast.LENGTH_LONG).show();

        }
            @Override
            public void onFailure(Call<com.amanaryan.rewardpointlog.model> call, Throwable t) {

                Toast.makeText(context, "Error found is : " + t.getMessage()+" CALL   : "+call.toString(), Toast.LENGTH_LONG).show();

        }
        });
    }
}