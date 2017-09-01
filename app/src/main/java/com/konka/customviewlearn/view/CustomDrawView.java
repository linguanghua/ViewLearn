package com.konka.customviewlearn.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Linxu on 2017-9-1.
 */

public class CustomDrawView extends View {
    public CustomDrawView(Context context) {
        super(context);
    }

    public CustomDrawView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomDrawView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
//        paint.setStyle(Paint.Style.STROKE);
//        paint.setStrokeWidth(20);
//        paint.setColor(Color.RED);
//        paint.setAntiAlias(true);
//        canvas.drawCircle(50,100,50,paint);
//
//        paint.setStyle(Paint.Style.FILL);
//        paint.setColor(Color.BLUE);
//        paint.setAntiAlias(false);
//        canvas.drawCircle(300,100,50,paint);
//
//        paint.setStyle(Paint.Style.FILL);
//        paint.setColor(Color.GREEN);
//        paint.setAntiAlias(true);
//        canvas.drawCircle(500,100,50,paint);
//
//        paint.setStyle(Paint.Style.FILL);
//        paint.setColor(Color.GREEN);
//        canvas.drawRect(100,200,200,300,paint);
//
//        paint.setStyle(Paint.Style.STROKE);
//        paint.setColor(Color.RED);
//        paint.setStrokeWidth(10);
//        canvas.drawRect(300,200,500,400,paint);
//
//        paint.setColor(Color.RED);
//        paint.setStrokeCap(Paint.Cap.ROUND);
//        paint.setStrokeWidth(20);
//        canvas.drawPoint(500,500,paint);
//
//        paint.setColor(Color.GREEN);
//        paint.setStrokeWidth(30);
//        paint.setStrokeCap(Paint.Cap.SQUARE);
//        canvas.drawPoint(100,600,paint);
//
//        paint.setColor(Color.BLACK);
//        float points[] = {0, 0, 50, 50, 50, 100, 100, 50, 100, 100, 150, 50, 150, 100};
//        canvas.drawPoints(points,2,12,paint);
//
//        paint.setColor(Color.RED);
//        paint.setStyle(Paint.Style.FILL);
//        canvas.drawOval(100,600,800,900,paint);
//
//        float lpoints[] = {20, 20, 120, 20, 70, 20, 70, 120, 20, 120, 120, 120, 150, 20, 250, 20, 150, 20, 150, 120, 250, 20, 250, 120, 150, 120, 250, 120};
//        canvas.drawLines(lpoints, paint);
//
//        paint.setColor(Color.GREEN);
//        canvas.drawRoundRect(100,900,500,1100,50,50,paint);
//
//        paint.setColor(Color.BLUE);
//        paint.setStyle(Paint.Style.STROKE);
//        paint.setStrokeWidth(10);
//        canvas.drawRoundRect(550,900,950,1100,50,50,paint);
//
//        paint.setStyle(Paint.Style.FILL);
//        paint.setColor(Color.BLACK);
//        canvas.drawArc(100,1150,500,1450,100,100,true,paint);
//        canvas.drawArc(100,1150,500,1450,220,100,false,paint);
//        paint.setStyle(Paint.Style.STROKE);
//        canvas.drawArc(100,1150,500,1450,0,100,true,paint);
//        canvas.drawArc(100,1150,500,1450,0,-100,false,paint);
//
//
//        Path path = new Path();
//
//
//        paint.setColor(Color.BLUE);
//        path.addCircle(300,300,200,Path.Direction.CW);
//        Path path1 = new Path();
//
//        path1.addCircle(300,300,100,Path.Direction.CW);
//        path.op(path1, Path.Op.XOR);
//
//        canvas.drawPath(path,paint);

//        paint.setColor(Color.BLUE);
//        paint.setStyle(Paint.Style.STROKE);
//        paint.setStrokeWidth(10);
//        Path path = new Path();
//        path.moveTo(100,200);
//        path.lineTo(600,200);
//        path.lineTo(150,500);
//        path.lineTo(350,50);
//        path.lineTo(550,500);
//        path.lineTo(100,200);
//
//
//       canvas.drawPath(path,paint);

        canvas.drawColor(Color.rgb(80,110,121));

//        Path path = new Path();
        paint.setColor(Color.RED);
        canvas.drawArc(200,200,600,600,-180,120,true,paint);
        paint.setColor(Color.YELLOW);
        canvas.drawArc(210,210,610,610,-60,55,true,paint);
        paint.setColor(Color.rgb(160,32,240));
        canvas.drawArc(210,210,610,610,-7,10,true,paint);
        paint.setColor(Color.rgb(192,192,192));
        canvas.drawArc(210,210,610,610,5,5,true,paint);
        paint.setColor(Color.rgb(3,168,158));
        canvas.drawArc(210,210,610,610,10,65,true,paint);
        paint.setColor(Color.rgb(0,191,255));
        canvas.drawArc(210,210,610,610,78,102,true,paint);

        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        Path path = new Path();

        path.moveTo(100,750);
        path.lineTo(100,1450);
        path.lineTo(800,1450);
        canvas.drawPath(path,paint);

        paint.setColor(Color.rgb(84,255,159));
        paint.setStyle(Paint.Style.FILL);
        Path path1 = new Path();
        path1.setFillType(Path.FillType.WINDING);
        path1.addRect(150,1200,200,1450, Path.Direction.CW);
        path1.addRect(250,1300,300,1450, Path.Direction.CW);
        path1.addRect(350,1100,400,1450, Path.Direction.CW);
        path1.addRect(450,1250,500,1450, Path.Direction.CW);
        path1.addRect(550,1350,600,1450, Path.Direction.CW);
        path1.addRect(650,1150,700,1450, Path.Direction.CW);

        canvas.drawPath(path1,paint);

        paint.setColor(Color.BLACK);
        paint.setTextSize(30);
        canvas.drawText("1月",150,1490,paint);
        canvas.drawText("2月",250,1490,paint);
        canvas.drawText("3月",350,1490,paint);
        canvas.drawText("4月",450,1490,paint);
        canvas.drawText("5月",550,1490,paint);
        canvas.drawText("6月",650,1490,paint);

    }

}

