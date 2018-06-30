package com.my.hacksaude.viewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.my.hacksaude.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class MedicViewHolder extends RecyclerView.ViewHolder {
    public TextView title;
    public TextView crm;
    public CircleImageView profileImg;


    public MedicViewHolder(View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.main_line_title);
        crm = itemView.findViewById(R.id.crm);
        profileImg = itemView.findViewById(R.id.profile_image);
    }
}
