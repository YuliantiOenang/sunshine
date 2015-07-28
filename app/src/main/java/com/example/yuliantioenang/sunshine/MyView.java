package com.example.yuliantioenang.sunshine;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by yulianti.oenang on 7/24/2015.
 */
public class MyView extends View {
    Paint paint = new Paint();
    public MyView(Context context) {
        super(context);
    }

    public MyView (Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int hSpecMode = MeasureSpec.getMode(heightMeasureSpec);
        int hSpeckSize = MeasureSpec.getSize(heightMeasureSpec);
        int myHeight = hSpeckSize;

        if (hSpecMode == MeasureSpec.EXACTLY) {
            myHeight = hSpeckSize;
        } else if (hSpecMode == MeasureSpec.AT_MOST){

        }

        int wSpecMode = MeasureSpec.getMode(widthMeasureSpec);
        int wSpeckSize = MeasureSpec.getSize(widthMeasureSpec);
        int myWidth = wSpeckSize;

        if (wSpecMode == MeasureSpec.EXACTLY) {
            myWidth = wSpeckSize;
        } else if (wSpecMode == MeasureSpec.AT_MOST){

        }

        setMeasuredDimension(myWidth, myHeight);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawLine(0, 0, 20, 20, paint);
        canvas.drawLine(20, 0, 0, 20, paint);
    }
}
