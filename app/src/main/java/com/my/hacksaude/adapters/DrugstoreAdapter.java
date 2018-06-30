package com.my.hacksaude.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.my.hacksaude.R;
import com.my.hacksaude.model.Medic;
import com.my.hacksaude.viewHolder.MedicViewHolder;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class DrugstoreAdapter extends RecyclerView.Adapter<MedicViewHolder> {

    private final List<Medic> mFarmacies;

    public DrugstoreAdapter(ArrayList farmacies) {
        mFarmacies = farmacies;
    }

    @Override
    public MedicViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MedicViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_farmacy, parent, false));
    }

    @Override
    public void onBindViewHolder(MedicViewHolder holder, int position) {
        holder.title.setText(String.format(Locale.getDefault(), "%s", mFarmacies.get(position).name));
        holder.profileImg.setImageResource(mFarmacies.get(position).profileImage);
        holder.crm.setText(String.format("CRM: %s", mFarmacies.get(position).crm));
//        holder.moreButton.setOnClickListener(view -> updateItem(position));
//        holder.deleteButton.setOnClickListener(view -> removerItem(position));
    }

    @Override
    public int getItemCount() {
        return mFarmacies != null ? mFarmacies.size() : 0;
    }

}