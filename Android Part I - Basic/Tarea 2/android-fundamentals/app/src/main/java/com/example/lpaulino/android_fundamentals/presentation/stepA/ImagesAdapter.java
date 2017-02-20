package com.example.lpaulino.android_fundamentals.presentation.stepA;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.lpaulino.android_fundamentals.R;

import java.util.List;

/**
 * Created by lpaulino on 18/01/17.
 */

public class ImagesAdapter extends BaseAdapter {

    private Context mContext;
    private List<String> mImages;

    public ImagesAdapter(Context context, List<String> images) {
        mContext = context;
        mImages = images;
    }

    @Override
    public int getCount() {
        return (mImages != null) ? mImages.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return mImages.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String image = mImages.get(position);
        ViewHolder holder;
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_image, parent, false);
            holder = new ViewHolder();
            holder.mImageView = (ImageView) convertView.findViewById(R.id.image_view);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        Glide.with(mContext).load(image).placeholder(android.R.color.darker_gray).into(holder.mImageView);
        return convertView;
    }

    private static class ViewHolder {
        ImageView mImageView;
    }
}
