package com.hxxc.user.app.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by chenqun on 2016/12/19.
 */

public class RecyclerImageView extends ImageView {
    public RecyclerImageView(Context context) {
        super(context);
    }

    public RecyclerImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RecyclerImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setImageDrawable(null);
    }
}
