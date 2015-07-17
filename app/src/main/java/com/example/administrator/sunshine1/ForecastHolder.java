package com.example.administrator.sunshine1;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Administrator on 2015-07-18.
 */
public class ForecastHolder extends RecyclerView.ViewHolder {
    public TextView textView;
    public ForecastHolder(View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.list_item_forecast_textview);
    }
}
