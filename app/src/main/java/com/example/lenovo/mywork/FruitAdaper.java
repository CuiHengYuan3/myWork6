//package com.example.lenovo.mywork;
//
//import android.support.annotation.NonNull;
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import java.util.List;
//
//public class FruitAdaper extends RecyclerView.Adapter< FruitAdaper.ViewHolder>{
//private List<fruit> mFruitList;
//static  class ViewHolder extends RecyclerView.ViewHolder{
//    ImageView fruitImage;
//    TextView fruitname;
//
//    public ViewHolder( View view) {
//        super(view);
//    fruitImage=view.findViewById(R.id.fruit_image);
//    fruitname=view.findViewById(R.id.fruit_name);
//    }
//}
//
//public  FruitAdaper (List<fruit> fruitList){
//    mFruitList=fruitList;
//}
//public ViewHolder onCreateViewHolder(ViewGroup parent ,int viewtype){
//    View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.fruit_item,parent,false);
//    ViewHolder holder=new ViewHolder(view);
//    return  holder;
//}
//public  void  onBindViewHolder(ViewHolder holder,int position){
//    fruit fruit=mFruitList.get(position);
//    holder.fruitImage.setImageResource(fruit.getImageid() );
//holder.fruitname.setText(fruit.getName());
//}
//public int getItemCount(){
//    return mFruitList.size();
//}
//
//}
