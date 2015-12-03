/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class udp_error_alert extends alert {
  private transient long swigCPtr;

  protected udp_error_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.udp_error_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(udp_error_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_udp_error_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public int type() {
    return libtorrent_jni.udp_error_alert_type(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.udp_error_alert_category(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.udp_error_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.udp_error_alert_message(swigCPtr, this);
  }

  public void setEndpoint(udp_endpoint value) {
    libtorrent_jni.udp_error_alert_endpoint_set(swigCPtr, this, udp_endpoint.getCPtr(value), value);
  }

  public udp_endpoint getEndpoint() {
    long cPtr = libtorrent_jni.udp_error_alert_endpoint_get(swigCPtr, this);
    return (cPtr == 0) ? null : new udp_endpoint(cPtr, false);
  }

  public void setError(error_code value) {
    libtorrent_jni.udp_error_alert_error_set(swigCPtr, this, error_code.getCPtr(value), value);
  }

  public error_code getError() {
    long cPtr = libtorrent_jni.udp_error_alert_error_get(swigCPtr, this);
    return (cPtr == 0) ? null : new error_code(cPtr, false);
  }

  public final static int priority = libtorrent_jni.udp_error_alert_priority_get();
  public final static int alert_type = libtorrent_jni.udp_error_alert_alert_type_get();
  public final static int static_category = libtorrent_jni.udp_error_alert_static_category_get();
}
