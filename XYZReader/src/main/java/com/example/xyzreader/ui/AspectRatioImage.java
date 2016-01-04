package com.example.xyzreader.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by Elias Myronidis on 4/1/16.
 */
public class AspectRatioImage extends ImageView {

    public AspectRatioImage(Context context) {
        super(context);
    }

    public AspectRatioImage(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AspectRatioImage(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        int ratioHeight;
        int ratioHeightSpec;

        // If phone is in portrait mode make the image aspect ratio 3/4,
        // else make the image aspect ratio 1/4

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            ratioHeight = MeasureSpec.getSize(widthMeasureSpec) * 3 / 4;
            ratioHeightSpec = MeasureSpec.makeMeasureSpec(ratioHeight, MeasureSpec.EXACTLY);
        }
        else {
            ratioHeight = MeasureSpec.getSize(widthMeasureSpec) * 1 / 4;
            ratioHeightSpec = MeasureSpec.makeMeasureSpec(ratioHeight, MeasureSpec.EXACTLY);
        }

        super.onMeasure(widthMeasureSpec, ratioHeightSpec);
    }
}
