package com.itdog.example_02

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.akki.circlemenu.CircleMenu
import com.akki.circlemenu.OnCircleMenuItemClicked
import javax.inject.Inject

class MainActivity : AppCompatActivity(), OnCircleMenuItemClicked {

    @Inject
    lateinit var param1 : BeanNeedParam

    @Inject
    lateinit var param2 : BeanNeedParam

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as DaggerApplication).beanComponent.injectMainActivity(this)

        Log.i(TAG, "onCreate: params1 hashCode = ${param1.hashCode()}")
        Log.i(TAG, "onCreate: params2 hashCode = ${param2.hashCode()}")

        OtherClass((application as DaggerApplication).beanComponent)

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
        private const val TAG = "SingleTest"
    }
}