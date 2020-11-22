# circle-menu
This is a view group in which you can pass list of menu items and those items will be drawn under circular path.

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)


# Sample Apk

https://github.com/alokverma/circle-menu/blob/main/app/apk/app-debug.apk

# Demo 
  <p align="center">
  <img src="https://user-images.githubusercontent.com/7018540/99903342-c475f900-2ce9-11eb-81f6-a62fa9e742ab.gif" width="350" title="Circle Menu">
  
  <img src="https://user-images.githubusercontent.com/7018540/99903389-13239300-2cea-11eb-9890-7e128c2d7947.gif" width="350" title="Circle Menu">
  </p>


# How to Use
To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

gradle

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.alokverma:circle-menu:1.0'
	}

# Code 

       <com.akki.circlemenu.CircleMenu
          android:id="@+id/circle_menu"
          android:layout_width="match_parent"
          android:layout_height="match_parent"
          app:menu_background_color="@array/menu_back_colors"
          app:menu_close_duration="300"
          app:menu_icons="@array/menus"
          app:menu_open_duration="400"
          app:menu_radius="100dp">
        
  # Attributes that you can use to customize this view group
      app:menu_icons = arrays of vector/png menu items
      app:menu_background_color = array of background tint for those menus
      app:menu_open_duration = open animation duration of circle
      app:menu_close_duration = close animation duration of circle
      app:menu_radius= radius of circle
      
   In your activity/fragment, you can pass setOnMenuItemClickListener and you can get all menu item click event in onMenuItemClicked function.


If you like my work, please give it a star and let me know if you facing any query while implementing this.

# You can connect me at
[![Linkedin](https://i.stack.imgur.com/gVE0j.png) LinkedIn](https://www.linkedin.com/in/alok-verma-73882666/)
&nbsp;
