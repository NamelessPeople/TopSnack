
TopSnack
==============================================================
#example


	
#自定义布局

	<view xmlns:android="http://schemas.android.com/apk/res/android"
    class="com.example.topsnackbar.TopSnackbar$TopSnackbarContentLayout"
    android:layout_width="match_parent"
    android:layout_height="wrap_content">
    --自己的内容外包裹该view--
	</view>
#Java

	/**
	*最后一个参数 true 在顶部显示；false在底部显示
	**/
	TopSnackbar.make(v,R.layout.my_layout,TopSnackbar.LENGTH_INDEFINITE,true)
	.setLayoutText(R.id.text1, "传入内容")
	.show();


	/**
	*弹出系统Snackbar 顶部弹出
	**/	
	TopSnackbar.make(v,"Hello",TopSnackbar.LENGTH_SHORT).show();
	
[![](https://jitpack.io/v/NamelessPeople/TopSnack.svg)](https://jitpack.io/#NamelessPeople/TopSnack)

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

	dependencies {
	        compile 'com.github.NamelessPeople:TopSnack:1.6'
	}







