package com.itdog.example_05

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.akki.circlemenu.CircleMenu
import com.akki.circlemenu.OnCircleMenuItemClicked
import com.itdog.example_05.component.DaggerMainActivityComponent
import com.itdog.example_05.module.MyModule2
import javax.inject.Inject

class MainActivity : AppCompatActivity(), OnCircleMenuItemClicked {

    @Inject
    lateinit var test1 : Test3

    @Inject
    lateinit var test2 : Test3

    @Inject
    lateinit var test3 : Map<String, Long>

    @Inject
    lateinit var test4 : Map<MyModule2.MyEnum, String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var appComponent = (applicationContext as DemoApplication).applicationComponent
        DaggerMainActivityComponent.builder()
            .applicationComponent(appComponent).build().inject(this)

        val CircleMenu = findViewById<CircleMenu>(R.id.circle_menu)
        CircleMenu.setOnMenuItemClickListener(this)
    }

    override fun onMenuItemClicked(id: Int) {
        when (id) {
            R.drawable.ic_baseline_delete_forever_24 -> showToast("Delete Button clicked")
            R.drawable.ic_baseline_person_search_24 -> showToast("Person Button clicked")
            R.drawable.ic_baseline_settings_24 -> showToast("Setting Button clicked")
            R.drawable.ic_baseline_edit_location_24 -> showToast("Location Button clicked")
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

    }

    companion object {
        private const val TAG = "MainActivity"
    }
}