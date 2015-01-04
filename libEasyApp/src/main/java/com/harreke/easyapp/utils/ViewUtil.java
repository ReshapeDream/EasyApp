package com.harreke.easyapp.utils;

import android.view.View;

/**
 * 由 Harreke（harreke@live.cn） 创建于 2014/12/31
 */
public class ViewUtil {
    public static float getFloatTag(View view) {
        return (view != null && view.getTag() != null && view.getTag() instanceof Float) ? (Float) view.getTag() : 0f;
    }

    public static float getFloatTag(View view, int key) {
        return (view != null && view.getTag(key) != null && view.getTag(key) instanceof Float) ? (Float) view.getTag(key) : 0f;
    }

    public static int getIntTag(View view) {
        return (view != null && view.getTag() != null && view.getTag() instanceof Integer) ? (Integer) view.getTag() : 0;
    }

    public static int getIntTag(View view, int key) {
        return (view != null && view.getTag(key) != null && view.getTag(key) instanceof Integer) ? (Integer) view.getTag(key) :
                0;
    }

    public static float getLongTag(View view) {
        return (view != null && view.getTag() != null && view.getTag() instanceof Long) ? (Long) view.getTag() : 0l;
    }

    public static float getLongTag(View view, int key) {
        return (view != null && view.getTag(key) != null && view.getTag(key) instanceof Long) ? (Long) view.getTag(key) : 0l;
    }

    public static Object getObjectTag(View view) {
        return (view != null && view.getTag() != null) ? view.getTag() : null;
    }

    public static Object getObjectTag(View view, int key) {
        return (view != null && view.getTag(key) != null) ? view.getTag(key) : null;
    }

    public static String getStringTag(View view) {
        return (view != null && view.getTag() != null && view.getTag() instanceof String) ? (String) view.getTag() : null;
    }

    public static String getStringTag(View view, int key) {
        return (view != null && view.getTag(key) != null && view.getTag(key) instanceof String) ? (String) view.getTag(key) :
                null;
    }
}
