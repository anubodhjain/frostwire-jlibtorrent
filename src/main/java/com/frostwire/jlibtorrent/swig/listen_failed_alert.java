/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class listen_failed_alert extends alert {
  private transient long swigCPtr;

  protected listen_failed_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.listen_failed_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(listen_failed_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_listen_failed_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public int type() {
    return libtorrent_jni.listen_failed_alert_type(swigCPtr, this);
  }

  public alert_category_t category() {
    return new alert_category_t(libtorrent_jni.listen_failed_alert_category(swigCPtr, this), true);
  }

  public String what() {
    return libtorrent_jni.listen_failed_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.listen_failed_alert_message(swigCPtr, this);
  }

  public String listen_interface() {
    return libtorrent_jni.listen_failed_alert_listen_interface(swigCPtr, this);
  }

  public error_code getError() {
    long cPtr = libtorrent_jni.listen_failed_alert_error_get(swigCPtr, this);
    return (cPtr == 0) ? null : new error_code(cPtr, false);
  }

  public void setOp(operation_t value) {
    libtorrent_jni.listen_failed_alert_op_set(swigCPtr, this, value.swigValue());
  }

  public operation_t getOp() {
    return operation_t.swigToEnum(libtorrent_jni.listen_failed_alert_op_get(swigCPtr, this));
  }

  public socket_type_t getSocket_type() {
    return socket_type_t.swigToEnum(libtorrent_jni.listen_failed_alert_socket_type_get(swigCPtr, this));
  }

  public int getPort() {
    return libtorrent_jni.listen_failed_alert_port_get(swigCPtr, this);
  }

  public address get_address() {
    return new address(libtorrent_jni.listen_failed_alert_get_address(swigCPtr, this), true);
  }

  public final static int priority = libtorrent_jni.listen_failed_alert_priority_get();
  public final static int alert_type = libtorrent_jni.listen_failed_alert_alert_type_get();
  public final static alert_category_t static_category = new alert_category_t(libtorrent_jni.listen_failed_alert_static_category_get(), false);
}
