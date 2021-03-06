package cn.xq.jltx.animationdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/**
 * @author jltxseo
 *         Created by junlintianxia on 2016年03月25日.
 */

public class CustomAnimFrameLayout extends FrameLayout{
    /**
     * 上下滑动的自定义propertyName
     */
    private float yFraction = 0;
    /**
     * 左右滑动的自定义propertyName
     */
    private float xFraction = 0;
    private ViewTreeObserver.OnPreDrawListener preDrawListener = null;

    public CustomAnimFrameLayout(Context context) {
        super(context);
    }

    public CustomAnimFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomAnimFrameLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * 垂直方向滑动
     * @param fraction
     */
    public void setYFraction(float fraction){
        this.yFraction = fraction;
        if(getHeight() == 0){
            if(preDrawListener == null){
                preDrawListener = new ViewTreeObserver.OnPreDrawListener(){
                    @Override
                    public boolean onPreDraw() {
                        getViewTreeObserver().removeOnPreDrawListener(preDrawListener);
                        setYFraction(yFraction);
                        return false;
                    }
                };
                getViewTreeObserver().addOnPreDrawListener(preDrawListener);
            }
            return;
        }

        float translationY = getHeight() * fraction;
        Log.v("translationY set", translationY + " ");
//        setTranslationY(translationY); //这种方法好一些
        setY(translationY); //这种方法好一些
    }

    public float getYFraction() {
        return this.yFraction;
    }

    /**
     * 水平方向滑动
     * @param fraction
     */
    public void setXFraction(float fraction) {
        this.xFraction = fraction;
        if(getHeight() == 0){
            if(preDrawListener == null){
                preDrawListener = new ViewTreeObserver.OnPreDrawListener(){
                    @Override
                    public boolean onPreDraw() {
                        getViewTreeObserver().removeOnPreDrawListener(preDrawListener);
                        setXFraction(xFraction);
                        return false;
                    }
                };
                getViewTreeObserver().addOnPreDrawListener(preDrawListener);
            }
            return;
        }
        float translationX = getWidth() * fraction;
        Log.v("translationX set", translationX + " ");
//        setTranslationX(translationX);
        setX(translationX);

    }

    public float getXFraction() {
        return this.xFraction;
    }
}
