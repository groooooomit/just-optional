package com.bfu.just.optional;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import just.optional.Optional;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Integer integer = Optional.of(100).map(integer1 -> integer1 * 100).orElse(200);
        ((TextView) findViewById(R.id.txt_hello))
                .setText(integer);
    }
}
