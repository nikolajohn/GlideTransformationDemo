package cn.edu.zju.glidetest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import jp.wasabeef.glide.transformations.BlurTransformation;

import static com.bumptech.glide.request.RequestOptions.bitmapTransform;

public class BGtestActivity extends AppCompatActivity {
    private ImageView backimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bgtest);
        ImageView backimage = findViewById(R.id.back);

        /*backimage.buildDrawingCache();
        Bitmap sentBitmap = backimage.getDrawingCache();
        backimage.setImageBitmap(BlurBitmapUtil.blurBitmap(BGtestActivity.this, backimage.getDrawingCache(), 20.0f));*/
        Glide.with(this)
                .load(R.mipmap.back)
                .apply(bitmapTransform(new BlurTransformation(80)))
                .into(backimage);
    }
}
