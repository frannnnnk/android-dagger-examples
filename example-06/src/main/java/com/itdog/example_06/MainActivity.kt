package com.itdog.example_06

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.akki.circlemenu.CircleMenu
import com.akki.circlemenu.OnCircleMenuItemClicked
import javax.inject.Inject

class MainActivity : BaseActivity(), OnCircleMenuItemClicked {

    @Inject
    lateinit var a2 : A2

    @Inject
    lateinit var b2 : B2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val CircleMenu = findViewById<CircleMenu>(R.id.circle_menu)
        CircleMenu.setOnMenuItemClickListener(this)

        Log.i(TAG, "onCreate: a2 = ${a2.hashCode()}")
        Log.i(TAG, "onCreate: b2 = ${b2.hashCode()}")
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