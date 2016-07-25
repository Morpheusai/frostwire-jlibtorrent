/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class stat {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected stat(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(stat obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_stat(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public stat() {
    this(libtorrent_jni.new_stat(), true);
  }

  public final static int upload_payload = libtorrent_jni.stat_upload_payload_get();
  public final static int upload_protocol = libtorrent_jni.stat_upload_protocol_get();
  public final static int download_payload = libtorrent_jni.stat_download_payload_get();
  public final static int download_protocol = libtorrent_jni.stat_download_protocol_get();
  public final static int upload_ip_protocol = libtorrent_jni.stat_upload_ip_protocol_get();
  public final static int download_ip_protocol = libtorrent_jni.stat_download_ip_protocol_get();
  public final static int num_channels = libtorrent_jni.stat_num_channels_get();

}
