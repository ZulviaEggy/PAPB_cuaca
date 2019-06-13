package com.androstock.myweatherapp;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.RemoteViews;
import android.widget.TextView;

public class Widget extends AppWidgetProvider {

        @Override
        public void onUpdate (Context context, AppWidgetManager appWidgetManager,int[] appWidgetIds)
        {
            super.onUpdate(context, appWidgetManager, appWidgetIds);
            for (int appWidgetId : appWidgetIds) {
                Intent inten = new Intent(context, MainActivity.class);
                PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, inten, 0);

                RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget);
                views.setOnClickPendingIntent(R.id.btn, pendingIntent);

                appWidgetManager.updateAppWidget(appWidgetId, views);
            }
        }
    }

