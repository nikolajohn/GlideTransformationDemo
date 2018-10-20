package cn.edu.zju.glidetest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class BGtestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bgtest);
        ImageView backimage = findViewById(R.id.back);

        /*Glide.with(this)
                .load(R.mipmap.back)
                .apply(bitmapTransform(new BlurTransformation(250)))
                .into(backimage);*/
    }
}
