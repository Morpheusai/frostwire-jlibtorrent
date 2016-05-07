/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class listen_succeeded_alert extends alert {
  private transient long swigCPtr;

  protected listen_succeeded_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.listen_succeeded_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(listen_succeeded_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_listen_succeeded_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public int type() {
    return libtorrent_jni.listen_succeeded_alert_type(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.listen_succeeded_alert_category(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.listen_succeeded_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.listen_succeeded_alert_message(swigCPtr, this);
  }

  public void setEndpoint(tcp_endpoint value) {
    libtorrent_jni.listen_succeeded_alert_endpoint_set(swigCPtr, this, tcp_endpoint.getCPtr(value), value);
  }

  public tcp_endpoint getEndpoint() {
    long cPtr = libtorrent_jni.listen_succeeded_alert_endpoint_get(swigCPtr, this);
    return (cPtr == 0) ? null : new tcp_endpoint(cPtr, false);
  }

  public void setSock_type(listen_succeeded_alert.socket_type_t value) {
    libtorrent_jni.listen_succeeded_alert_sock_type_set(swigCPtr, this, value.swigValue());
  }

  public listen_succeeded_alert.socket_type_t getSock_type() {
    return listen_succeeded_alert.socket_type_t.swigToEnum(libtorrent_jni.listen_succeeded_alert_sock_type_get(swigCPtr, this));
  }

  public final static class socket_type_t {
    public final static listen_succeeded_alert.socket_type_t tcp = new listen_succeeded_alert.socket_type_t("tcp");
    public final static listen_succeeded_alert.socket_type_t tcp_ssl = new listen_succeeded_alert.socket_type_t("tcp_ssl");
    public final static listen_succeeded_alert.socket_type_t udp = new listen_succeeded_alert.socket_type_t("udp");
    public final static listen_succeeded_alert.socket_type_t i2p = new listen_succeeded_alert.socket_type_t("i2p");
    public final static listen_succeeded_alert.socket_type_t socks5 = new listen_succeeded_alert.socket_type_t("socks5");
    public final static listen_succeeded_alert.socket_type_t utp_ssl = new listen_succeeded_alert.socket_type_t("utp_ssl");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static socket_type_t swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + socket_type_t.class + " with value " + swigValue);
    }

    private socket_type_t(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private socket_type_t(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private socket_type_t(String swigName, socket_type_t swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static socket_type_t[] swigValues = { tcp, tcp_ssl, udp, i2p, socks5, utp_ssl };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static int priority = libtorrent_jni.listen_succeeded_alert_priority_get();
  public final static int alert_type = libtorrent_jni.listen_succeeded_alert_alert_type_get();
  public final static int static_category = libtorrent_jni.listen_succeeded_alert_static_category_get();
}
