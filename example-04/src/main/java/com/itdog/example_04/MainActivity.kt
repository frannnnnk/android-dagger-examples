package com.itdog.example_04

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.akki.circlemenu.CircleMenu
import com.akki.circlemenu.OnCircleMenuItemClicked
import javax.inject.Inject
class MainActivity : AppCompatActivity(), OnCircleMenuItemClicked {

    @Inject
    lateinit var activityBean1: ActivityBean

    @Inject
    lateinit var activityBean2: ActivityBean

    @Inject
    lateinit var appBean : ApplicationBean

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as DaggerApplication).apply {
            appComponent.activityComponent().injectMainActivity(this@MainActivity)
        }

        Log.i(TAG, "onCreate: activityBean1 = ${activityBean1.hashCode()}")
        Log.i(TAG, "onCreate: activityBean2 = ${activityBean2.hashCode()}")
        Log.i(TAG, "onCreate: appBean = ${appBean.hashCode()}")

        OtherClass((application as DaggerApplication).appComponent)

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
        private const val TAG = "Dagger"
    }
}