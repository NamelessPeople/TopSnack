TopSnackbar.make(v,"Hello",TopSnackbar.LENGTH_SHORT).show();
 
 
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}

dependencies {
        compile 'com.github.NamelessPeople:TopSnack:1.0'
}

