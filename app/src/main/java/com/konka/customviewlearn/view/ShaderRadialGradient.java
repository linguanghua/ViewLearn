package com.konka.customviewlearn.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Linxu on 2017-9-8.
 */

public class ShaderRadialGradient extends View {
    public ShaderRadialGradient(Context context) {
        super(context);
    }

    public ShaderRadialGradient(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ShaderRadialGradient(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //辐射渐变
        drawShaderRadialGradientCLAMP(canvas);
        drawShaderRadialGradientMIRROR(canvas);
        drawShaderRadialGradientREPEAT(canvas);

        //扫描渐变
        drawShaderSweepGradient(canvas);
    }

    private void drawShaderRadialGradientCLAMP(Canvas canvas){
        Paint paint = new Paint();
        Shader shader = new RadialGradient(300,300,50, Color.parseColor("#E91E63"),Color.parseColor("#2196F3"),Shader.TileMode.CLAMP);
        paint.setShader(shader);
        canvas.drawCircle(300,300,250,paint);
    }
    private void drawShaderRadialGradientMIRROR(Canvas canvas){
        Paint paint = new Paint();
        Shader shader = new RadialGradient(300,800,50, Color.parseColor("#E91E63"),Color.parseColor("#2196F3"),Shader.TileMode.MIRROR);
        paint.setShader(shader);
        canvas.drawCircle(300,800,250,paint);
    }
    private void drawShaderRadialGradientREPEAT(Canvas canvas){
        Paint paint = new Paint();
        Shader shader = new RadialGradient(300,1320,50, Color.parseColor("#E91E63"),Color.parseColor("#2196F3"),Shader.TileMode.REPEAT);
        paint.setShader(shader);
        canvas.drawCircle(300,1320,250,paint);
    }



    private void drawShaderSweepGradient(Canvas canvas){
        Paint paint = new Paint();
        Shader shader = new SweepGradient(820,800,Color.parseColor("#E91E63"),Color.parseColor("#2196F3"));
        paint.setShader(shader);
        canvas.drawCircle(820,800,250,paint);
    }
}
