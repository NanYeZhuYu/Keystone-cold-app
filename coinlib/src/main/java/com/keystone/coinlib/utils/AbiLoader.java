package com.keystone.coinlib.utils;

import android.content.Context;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.text.TextUtils;
import android.util.Log;

import com.keystone.coinlib.Coinlib;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

public class AbiLoader {
    private static final String TAG = "AbiLoader";

    public static String getContentFromSdCard(String path, String fileName) {
        if (TextUtils.isEmpty(externalSDCardPath())) {
            Log.i(TAG, "sdCard is not exists");
            return "";
        }
        File file = new File(externalSDCardPath() + File.separator + path, fileName + ".json");
        if (!file.exists()) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bfr = null;
        try {
            bfr = new BufferedReader(new FileReader(file));
            String line = bfr.readLine();
            while (line != null) {
                stringBuilder.append(line);
                stringBuilder.append("\n");
                line = bfr.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bfr != null) {
                try {
                    bfr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return stringBuilder.toString();
    }

    private static String externalSDCardPath() {
        String sdCardPath = "";
        try {
            StorageManager storageManager = (StorageManager) Coinlib.sInstance.getContext().getSystemService(Context.STORAGE_SERVICE);

            // Android N started to have this method
            List<StorageVolume> storageVolumes = storageManager.getStorageVolumes();
            Class<?> volumeClass = Class.forName("android.os.storage.StorageVolume");
            Method getPath = volumeClass.getDeclaredMethod("getPath");
            getPath.setAccessible(true);
            StorageVolume storageVolume = storageVolumes.get(storageVolumes.size() - 1);
            sdCardPath = (String) getPath.invoke(storageVolume);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sdCardPath;
    }
}
