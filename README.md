
TopSnack
==============================================================
#example

![image](https://github.com/NamelessPeople/TopSnack/blob/master/Screenshots/jie_tu_20170703_155317.png)
	
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
	TopSnackbar.make(v, R.layout.demo_layout, TopSnackbar.LENGTH_INDEFINITE, true)
                        .setLayoutAction(R.id.demo_text, new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(MainActivity.this, "花间提壶方大厨", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setLayoutAction(R.id.demo_text2, new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(MainActivity.this, "皇家特工楚乔传", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setLayoutAction(R.id.image, new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(MainActivity.this, "这是一张图片", Toast.LENGTH_SHORT).show();
                            }
                        }).show();
			
	TopSnackbar.make(v,"Hello",TopSnackbar.LENGTH_SHORT).show();
	
[![](https://jitpack.io/v/NamelessPeople/TopSnack.svg)](https://jitpack.io/#NamelessPeople/TopSnack)

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

	dependencies {
	        compile 'com.github.NamelessPeople:TopSnack:1.1.1'
	}





