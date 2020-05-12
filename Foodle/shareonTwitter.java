//needs a shareOnTwitter button alongside it. Let me know if it works out
/*
<Button
            android:id="@+id/shareOnTwitter"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="15dp"
            android:layout_gravity="center_horizontal"
            android:background="@color/colorWhite"
            android:textColor="@color/colorBlack"
            android:text="Tweet" />
*/


void shareOnTwitter()
{
	PackageManager pm=getPackageManager();
	try {
		Intent waIntent = new Intent(Intent.ACTION_SEND);
		waIntent.setType("text/plain");
		String text = "Insert Tweet Here";

		@SuppressWarnings("unused")
		PackageInfo info=pm.getPackageInfo("com.twitter.android", PackageManager.GET_META_DATA);
		//Check if package exists or not. If not then code 
		//in catch block will be called
		waIntent.setPackage("com.twitter.android");

		waIntent.putExtra(Intent.EXTRA_TEXT, text);
		startActivity(Intent.createChooser(waIntent, "Share with"));

	} catch (NameNotFoundException e) {
		Toast.makeText(this, "Twitter not Installed", Toast.LENGTH_SHORT)
		.show();
		return ;
	}  
	return ;	
}

