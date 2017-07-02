//package com.example.jarro.vega2017summer;
//
//import android.animation.ObjectAnimator;
//import android.animation.TypeEvaluator;
//import android.animation.ValueAnimator;
//import android.support.v7.app.AppCompatActivity;
//
//import butterknife.OnClick;
//
///**
// * Created by jarro on 6/28/2017.
// */
//
//public class AnimatorActivity extends BaseActivity{
//    private ValueAnimator repeatAnimator;
//
//    @OnClick(R.id.animator_trans)
//    private void trans(){
//        ObjectAnimator animator = ObjectAnimator.ofFloat(tv,"translationX",0,120);
//        animator.setDuration(2000);
//        animator.start();
//    }
//    @OnClick(R.id.animator_scale)
//    private void scale(){
//        ObjectAnimator animator = ObjectAnimator.ofFloat(tv,"scaleY",0,3,1,2,5,1);
//        animator.setDuration(2000);
//        animator.start();
//    }
//    @OnClick(R.id.animator_)
//    private void scale{
//        ObjectAnimator animator = ObjectAnimator.ofFloat(tv,"scaleY",0,3,1,2,5,1);
//        animator.setDuration(2000);
//        animator.start();
//    }
//    @OnClick(R.id.animator_alpha)
//    private void alpha(){
//        ObjectAnimator animator = ObjectAnimator.ofFloat(tv,"Alpha",1,0,1);
//        animator.setDuration(2000);
//        animator.start();
//    }
//    @OnClick(R.id.animator_rotation)
//    private void rotation(){
//        ObjectAnimator animator = ObjectAnimator.ofFloat(tv,"scaleY",0,360,0);
//        animator.setDuration(4000);
//        animator.start();
//    }
//    @Onclick(R.id.animator_color)
//    public void color(){
//
//    }
//    private class CharEvaluator implements TypeEvaluator<Character>{
//        @Override
//        public Character evaluate(float fraction,Character startValue,Character endVlaue){
//            int startInt = (int)startValue;
//
//        }
//    }
//    public class ArgbEvaluator implements TypeEvaluator{
//        public Object evaluate(float friction, Object startValue, Object endValue){
//            int startInt = (Integer) startValue;
//            int StartA = (startInt >> 24);
//            int StartR = (startInt >> 16)& 0xff;
//            int StartG = (startInt >> 8)& 0xff;
//            int StartB = startInt & 0xff;
//
//            int endInt = (Integer) endValue;
//            int endA = (endInt >> 24);
//            int endR = (endInt >> 16) & 0xff;
//            int endG = (endInt >> 8)& 0xff;
//            int endB = endInt & 0xff;
//            return
//        }
//    }
//
//}
