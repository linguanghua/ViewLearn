package com.konka.customviewlearn.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ComposeShader;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.konka.customviewlearn.R;

/**
 * Created by Linxu on 2017-9-8.
 */

public class ComposeShaderView extends View {
    public ComposeShaderView(Context context) {
        super(context);
    }
    public ComposeShaderView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ComposeShaderView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

       drawComposeShaderSRC_OVER(canvas);
       // setLayerType(LAYER_TYPE_SOFTWARE, null);
       // drawComposeShaderDST_IN(canvas);
    }

    private void drawComposeShaderSRC_OVER(Canvas canvas){
        setLayerType(LAYER_TYPE_SOFTWARE, null);
        Bitmap bitman = BitmapFactory.decodeResource(getResources(), R.mipmap.batman);
        Shader bitmanShader = new BitmapShader(bitman, Shader.TileMode.CLAMP,Shader.TileMode.CLAMP);
        Bitmap yellobit = BitmapFactory.decodeResource(getResources(),R.mipmap.batman_logo);
        Shader yellobitShader = new BitmapShader(yellobit, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Shader  shader = new ComposeShader(bitmanShader,yellobitShader, PorterDuff.Mode.SRC_OVER);
        Paint paint = new Paint();
        paint.setShader(shader);
        canvas.drawCircle(330,330,300,paint);
    }

    private void commond(){}
    private void drawComposeShaderDST_IN(Canvas canvas){
       setLayerType(LAYER_TYPE_HARDWARE,null);
        Bitmap bitman = BitmapFactory.decodeResource(getResources(),R.mipmap.batman);
        Shader bitmanShader = new BitmapShader(bitman, Shader.TileMode.CLAMP,Shader.TileMode.CLAMP);
        Bitmap yellobit = BitmapFactory.decodeResource(getResources(),R.mipmap.batman_logo);
        Shader yellobitShader = new BitmapShader(yellobit, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Shader  shader = new ComposeShader(bitmanShader,yellobitShader, PorterDuff.Mode.DST_IN);
        Paint paint = new Paint();
        paint.setShader(shader);
        canvas.drawCircle(330,1000,300,paint);
    }
}
