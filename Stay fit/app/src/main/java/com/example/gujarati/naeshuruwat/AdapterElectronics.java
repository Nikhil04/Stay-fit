package com.example.gujarati.naeshuruwat;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.Collections;
import java.util.List;

public class AdapterElectronics extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private LayoutInflater inflater;
    List<DataElectronics> data= Collections.emptyList();
    DataElectronics current;
    int currentPos=0;

    // create constructor to innitilize context and data sent from MainActivity
    public AdapterElectronics(Context context, List<DataElectronics> data){
        this.context=context;
        inflater= LayoutInflater.from(context);
        this.data=data;
    }

    // Inflate the layout when viewholder created
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.container_electronics, parent,false);
        MyHolder holder=new MyHolder(view);
        return holder;
    }

    // Bind data
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {


        // Get current position of item in recyclerview to bind data and assign values from list
        MyHolder myHolder= (MyHolder) holder;
        current=data.get(position);
        Log.d("TAG","holder result"+current.dataImage+" "+current.dataname+""+""+current.dataprice+""+current.datawarranty+""+
                current.dataquantity+""+current.datadesc);
        myHolder.holderName.setText("Name: " +current.dataname);
        myHolder.holderPrice.setText("Price: " +current.dataprice);
        myHolder.holderQuantity.setText("Quantity: " +current.dataquantity);
        //  myHolder.holderWarranty.setText("Warranty: " +current.datawarranty);
        //  myHolder.holderDescription.setText("Description: " +current.datadesc);
        Log.d("TAG2",current.dataImage);
// load image into imageview using glide
        Picasso.with(context).load(current.dataImage)

                .into(myHolder.holderimg);
        ((MyHolder) holder).holderimg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            /*    Intent intent = new Intent(v.getContext(),LE.class);
                intent.putExtra("name",data.get(position).dataname);
                intent.putExtra("price",data.get(position).dataprice);
                intent.putExtra("quantity",data.get(position).dataquantity);
                intent.putExtra("warranty",data.get(position).datawarranty);
                intent.putExtra("description",data.get(position).datadesc);
                intent.putExtra("img",data.get(position).dataImage);

                v.getContext().startActivity(intent);*/
            }
        });
        ((MyHolder) holder).purchase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  Intent intent=new Intent(v.getContext(),Payment.class);
               // v.getContext().startActivity(intent);
            }
        });
        animate(holder);


    }

    // return total item from List
    @Override
    public int getItemCount() {
        return data.size();
    }


    class MyHolder extends RecyclerView.ViewHolder{

        TextView holderName;
        TextView holderPrice;
        TextView holderWarranty;
        TextView holderQuantity;
        TextView holderDescription;
        ImageView holderimg;
        Button purchase;



        // create constructor to get widget reference
        public MyHolder(View itemView) {
            super(itemView);
            holderName= (TextView) itemView.findViewById(R.id.containername);
            holderPrice= (TextView) itemView.findViewById(R.id.containerprice);
            holderQuantity= (TextView) itemView.findViewById(R.id.containerquantity);
            // holderWarranty= (TextView) itemView.findViewById(R.id.containerwarranty);
            // holderDescription = (TextView) itemView.findViewById(R.id.containerdescription);
            holderimg= (ImageView) itemView.findViewById(R.id.containerimage);
            //
            purchase= (Button) itemView.findViewById(R.id.purchase);
        }

    }
    public void animate(RecyclerView.ViewHolder viewHolder) {
        final Animation animAnticipateOvershoot = AnimationUtils.loadAnimation(context, R.anim.anticipate_overshoot_interpolator);
        viewHolder.itemView.setAnimation(animAnticipateOvershoot);
    }



}




