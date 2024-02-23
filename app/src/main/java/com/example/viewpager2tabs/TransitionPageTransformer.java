package com.example.viewpager2tabs;

import android.view.View;

import androidx.viewpager2.widget.ViewPager2;

public class TransitionPageTransformer implements ViewPager2.PageTransformer {

    @Override
    public void transformPage(View page, float position) {
        position = Math.max(-1f, Math.min(1f, position));

        float rotation = position * 90;

        page.setPivotX(position < 0 ? page.getWidth() : 0);
        page.setPivotY(page.getHeight() * 0.5f);
        page.setRotationY(rotation);
    }
}

