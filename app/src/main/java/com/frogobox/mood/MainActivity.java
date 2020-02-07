package com.frogobox.mood;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.frogobox.mood.base.ui.BaseActivity;

public class MainActivity extends BaseActivity {

    int i = 0;
    private TextView mTextViewMood;
    private ImageView mImageViewMood;
    private Button mButtonMood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextViewMood = findViewById(R.id.textViewMood);
        mImageViewMood = findViewById(R.id.imageViewMood);
        mButtonMood = findViewById(R.id.button_mood);

        mButtonMood.setOnClickListener(v -> {
            if (i < 4) {
                i++;
                switch (i) {
                    case 0:
                        mImageViewMood.setVisibility(View.INVISIBLE);
                        break;
                    case 1:
                        mImageViewMood.setVisibility(View.VISIBLE);
                        mImageViewMood.setImageResource(R.drawable.gambar_1);
                        mTextViewMood.setText(getText(R.string.text_happy));
                        break;
                    case 2:
                        mImageViewMood.setVisibility(View.VISIBLE);
                        mImageViewMood.setImageResource(R.drawable.gambar_2);
                        mTextViewMood.setText(getText(R.string.text_cheerful));
                        break;
                    case 3:
                        mImageViewMood.setVisibility(View.VISIBLE);
                        mImageViewMood.setImageResource(R.drawable.gambar_3);
                        mTextViewMood.setText(getText(R.string.text_fantastic));
                        i = 0;
                        break;
                    default:
                        break;
                }
            }


        });

    }
}
