package com.example.recyclermonths;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MonthsAdapter extends RecyclerView.Adapter<MonthsAdapter.MonthsViewHolder> {
    private ArrayList<String> rvMonthsDataSourceList;

    public MonthsAdapter(ArrayList<String> monthsList) {
        this.rvMonthsDataSourceList = monthsList;
    }

    public class MonthsViewHolder extends RecyclerView.ViewHolder {
        private TextView txtMonth;

        public MonthsViewHolder(View itemView) {
            super(itemView);
            this.txtMonth = (TextView) itemView;

        }
    }

    @Override
    public int getItemCount() {
        if (rvMonthsDataSourceList == null) {
            return 0;
        }
        return rvMonthsDataSourceList.size();

    }

    @NonNull
    @Override
    public MonthsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        TextView txtMonth=new TextView(parent.getContext());
        txtMonth.setLayoutParams(
                new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        txtMonth.setPadding(20,10,10,20);
        txtMonth.setTextSize(30);
        txtMonth.setTextColor(Color.BLACK);
        return new MonthsViewHolder(txtMonth);
    }

    @Override
    public void onBindViewHolder(@NonNull MonthsViewHolder holder, int position) {
        holder.txtMonth.setText(rvMonthsDataSourceList.get(position));
    }
}