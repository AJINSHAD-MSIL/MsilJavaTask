package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.List;
import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerItems extends RecyclerView.Adapter<RecyclerItems.ViewHolder> {

    List<User> profileDatas;
    Context context;

    RecyclerItems(Context context,List<User> users) {
        this.context = context;

        this.profileDatas = users;

    }
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.recycleritems, parent, false);
        return new ViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.candidate_name.setText(profileDatas.get(position).getId());
        holder.user_name.setText(profileDatas.get(position).getName());
        holder.dob.setText(profileDatas.get(position).getDob());
        holder.email.setText(profileDatas.get(position).getEmail());
        holder.address.setText(profileDatas.get(position).getAddress());
        holder.gender.setText(profileDatas.get(position).getGender());
        holder.home_number.setText(profileDatas.get(position).getPhone().getHome());
        holder.mobile_number.setText(profileDatas.get(position).getPhone().getMobile());
        holder.officenumber.setText(profileDatas.get(position).getPhone().getOffice());
        Glide.with(context).load(profileDatas.get(position).getImage()).into(holder.profile_image);
    }

    @Override
    public int getItemCount() {
       return profileDatas.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        CircleImageView profile_image;
        TextView candidate_name;
        TextView dob;
        TextView ids;
        TextView email;
        TextView address;
        TextView gender;
        TextView home_number;
        TextView mobile_number;
        TextView officenumber;
        TextView user_name;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

             this.profile_image = itemView.findViewById(R.id.profile_image);
            this.user_name = itemView.findViewById(R.id.user_name);
            this.candidate_name = itemView.findViewById(R.id.candidate_name);
             this.dob = itemView.findViewById(R.id.d_o_b);
             this.email = itemView.findViewById(R.id.emails);
             this.address = itemView.findViewById(R.id.Adresses);
             this.gender = itemView.findViewById(R.id.genders);
             this.home_number = itemView.findViewById(R.id.landPhone);
             this.mobile_number = itemView.findViewById(R.id.mobile_number);
             this.officenumber = itemView.findViewById(R.id.OfficePhone);

        }
    }


}
