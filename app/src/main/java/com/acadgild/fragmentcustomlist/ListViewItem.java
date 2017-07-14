package com.acadgild.fragmentcustomlist;

import android.graphics.drawable.Drawable;



public class ListViewItem {
    public final Drawable icon; // drawable for the ImageView
    public final String title;
    public final String desc;

    public Drawable getIcon() {
        return icon;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public ListViewItem(Drawable icon, String title, String desc) {
        this.icon = icon;
        this.title = title;
        this.desc = desc;

    }
}