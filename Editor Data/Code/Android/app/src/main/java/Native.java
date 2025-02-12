/******************************************************************************/
package com.esenthel;
import android.location.Location;
import java.nio.ByteBuffer;
import java.util.ArrayList;
/******************************************************************************/
public class Native
{
   public static native void   key            (int chr, int key_code);
   public static native void   text           (String text, int start, int end);
   public static native void   resized        ();
   public static native void   setRects       (int l, int t, int r, int b, int kb_h);
   public static native void   connected      (boolean inapp_supported, boolean subs_supported);
   public static native String getStr         (long user  , int index);
   public static native void   listItem       (long user  , String sku, String name, String desc , String price, boolean sub);
   public static native void   listPurchase   (long user  , String sku, String data, String token, long date);
   public static native void   purchased      (int  result, String sku, String data, String token, long date);
   public static native void   licenseTest    (int  result);
   public static native void   location       (boolean gps, Location location);
   public static native void   adState        (boolean banner, int state);
   public static native void   bannerSize     (int width, int height);
   public static native void   facebookMe     (          String  id ,           String  name, String email);
   public static native void   facebookFriends(ArrayList<String> ids, ArrayList<String> names);
   public static native void   facebookPost   (int result);
   public static native void   chartboost     (int result);
   public static native void   audioRecord    (long sound_record, ByteBuffer buf, int size);
   public static native void   closedError    ();
   public static native void   notification   (int id, boolean selected);
   public static native void   deviceAdded    (int device_id);
   public static native void   deviceRemoved  (int device_id);
   public static native void   drop           (int fd);

   static
   {
      System.loadLibrary("Project");
   }
}
/******************************************************************************/
