public void clearNotification() {
    NotificationManager notificationManager = (NotificationManager) mContext.getSystemService(Context.NOTIFICATION_SERVICE);
    notificationManager.cancel(NOTIFICATION_ID);
};
