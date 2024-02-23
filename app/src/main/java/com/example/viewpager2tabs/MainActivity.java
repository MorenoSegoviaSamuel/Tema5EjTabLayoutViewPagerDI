package com.example.viewpager2tabs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager2 viewPager = findViewById(R.id.pager);
        TabLayout tabs = findViewById(R.id.tabs);

        TransitionPageTransformer transitionPageTransformer = new TransitionPageTransformer();
        viewPager.setPageTransformer(transitionPageTransformer);


        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager(),
                getLifecycle());
        viewPager.setAdapter(sectionsPagerAdapter);

        new TabLayoutMediator(tabs, viewPager, (tab, position) -> {
            tab.setText("TAB " + (position + 1));
        }).attach();

    }
}