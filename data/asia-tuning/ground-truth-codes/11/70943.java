String image_path="/mnt/sdcard/Pictures/20140419_205144.jpg";
    File file = new File(image_path);
    Uri uri = Uri.fromFile(file);
    Intent intent = new Intent(Intent.ACTION_SEND);
    intent.setType("image/*");
    intent.putExtra(Intent.EXTRA_STREAM, uri);
    startActivity(intent);;
intent.putExtra(Intent.EXTRA_TITLE, "Title");
    intent.putExtra(Intent.EXTRA_TEXT, text);
    intent.putExtra("com.pinterest.EXTRA_DESCRIPTION", "your description");;
