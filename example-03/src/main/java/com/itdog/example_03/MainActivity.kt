package com.itdog.example_03

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.akki.circlemenu.CircleMenu
import com.akki.circlemenu.OnCircleMenuItemClicked
import com.itdog.example_03.bean.ActivityBean
import com.itdog.example_03.bean.ApplicationBean
import com.itdog.example_03.component.ActivityComponent
import com.itdog.example_03.component.DaggerActivityComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity(), OnCircleMenuItemClicked {

    @Inject
    lateinit var appBean1 : ApplicationBean

    @Inject
    lateinit var appBean2 : ApplicationBean

    @Inject
    lateinit var activityBean : ActivityBean

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val CircleMenu = findViewById<CircleMenu>(R.id.circle_menu)
        CircleMenu.setOnMenuItemClickListener(this)

        var activityComponent : ActivityComponent = DaggerActivityComponent.builder()
            .applicationComponent((application as DaggerApplication).appComponent).build()
        activityComponent.injectMainActivity(this)

        Log.i(TAG, "onCreate: appBean1 = ${appBean1.hashCode()}")
        Log.i(TAG, "onCreate: appBean2 = ${appBean2.hashCode()}")
        Log.i(TAG, "onCreate: activityBean = ${activityBean.hashCode()}")

        val otherClass : OtherClass = OtherClass(activityComponent)
        otherClass.showMessage()
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