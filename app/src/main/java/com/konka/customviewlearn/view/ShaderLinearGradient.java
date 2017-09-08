package com.konka.customviewlearn.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Linxu on 2017-9-8.
 * paint使用Shader的子类设置颜色
 * Shader设置颜色效果，LinearGradient 线性渐变部分
 */

public class ShaderLinearGradient extends View {
    public ShaderLinearGradient(Context context) {
        super(context);
    }

    public ShaderLinearGradient(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ShaderLinearGradient(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

       // setColor(canvas);
       // setARGB(canvas);

        setShader(canvas);
    }

    /**
     * 使用Shader设置颜色之LinearGradient线性渐变
     * @param canvas
     */
    private void setShader(Canvas canvas){
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextSize(30);
        //使用CLAMP模式，在端点之外延续端点处的颜色
        canvas.drawText("CLAMP",70,90,paint);
        Shader shader = new LinearGradient(100,100,500,500,Color.parseColor("#E91E63"),
                Color.parseColor("#2196F3"),Shader.TileMode.CLAMP);
        paint.setShader(shader);
        canvas.drawCircle(300,300,250,paint);

        //使用MIRROR模式，它是镜像模式
        canvas.drawText("MIRROR",70,630,paint);


        shader = new LinearGradient(280,680,425,830,Color.parseColor("#E91E63"),
                Color.parseColor("#2196F3"),Shader.TileMode.MIRROR);
        paint.setShader(shader);
        canvas.drawCircle(300,850,250,paint);

        //使用REPEAT模式，重复模式
        canvas.drawText("REPEAT",650,1050,paint);
        shader = new LinearGradient(800,1500,1000,1700,Color.parseColor("#E91E63"),
                Color.parseColor("#2196F3"),Shader.TileMode.REPEAT);
        paint.setShader(shader);
        canvas.drawCircle(750,1300,250,paint);
    }

    /**
     * 使用setARGB来设置颜色
     * @param canvas
     */
    private void setARGB(Canvas canvas){
        Paint paint = new Paint();
        paint.setARGB(100, 255, 0, 0);
        canvas.drawRect(0,0,200,200,paint);
        paint.setARGB(100,0,0,0);
        canvas.drawLine(0,0,200,200,paint);
    }

    /**
     * 直接使用setColor方法设置颜色
     * @param canvas
     */
    private void setColor(Canvas canvas){
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#009688"));
        canvas.drawRect(30, 30, 230, 180, paint);

        paint.setStrokeWidth(20);
        paint.setColor(Color.parseColor("#FF9800"));
        canvas.drawLine(300, 30, 450, 180, paint);

        paint.setTextSize(30);
        paint.setColor(Color.parseColor("#E91E63"));
        canvas.drawText("HenCoder", 500, 130, paint);
    }
}
