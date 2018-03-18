package com.ivan.exercise;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.ivan.exercise.data.Accessory;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AccessoryViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.txt_name) TextView txtName;
    @BindView(R.id.txt_description) TextView txtDescription;
    @BindView(R.id.img_item) ImageView imgItem;
    @BindView(R.id.btn_like) Button btnLike;

    private Accessory dataItem;

    public AccessoryViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        this.dataItem.setLiked(true);
    }

    @OnClick(R.id.btn_like)
    public void onLikeClicked(){
        this.btnLike.setEnabled(false);
    }

    public void setData(Accessory item) {
        this.dataItem = item;
        this.txtName.setText(item.getName());
        this.txtDescription.setText(item.getDescription());
        this.btnLike.setEnabled(!item.isLiked());
        Picasso.get().load(item.getImageUrl()).into(this.imgItem);
    }
}
