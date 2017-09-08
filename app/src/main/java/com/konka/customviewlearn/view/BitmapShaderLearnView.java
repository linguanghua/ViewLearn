package com.konka.customviewlearn.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.konka.customviewlearn.R;

/**
 * Created by Linxu on 2017-9-8.
 * 用 Bitmap 来着色。其实也就是用 Bitmap 的像素来作为图形或文字的填充。
 */

public class BitmapShaderLearnView extends View {
    private Bitmap bitmap;
    public BitmapShaderLearnView(Context context) {
        super(context);
    }

    public BitmapShaderLearnView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public BitmapShaderLearnView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.bitman);

        drawBitmapShaderCLAMP(canvas);
        drawBitmapShaderMIRROR(canvas);
        drawBitmapShaderREPEAT(canvas);
    }
    private void drawBitmapShaderCLAMP(Canvas canvas){
        Shader shader = new BitmapShader(bitmap,Shader.TileMode.CLAMP,Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        paint.setShader(shader);
        //canvas.drawCircle(300,300,200,paint);
        canvas.drawRect(0,0,1000,500,paint);
    }

    private void drawBitmapShaderMIRROR(Canvas canvas){
        Shader shader = new BitmapShader(bitmap,Shader.TileMode.MIRROR,Shader.TileMode.MIRROR);
        Paint paint = new Paint();
        paint.setShader(shader);
        //canvas.drawCircle(300,300,200,paint);
        canvas.drawRect(0,550,1000,1050,paint);
    }

    private void drawBitmapShaderREPEAT(Canvas canvas){
        Shader shader = new BitmapShader(bitmap,Shader.TileMode.REPEAT,Shader.TileMode.REPEAT);
        Paint paint = new Paint();
        paint.setShader(shader);
        //canvas.drawCircle(300,300,200,paint);
        canvas.drawRect(0,1100,1000,1600,paint);
    }
}
