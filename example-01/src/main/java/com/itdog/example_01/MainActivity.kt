package com.itdog.example_01

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.akki.circlemenu.CircleMenu
import com.akki.circlemenu.OnCircleMenuItemClicked
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity(), OnCircleMenuItemClicked {

    @Inject
    @Named("zs")
    lateinit var studentZs : Student

    @Inject
    @Named("zs")
    lateinit var studentZs2 : Student

    @Inject
    @Named("ls")
    lateinit var studentLs : Student

    @Inject
    @Named("ls")
    lateinit var studentLs2 : Student

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerStudentComponent.create().injectMainActivity(this)

        Log.i(Companion.TAG, "onCreate: zs: " + studentZs.hashCode())
        Log.i(Companion.TAG, "onCreate: zs2: " + studentZs2.hashCode())
        Log.i(Companion.TAG, "onCreate: ls: " + studentLs.hashCode())
        Log.i(Companion.TAG, "onCreate: ls2: " + studentLs2.hashCode())

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