@SuppressWarnings("deprecation")
private static void generateNotification(Context context) {

    int icon = R.drawable.ic_launcher;
    long when = System.currentTimeMillis();
    NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
    Notification notification = new Notification(icon, "New Contact Added",
            when);

    String title = context.getString(R.string.app_name);

    Intent notificationIntent = new Intent(context, MainActivity.class);

    // set intent so it does not start a new activity
    notificationIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP
            | Intent.FLAG_ACTIVITY_SINGLE_TOP);

    int iUniqueId = (int) (System.currentTimeMillis() & 0xfffffff);

    PendingIntent intent = PendingIntent.getActivity(context, iUniqueId,
            notificationIntent, 0);
    notification.setLatestEventInfo(context, title, "New", intent);
    notification.flags |= Notification.FLAG_AUTO_CANCEL;

    // Play default notification sound
    notification.defaults |= Notification.DEFAULT_SOUND;

    // Vibrate if vibrate is enabled
    notification.defaults |= Notification.DEFAULT_VIBRATE;
    notificationManager.notify(2, notification);

};
