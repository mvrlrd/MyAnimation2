package ru.mvrlrd.myanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import ru.mvrlrd.myanimation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.image1.setOnClickListener {
            it.isSelected = !it.isSelected
        }
        binding.image2.setOnClickListener {
            it.isSelected = !it.isSelected
        }
        binding.image3.setOnClickListener {
            it.isSelected = !it.isSelected
        }
        binding.image4.setOnClickListener {
            it.isSelected = !it.isSelected
        }
        binding.image5.setOnClickListener {
            it.isSelected = !it.isSelected
        }
        binding.image6.setOnClickListener {
            it.isSelected = !it.isSelected
        }
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        binding.motionContainer.transitionToStart()
        return super.onTouchEvent(event)
    }
}