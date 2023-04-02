package com.example.buoi6_fragmnent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var fragment : FrameLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // ánh xạ
         fragment = findViewById(R.id.fragmntOne)
        val fragment = FragmentOne()

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fragmntOne, fragment, fragment.tag).commitAllowingStateLoss()



    }

    private fun toasMake(){
        Toast.makeText(this, "hihi", Toast.LENGTH_SHORT).show()
    }

}