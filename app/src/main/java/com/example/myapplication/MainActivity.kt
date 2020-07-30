package com.example.myapplication

import android.animation.Animator
import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onClick(v: View?) {
        println("按钮被点击了")
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /**
         * Activity用来管理界面的生命周期和交互
         * 具体界面需要自己配置res->layout->   .xml
         * setContentView来关联layout布局文件和java/kotlin代码
         * 所有的资源文件都有一个ID和他对应 要访问这些资源R.Layout_main  (R是系统创建的类）
         */
        setContentView(R.layout.activity_main)

        //监听按钮被点击的事件
        //    mLoginBut.setOnClickListener(this)
        //  }
        // override fun onClick(v: View?) {
        //   println("按钮被点击了")
        //   mLoginBut.setOnClickListener(object : View.OnClickListener{
        mLoginBut.setOnClickListener {

            /*
            //apply also with run
            ObjectAnimator.ofFloat(imageView,"rotation",0f,360f).also {
            it.duration = 100
            it.repeatCount = 20
            it.start()
            it.addListener(object : Animator.AnimatorListener{
                override fun onAnimationRepeat(animation: Animator?) {

                }

                override fun onAnimationEnd(animation: Animator?) {
                    //界面跳转
                    startActivity(Intent(this@MainActivity, DetalActicity::class.java))
                }


                override fun onAnimationCancel(animation: Animator?) {
                }

                override fun onAnimationStart(animation: Animator?) {
                }
            })}
            */

            //apply直接在对象内部访问代码块 可以访问对象本身属性和方法
            ObjectAnimator.ofFloat(imageView,"rotation",0f,360f).apply {
                duration = 100
                repeatCount = 6
                start()
                addListener(object : Animator.AnimatorListener{

                    override fun onAnimationRepeat(animation: Animator?) {

                    }

                    override fun onAnimationEnd(animation: Animator?) {
                        //界面跳转
                        startActivity(Intent(this@MainActivity, DetalActicity::class.java))
                    }


                    override fun onAnimationCancel(animation: Animator?) {
                    }

                    override fun onAnimationStart(animation: Animator?) {
                    }
                })}
           /* //添加旋转动画 动画结束后跳转到下一个界面
            //动画种类：旋转 移动 缩放 透明度
            val anim = ObjectAnimator.ofFloat(imageView, "rotation", 0f, 360f)
            anim.duration = 100
            anim.repeatCount = 6
            anim.start()

            //监听动画结束事件
            anim.addListener(object : Animator.AnimatorListener {
                override fun onAnimationRepeat(animation: Animator?) {

                }

                override fun onAnimationEnd(animation: Animator?) {
                    //界面跳转
                    startActivity(Intent(this@MainActivity, DetalActicity::class.java))
                }


                override fun onAnimationCancel(animation: Animator?) {
                }

                override fun onAnimationStart(animation: Animator?) {
                }

            })

*/
        }
    }
}